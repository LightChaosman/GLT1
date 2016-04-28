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

	static RunAutomaton ID = new RunAutomaton(
			new RegExp(RegexTest.ID).toAutomaton());
	static RunAutomaton NAT = new RunAutomaton(new RegExp(
			RegexTest.UNSIGNEDINTEGER).toAutomaton());
	static RunAutomaton LAYOUT = new RunAutomaton(
			new RegExp(RegexTest.ID).toAutomaton());

	private int currentPosition = 0;
	// private int maxPosition;
	private String str;

	public PicoRec(String str) {
		this.str = str;
		// maxPosition = str.length();
	}

	private boolean tryMatch(RunAutomaton r) {
		if (tryMatchSingle(r)) {
			matchSingle(LAYOUT);
			return true;
		}
		return false;
	}

	private boolean tryMatchSingle(RunAutomaton r) {
		int length = r.run(this.str, currentPosition);
		if (length == -1) {
			return false;
		}
		currentPosition += length;
		return true;
	}

	private void matchSingle(RunAutomaton r) {
		int length = r.run(this.str, currentPosition);
		if (length == -1)
			throw new ParseException();
		currentPosition += length;
	}

	private void match(RunAutomaton r) {
		matchSingle(r);
		matchSingle(LAYOUT);
	}

	private void match(String s) {
		int length = s.length();
		if (this.str.startsWith(s, currentPosition)) {
			currentPosition += length;
		} else {
			throw new ParseException();
		}
		matchSingle(LAYOUT);
	}

	private void match(char c) {
		if (this.str.charAt(currentPosition) != c) {
			throw new ParseException();
		}
	}

	private void matchEOS() {
		if (this.currentPosition != this.str.length() - 1) {
			throw new ParseException();
		}
	}

	public void parse() {
		match(LAYOUT);
		parseProgram();
		matchEOS();
	}

	void parseProgram() {
		match("begin");
		parseDecls();
		match("|");
		parseBody();
		match("end");
	}

	void parseDecls() {
		match("declare");
		parseDecl();
	}

	void parseDecl() {
		if (tryMatch(ID)) {
			match(',');
			parseDecl();
		}
	}

	void parseBody() {
		if (tryParseStatement()) {
			match(":=");
			parseBody();
		}
	}

	boolean tryParseStatement() {
		if (tryMatch(ID)) {
			match(":=");
			parseExp();
			return true;
		}
		return false;
	}

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

	private class ParseException extends RuntimeException {
		private ParseException() {
			super(genParseExceptionMessage(str, currentPosition));
		}
	}

	private static String genParseExceptionMessage(String s, int p){
		String r = System.lineSeparator();
		r += s;
		r += System.lineSeparator();
		r += new String(new char[p]).replace("\0", " ");
		r += "^";
		return r;
	}
}
