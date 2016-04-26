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
        
        testInt(new RegexTest(UNSIGNEDINTEGER));
    }
    
    public static void testInt(RegexTest tc){
    	tc.runTestAuto("", 0);
    	tc.runTestAuto("a", 1);
    	tc.runTestAuto("aa", 1);
    	tc.runTestAuto("0", 0);
    	tc.runTestAuto("a0", 1);
    	tc.runTestAuto("a0a0a0", 1);
    }
    
    public void runTestAuto(String s, int expected){
    	assert expected == r.run(s, 0);
    }
}
