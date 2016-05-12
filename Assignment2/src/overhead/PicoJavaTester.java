package overhead;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;

import beaver.Parser.Exception;
import picoJava.PicoJavaParser;
import picoJava.PicoJavaScanner;

public class PicoJavaTester {
	
	@SuppressWarnings("serial")
	private final static HashMap<String,String> valids = new HashMap<String,String>(){


		@Override
		public String put(String key, String value){
			if(!this.containsKey(key))
			{
				return super.put(key, value);
			}
			int i = 1;
			while(this.containsKey(key+""+i))i++;
			return super.put(key+i, value);
		}
		
	};
	
	@SuppressWarnings("serial")
	private final static HashMap<String,String> invalids = new HashMap<String,String>(){


		@Override
		public String put(String key, String value){
			if(!this.containsKey(key))
			{
				return super.put(key, value);
			}
			int i = 1;
			while(this.containsKey(key+""+i))i++;
			return super.put(key+i, value);
		}
		
	};
	
	static{
		valids.put("Assignment", 		"{Boolean a; a = true;}");
		valids.put("FromAssignment",	"{	class A {		boolan a;		a = true;		class AA {			boolean aa;		}	}	class B extends A {		boolean b;		b = a;		A refA;		B refB;		refA = refB;		refB.b = refA.a;		class BB extends AA {			boolean bb;			bb = aa;			while (b)			b = a;		}	}}");
		valids.put("Boolean", 			"{boolean a;}");
		valids.put("Extension",			"{class A{} class B extends B{}}");
		valids.put("One class",			"{class A{}}");
		valids.put("Single Block",		"{}");
		valids.put("Two classes",		"{class A{} class B{}}");
		valids.put("Undeclared assign", "{a=b;}");
		valids.put("While", 			"{while(a) a=b;}");
		valids.put("And",				"{a=a&&b;}");
		valids.put("Or",				"{a=a||b;}");
		valids.put("Brackets",			"{a=a||(b&&c);}");
		valids.put("While And",			"{while(a&&b)a=b;}");
		valids.put("While Or",			"{while(a||b)a=b;}");
		valids.put("While Or and",		"{while(a||(b && c))a=b;}");
		valids.put("and and",			"{a = a && b && c;}");
		valids.put("and or",			"{a = a && b || c;}");
		valids.put("or and",			"{a = a || b && c;}");
		valids.put("or or",				"{a = a || b || c;}");
		valids.put("declare dot",		"{Rectanle.Square s;}");
		valids.put("while false",		"{while(false)a = true;}");
		valids.put("while true",		"{while(true)a = true;}");
		valids.put("assignment dot",	"{a=b.c;}");

		valids.put("rev ord BLCK-STMT", "{a=true; a a; class a {}}");
		invalids.put("no trim",         "\n {} \n");
		
		invalids.put("keyword as ID 1", "{true=true;}");
		invalids.put("keyword as ID 2", "{class class{}}");
		valids.put("keyword in ID 3",   "{class aclass{}}");
		valids.put("keyword in ID 4",   "{class classa{}}");
		
		valids.put("valid no layout",   "{classname{}}");
		invalids.put("inV no layout",   "{declareid;}");
		
		invalids.put("Two programs",	"{}{}");
		invalids.put("Declare plus ass","{boolean a = true;}");
		invalids.put("Empty While", 	"{while(a)}");
		invalids.put("empty", 			"");
		invalids.put("infinite while", 	"{while(a);}");
		invalids.put("no ext. brack", 	"a=b;");
		invalids.put("no semicolon", 	"{a=b}");
		invalids.put("dot name", 		"{boolean b.a;}");
		invalids.put("extends dot",		"{class A extends B.C{}}");
		invalids.put("No second arg",	"{a = b &&}");
		invalids.put("No second arg2",	"{a = b ||}");
		invalids.put("Empty while2",	"{while() a = b;}");
		invalids.put("Empty while3",	"{while a = b;}");
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
		flex = flex+" " + curdir + "\\src\\picoJava\\PicoJava.flex";
		System.out.println(flex);
		beaver = "java -jar "+beaver+" ";
		beaver = beaver + curdir +"\\src\\picoJava\\PicoJava.grammar";
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
		Object o = null;
		try {
			o = parser.parse(scanner);
			
			if(valid)
			{
				System.out.println("Passed (valid) test "+ name);
			}else{
				System.err.println("Failed (invalid) test "+ name + " " +  o);
			}
		} catch (RuntimeException |Exception e) {
			if(!valid)
			{
				System.out.println("Passed (invalid) test "+ name);
			}else{
				System.err.println("Failed (valid) test "+ name + " " + o + " " + e);
			}
		}
		reader.close();
		System.out.println();
	}

	
}
