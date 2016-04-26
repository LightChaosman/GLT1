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
public class PicoRec{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static RunAutomaton ID = new RunAutomaton(new RegExp(RegexTest.ID).toAutomaton());
	static RunAutomaton NAT = new RunAutomaton(new RegExp(RegexTest.UNSIGNEDINTEGER).toAutomaton());
	
	private int currentPosition = 0;
    private int newPosition = -1;
    private int maxPosition;
    private String str;

    public PicoRec(String str){
    	this.str = str;
    	maxPosition = str.length();
    }
    
    public void parse(){
    	
    }
    
    public void parseProgram(){
    	
    }
    
	public void parseDecls(){
	    	
	    }
	
	public void parseStatement(){
		
}
}
