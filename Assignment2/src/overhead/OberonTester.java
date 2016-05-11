package overhead;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;

import beaver.Parser.Exception;
import picoJava.PicoJavaParser;
import picoJava.PicoJavaScanner;

public class OberonTester {
	
	private final static HashMap<String,String> valids = new HashMap<>();
	private final static HashMap<String,String> invalids = new HashMap<>();
	
	static{
		
	}
	

	public static void main(String[] args) throws IOException, InterruptedException {
		String r = System.getProperty("user.dir");
		runCommandLine(r);
		for(String k:valids.keySet())
		{
			executeTest(k,valids.get(k),true);
		}for(String k:invalids.keySet())
		{
			executeTest(k,invalids.get(k),false);
		}

	}

	private static void runCommandLine(String curdir) throws IOException, InterruptedException {
		if(!System.getProperty("os.name").startsWith("Windows"))return;
		String beaver = "D:\\eclipse-modeling-mars-2-win32-x86_64\\beaver-0.9.11\\beaver-0.9.11\\lib\\beaver-cc-0.9.11.jar";
		String flex = "D:\\eclipse-modeling-mars-2-win32-x86_64\\jflex-1.6.1\\jflex-1.6.1\\bin\\jflex.bat"; 
		Runtime rt = Runtime.getRuntime();
		flex = flex+" " + curdir + "\\src\\oberon\\Oberon.flex";
		System.out.println(flex);
		beaver = "java -jar "+beaver+" ";
		beaver = beaver + curdir +"\\src\\oberon\\Oberon.grammar";
		System.out.println(beaver);
		rt.exec(beaver);
		rt.exec(flex);
		Thread.sleep(500);
	}
	
	private static void executeTest(String name, String program, boolean valid) throws IOException
	{
		System.out.println("name: " + name);
		System.out.println("prog: " + program);
		Reader reader = new StringReader(program);
		PicoJavaScanner scanner = new PicoJavaScanner(reader);
		PicoJavaParser parser = new PicoJavaParser();
		try {
			Object o = parser.parse(scanner);
			
			if(valid)
			{
				System.out.println("Passed (valid) test "+ name);
			}else{
				System.err.println("Failed (invalid) test "+ name);
			}
		} catch (RuntimeException |Exception e) {
			if(!valid)
			{
				System.out.println("Passed (invalid) test "+ name);
			}else{
				System.err.println("Failed (valid) test "+ name);
			}
		}
		reader.close();
		System.out.println();
	}

	
}