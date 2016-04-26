/*
 * provide names and student id numbers here
 */

package regex;

import dk.brics.automaton.RegExp;
import dk.brics.automaton.RunAutomaton;

public class RegexTest {
	
	
	/* Regexes for question 1*/
	public final static String ID = "[a-z][a-z0-9]*";
	public final static String UNSIGNEDINTEGER = "[0]|([1-9][0-9]*)";
	public final static String SIGNEDINTEGER = "-?("+UNSIGNEDINTEGER+")";
	private final static String TEMP_FLOAT1 = "("+UNSIGNEDINTEGER + ")[eE](" + SIGNEDINTEGER+")";
	private final static String TEMP_FLOAT2 = "("+UNSIGNEDINTEGER+").([0-9]+)([Ee]"+SIGNEDINTEGER+")?" ;
	public final static String REAL = "("+TEMP_FLOAT1+")|("+TEMP_FLOAT2+")|("+UNSIGNEDINTEGER+")";
	
	
	/* Regexes for question 2*/
	private final static String CHAR = "[a-z]|[A-Z]|\\\"|\\\\";//should backslashes be included?
	public final static String STRING = "("+CHAR+")*";
	
	
    
    private final RunAutomaton r;

    public RegexTest(String regex) {
    	System.out.println("regular expression = " + regex);
        r =  new RunAutomaton(new RegExp(regex).toAutomaton());
    }
        
    public long dfaMatch(String input, int index) {
        long start = System.nanoTime();
        int length = r.run(input, index);
        long end = System.nanoTime();
        
        if (length == -1) {
            System.out.println("No match found!");
        } else {
            String s = input.substring(index, index + length);
            System.out.println("Found: " + s);
        }
        
        return end - start;
    }
        
    void runTest(String input, int index) {
    	System.out.println("input string = " + input);
    	System.out.println("index = " + index);
    	
        long dfaMatchTime = dfaMatch(input, index);
        System.out.println("dfaMatchTime " + dfaMatchTime);
    }
    
    public static void main(String[] args) {
    	String CHAR = "[a-z]|[A-Z]|\\\"|\\\\";
    	String STRING = "("+CHAR+")*";

        RegexTest exampleRegexTest = new RegexTest(STRING);
        exampleRegexTest.runTest("05", 0);
        exampleRegexTest.runTest("abcFe\"", 0);
        
        testID(new RegexTest(ID));
        testNAT(new RegexTest(UNSIGNEDINTEGER));
        testFLOAT(new RegexTest(REAL));
    }
    
    public static void testID(RegexTest tc){
    	System.out.println("testID");
    	tc.runTestAuto("", false);
    	tc.runTestAuto("a", true);
    	tc.runTestAuto("aa", true);
    	tc.runTestAuto("0", false);
    	tc.runTestAuto("a0", true);
    	tc.runTestAuto("a0a0a0", true);
    	System.out.println();
    }
    
    public static void testNAT(RegexTest tc){
    	System.out.println("testNAT");
    	tc.runTestAuto("", false);
    	tc.runTestAuto("a", false);
    	tc.runTestAuto("0", true);
    	tc.runTestAuto("01", false);
    	tc.runTestAuto("001", false);
    	tc.runTestAuto("1", true);
    	tc.runTestAuto("173892", true);
    	tc.runTestAuto("9a9", false);
    	tc.runTestAuto("1,000", false);
    	System.out.println();
    }
    
    public static void testFLOAT(RegexTest tc){
    	System.out.println("testFLOAT");
    	System.out.print("-> ");
    	testNAT(tc);
    	tc.runTestAuto("0001", false);
    	System.out.println("-> testFLOAT");
    	
    	//Simple positives
    	tc.runTestAuto("3.1415", true);
    	tc.runTestAuto("0.0", true);
    	tc.runTestAuto("0.01", true);
    	tc.runTestAuto("0.10", true);
    	tc.runTestAuto(".0", true);
    	tc.runTestAuto(".01", true);
    	
    	//Dot characters
    	tc.runTestAuto("0e0", true);
    	tc.runTestAuto("0a0", false);
    	tc.runTestAuto("0,0", false);
    	tc.runTestAuto("1,000.0", false);
    	tc.runTestAuto("1.000.0", false);

    	//Empty decimals
    	tc.runTestAuto("0.", false);		//design decision
    	tc.runTestAuto("1.", false);
    	tc.runTestAuto(".", false);
    	tc.runTestAuto("e.", false);
    	tc.runTestAuto("a.", false);
    	
    	//Negations in e power
    	tc.runTestAuto("1.0e-1", true);
    	tc.runTestAuto("1.0e--1", false);
    	tc.runTestAuto("1.0e---1", false);
    	tc.runTestAuto("1.0e-0", true);		//design decision
    	tc.runTestAuto("1.0e0", true);
    	
    	//Simple e power positives
    	tc.runTestAuto("3.14e-7", true);
    	tc.runTestAuto("0e1", true);
    	tc.runTestAuto("0e-1", true);
    	tc.runTestAuto("0.0e1", true);
    	tc.runTestAuto("0.0e-1", true);
    	tc.runTestAuto(".0e1", true);
    	tc.runTestAuto(".0e-1", true);
    	tc.runTestAuto("0.01e1", true);
    	tc.runTestAuto("0.01e-1", true);
    	tc.runTestAuto("0.0001000e100", true);
    	
    	//E power characters
    	tc.runTestAuto("0.0E1", true);
    	tc.runTestAuto("0.0A1", false);
    	tc.runTestAuto("0.0exp1", false);
    	tc.runTestAuto("0.0-1", false);
    	
    	//E power without decimals
    	tc.runTestAuto("e", false);
    	tc.runTestAuto("e1", false);
    	tc.runTestAuto("e01", false);
    	tc.runTestAuto("e10", false);
    	
    	//More complex E power numbers
    	tc.runTestAuto("1.0e0.0", false);		// Float in e power
    	tc.runTestAuto("1.0e01", false);		// Invalid int in e power
    	tc.runTestAuto("1.0e0.0e1", false);		// E in e power
    	tc.runTestAuto("1.0e.0e1", false);
    	tc.runTestAuto("1.0ee1", false);
    	
    	System.out.println();
    }
    

    public static void testSTRING(RegexTest tc){
    	System.out.println("testSTRING");
    	tc.runTestAuto("", false);
    	tc.runTestAuto("\"", false);
    	tc.runTestAuto("\"\"", true);
    	tc.runTestAuto("\"a\"", true);		
    	tc.runTestAuto("\"09.exaz..'!@#$%^&*()`~\"", true);	// special chars in a string	
    	tc.runTestAuto("\"\"\"", false);					// no quotations in a string
    	
    	tc.runTestAuto("\"asdsa\"", true);
    	// special chars
    	tc.runTestAuto("\"" + "\\u0022" + "\"", false);		// three quotes with unicode
    	tc.runTestAuto("a", true);
    	System.out.println();
    }
    
    public void runTestAuto(String s, boolean match){
    	int exp = s.length();
    	int actual = r.run(s, 0);
    	if(match){
    		if( actual != exp ) {
        		System.err.println("Test fail on `" + s + "`, expected match, only got `"+actual+"` of `"+exp+"`");
        	}
    	} else {
    		if( actual == exp ) {
    			System.err.println("Test fail on `" + s + "`, expected no match, got `"+actual+"` of `"+exp+"`");
        	}
    	}
    	System.out.println("Passed: `" + s + "` (match = "+match+")");
    }
}

