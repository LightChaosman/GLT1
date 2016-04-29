/**
 * 
 */
package regex;

import java.util.Iterator;
import java.util.StringTokenizer;

import dk.brics.automaton.RegExp;
import dk.brics.automaton.RunAutomaton;

/**
 *
 */
public class PicoRec {
	
	/**
	 * Execute test cases
	 * @param args
	 */
	public static void main(String[] args) {
		// Simple
		doTest("empty",				"", false);
		doTest("random string",		"dkwaojqpo2314321", false);
		doTest("simple program",	"begin declare a, | c := a + b; end", true);
		doTest("empty program",		"begin declare | end", true);
		doTest("only statements",	"begin declare | a := 1; end", true);
		doTest("only decls",		"begin declare a, | end", true);
		doTest("minimal program",	"begindeclare|end", true);
		
		// General
		doTest("statement mix1",	"begin declare | c := 1 + b; end", true);
		doTest("statement mix2",	"begin declare | c := x4 + 4; end", true);
		doTest("statement mix3",	"begin declare | c := x4 + 04; end", true);
		doTest("statement recur",	"begin declare | a := b + c; z := 1 + 3; end", true);
		doTest("decls recur",		"begin declare a, b, | g := 6; end", true);
		doTest("number id mix1",	"begin declare | 1 := a; end", false);
		doTest("number id mix2",	"begin declare | a := 1a; end", false);
		doTest("caps keywords",		"BEGIN DECLARE | C := 1 + B; END", false);
		doTest("caps ids",			"begin declare | aA := 1; end", false);
		
		// Statements
		doTest("statement +-recursion 1",		"begin declare | a := a + a + a + a; end", true);
		doTest("statement +-recursion 2",		"begin declare | a := a + a + a ++ a; end", false);
		doTest("statement *-recusrion 1",		"begin declare | a := a * a * a * a; end", true);
		doTest("statement *-recusrion 2",		"begin declare | a := a * a * a ** a; end", false);
		doTest("statement +/*-recusrion 1", 	"begin declare | a := a + a * a + a; end", true);
		doTest("statement */+-recusrion 2", 	"begin declare | a := a * a + a * a; end", true);
		doTest("statement */+-recusrion 3", 	"begin declare | a := a *+ a; end", false);
		
		doTest("statement --recusrion 1", 		"begin declare | a := -a; end", true);
		doTest("statement --recusrion 1 bra",	"begin declare | a := -(a)+-(a); end", true);
		doTest("statement --recusrion 2", 		"begin declare | a := --a; end", true);
		doTest("statement --recusrion 3", 		"begin declare | a := ---a; end", true);
		
		doTest("statement -/+-recusrion", 		"begin declare | a := a +- a; end", true);
		doTest("statement -/+-recusrion", 		"begin declare | a := a -+ a; end", false);
		doTest("statement -/+-recusrion", 		"begin declare | a := -a+a; end", true);
		doTest("statement -/+-recusrion", 		"begin declare | a := +a-a; end", false);
		
		doTest("statement brackets empty",		"begin declare | a := (); end", false);
		doTest("statement brackets simple 1",	"begin declare | a := (a1); end", true);
		doTest("statement brackets simple 2",	"begin declare | a := (1); end", true);
		doTest("statement brackets neg",		"begin declare | a := -(a); end", true);
		doTest("statement brackets expr",		"begin declare | a := (1+-1); end", true);
		doTest("statement brackets nested 1",	"begin declare | a := (a+(a)+a); end", true);
		doTest("statement brackets nested 2",	"begin declare | a := ((a)+(b)); end", true);
		doTest("statement brackets double nested 1","begin declare | a := (((a)+(b))+b); end", true);
		doTest("statement brackets double nested 2","begin declare | a := ((a)+(b)+(b)); end", true);
		doTest("statement brackets +- 1",		"begin declare | a := (1)+(-1); end", true);
		doTest("statement brackets +- 2",		"begin declare | a := (1)+-(1); end", true);
		doTest("statement brackets +- 3",		"begin declare | a := (1)(+-1); end", false);
		doTest("statement brackets +- 4",		"begin declare | a := (1(+-1)); end", false);
		doTest("statement brackets +- mix",		"begin declare | a := 1+-(-1)+-1; end", true);
		
		// Layout
		doTest("newlines",						"begin\ndeclare\na,\n|\ncn:=\nx\n+\nx\n;\nend", true);
		doTest("newlines in keywords",			"begi\nn decl\nare a, b, | c := a + b; en\nd", false);
		doTest("newlines in id",				"begin declare a\nb, b, | c := a + b; end", false);
		doTest("newlines and spaces mix",		"begin declare |  \n \n \n   c := 5;  end", true);
		doTest("untrimmed input",				" begin declare | end ", false);
		doTest("untrimmed end",					"begin declare | end ", false);
		doTest("untrimmed start",				" begin declare | end", false);
		
		// Keywords
		doTest("keyword missing begin",			"begi declare | end", false);
		doTest("keyword missing declare",		"begin declar | end", false);
		doTest("keyword missing end 1",			"begin declare | en", false);
		doTest("keyword missing end 2",			"begin declare | a := 1; en", false);
		doTest("keyword missing ,",				"begin declare a | end", false);
		doTest("keyword missing assign",		"begin declare | a =: 1; end", false);
		doTest("keyword missing ;",				"begin declare | a := 1 end", false);
		
		doTest("id as keyword end",				"begin declare end, | a := end; end", true);
		doTest("id as keyword endend",			"begin declare end, | a := endend; end", true);
		doTest("id as keyword declare",			"begin declare declare, | declare := end; end", true);
		doTest("id as keyword mix",				"begindeclarebegindeclare,|end:=end;end", true);
		
		// Empty values
		doTest("special ids empty val",			"begin declare | a := ; end", false);
		doTest("special ids empty ass",			"begin declare |  := a; end", false);
		doTest("special ids empty dec",			"begin declare , | end", false);
	}
	
	/**
	 * Execute a testcase and print the result to System.out on success and to System.err on failure
	 * @param tc_name the name of the test case
	 * @param input the input string
	 * @param expected iff the syntax of the input is valid
	 */
	static void doTest(String tc_name, String input, boolean expected){
		try{
			new PicoRec(input).parse();
			new PicoRec.PicoRecDeter(input).parse();
		} catch (ParseException e){
			if(expected){
				System.err.println(tc_name + " fails");
				e.printStackTrace(System.err);
			} else {
	    		System.out.println("Passed test case: " + tc_name);
	    		System.out.println("  expected: "+expected);
	    		System.out.println("  input string:");
	    		System.out.println(input);
	    		System.out.println();
			}
			return;
		}
		if(!expected){
			System.err.println(tc_name + " fails. Expected a invalid syntax for:");
			System.err.println(input);
		} else {
    		System.out.println("Passed test case: " + tc_name);
    		System.out.println("  expected: "+expected);
    		System.out.println("  input string:");
    		System.out.println(input);
    		System.out.println();
		}
	}

	/**
	 * The lexical syntax ID automaton
	 */
	static RunAutomaton ID = new RunAutomaton(
			new RegExp(RegexTest.ID).toAutomaton());
	/**
	 * The lexical syntax NAT automaton
	 */
	static RunAutomaton NAT = new RunAutomaton(new RegExp(
			"[0-9]+").toAutomaton());
	/**
	 * The lexical syntax LAYOUT automaton
	 */
	static RunAutomaton LAYOUT = new RunAutomaton(
			new RegExp("[ \n]*").toAutomaton());

	/**
	 * Current position of the parser
	 */
	private int currentPosition;
	/**
	 * the string to be parsed
	 */
	private String str;

	public PicoRec(String str) {
		this.str = str;
	}

	/**
	 * Matches r, and increments currentPosition on success
	 * @param r
	 * @return true iff r matches
	 */
	private boolean tryMatchSingle(RunAutomaton r) {
		int length = r.run(this.str, currentPosition);
		if (length == -1) {
			return false;
		}
		currentPosition += length;
		return true;
	}

	/**
	 * Matches r and increments currentPosition, throws Exception on failure
	 * @param r
	 */
	private void matchSingle(RunAutomaton r) {
		int length = r.run(this.str, currentPosition);
		if (length == -1)
			throw new ParseException();
		currentPosition += length;
	}

	/**
	 * Matches r and layout, and increments currentPosition on success
	 * @param r
	 * @return true iff r matches
	 */
	private boolean tryMatch(RunAutomaton r) {
		if (tryMatchSingle(r)) {
			matchSingle(LAYOUT);
			return true;
		}
		return false;
	}

	/**
	 * Matches r and layout and increments currentPosition, throws Exception on failure
	 * @param r
	 */
	private void match(RunAutomaton r) {
		matchSingle(r);
		matchSingle(LAYOUT);
	}

	/**
	 * Matches s and increments currentPosition, throws Exception on failure
	 * @param s
	 */
	private void match(String s) {
		int length = s.length();
		if (this.str.startsWith(s, currentPosition)) {
			currentPosition += length;
		} else {
			throw new ParseException();
		}
		matchSingle(LAYOUT);
	}

	/**
	 * Matches s and end of string, and increments currentPosition on success
	 * @param s
	 * @return true iff s matches and end of string
	 */
	private boolean tryEndWidth(String s) {
		int length = s.length();
		if (this.str.startsWith(s, currentPosition)) {
			if(currentPosition + length == this.str.length()){
				//end of string reached
				currentPosition += length;
				return true;
			}
		}
		return false;
	}

	/**
	 * Matches c and increments currentPosition, throws Exception on failure
	 * @param c
	 */
	private void match(char c) {
		if (this.str.charAt(currentPosition) != c) {
			throw new ParseException();
		}
		currentPosition++;
		matchSingle(LAYOUT);
	}

	/**
	 * Parse the current string
	 */
	public void parse() {
		this.currentPosition = 0;
		parseProgram();
	}

	/**
	 * Parses a PROGRAM symbol
	 */
	void parseProgram() {
		match("begin");
		parseDecls();
		match('|');
		parseBody();
	}

	/**
	 * Parses a DECLS symbol
	 */
	void parseDecls() {
		match("declare");
		parseDecl();
	}

	/**
	 * Parses a DECL symbol
	 */
	void parseDecl() {
		if (tryMatch(ID)) {
			match(',');
			parseDecl();
		}
	}

	/**
	 * Parses a BODY symbol
	 */
	void parseBody() {
		if(tryEndWidth("end")){
			return;
		}
		if (tryParseStatement()) {
			match(";");
			parseBody();
		} else {
			throw new ParseException();
		}
	}

	/**
	 * Parses a STATEMENT symbol
	 */
	boolean tryParseStatement() {
		if (tryMatch(ID)) {
			match(":=");
			parseExp();
			return true;
		}
		return false;
	}

	/**
	 * Parses a EXP symbol
	 */
	void parseExp() {
		switch (this.str.charAt(currentPosition)) {
		case '-':
			currentPosition++;
			matchSingle(LAYOUT);
			
			parseExp();
			break;
		case '(':
			currentPosition++;
			matchSingle(LAYOUT);
			
			parseExp();
			
			match(')');
			
			parseExpP();
			
			break;
		default:
			if (tryMatch(ID) || tryMatch(NAT)) {
				parseExpP();
			} else {
				throw new ParseException();
			}
			break;
		}
	}

	/**
	 * Parses a EXP' symbol
	 */
	void parseExpP() {
		switch (this.str.charAt(currentPosition)) {
		case '*':
			currentPosition++;
			matchSingle(LAYOUT);
			
			parseExp();
			parseExpP();
			
			break;
		case '+':
			currentPosition++;
			matchSingle(LAYOUT);
			
			parseExp();
			parseExpP();
			
			break;
		default:
			// parseEpsilon()
			break;
		}
	}

	/**
	 * The exception that is thrown on failure of parsing a string
	 */
	public class ParseException extends RuntimeException {
		private ParseException() {
			super(genParseExceptionMessage(str, currentPosition));
		}
	}

	/**
	 * Generates two lines that display where a parser's current position was
	 * @param s original string
	 * @param p position index to highlight
	 * @return 
	 */
	private static String genParseExceptionMessage(String s, int p){
		if(s.contains("\n")){
			return s;
		}
		String r = System.lineSeparator() + s + System.lineSeparator();
		r += new String(new char[p]).replace("\0", " ");
		r += "^";
		return r;
	}
	
	@Override
	public String toString() {
		return genParseExceptionMessage(this.str, this.currentPosition);
	}
	
	static class PicoRecDeter extends PicoRec{
		PicoRecDeter(String s){
			super(s);
		}
		
		/**
		 * The lexical syntax IDNOEND automaton
		 */
		static RunAutomaton IDNOEND = new RunAutomaton(new RegExp(
				"([a-df-z][a-z0-9]*)|(e[a-mo-z0-9][a-z0-9]*)|(en[a-ce-z0-9][a-z0-9]*)|(end[a-z0-9]+)"
			).toAutomaton());


		/**
		 * Parses a BODY symbol
		 */
		void parseBody() {
			if(super.tryMatch(IDNOEND)){
				parseRest();
			} else {
				super.match("end");
				parseTerm();
			}
		}
		
		/**
		 * Parses a REST symbol
		 */
		void parseRest() {
			super.match(":=");
			super.parseExp();
			super.match(';');
			parseBody();
		}
		
		/**
		 * Parses a TERM symbol
		 */
		void parseTerm() {
			if(super.currentPosition == super.str.length()){
				// end of string
				return;
			}
			parseRest();
		}
	}
}
