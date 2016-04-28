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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			RegexTest.UNSIGNEDINTEGER).toAutomaton());
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
	 * Matches c and increments currentPosition, throws Exception on failure
	 * @param c
	 */
	private void match(char c) {
		if (this.str.charAt(currentPosition) != c) {
			throw new ParseException();
		}
	}

	/**
	 * Matches the end of the string, throws Exception on failure
	 */
	private void matchEOS() {
		if (this.currentPosition != this.str.length() - 1) {
			throw new ParseException();
		}
	}

	/**
	 * Parse the current string
	 */
	public void parse() {
		this.currentPosition = 0;
		match(LAYOUT);
		parseProgram();
		matchEOS();
	}

	/**
	 * Parses a PROGRAM symbol
	 */
	void parseProgram() {
		match("begin");
		parseDecls();
		match("|");
		parseBody();
		match("end");
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
		if (tryParseStatement()) {
			match(":=");
			parseBody();
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
			parseExp();
			break;
		case '(':
			currentPosition++;
			parseExp();
			match(')');
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
			parseExp();
			parseExpP();
			break;
		case '+':
			currentPosition++;
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
		String r = System.lineSeparator();
		r += s;
		r += System.lineSeparator();
		r += new String(new char[p]).replace("\0", " ");
		r += "^";
		return r;
	}
}
