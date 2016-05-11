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

public class PicoJavaTester {
	
	private final static HashMap<String,String> valids = new HashMap<>();
	private final static HashMap<String,String> invalids = new HashMap<>();
	
	static{
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

		valids.put("rev ord BLCK-STMT", "{a=true; a a; class a extends {}}");
		invalids.put("missing layout",  "{aba;}");
		invalids.put("no trim"          ,"\n {} \n");
		
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
		r = r + "\\tests\\PicoJava\\";
		String rv = r + "valid\\";
		File f = new File(rv);
		File[] fs = f.listFiles();
		for(File test:fs)
		{
			addTest(test,true);
		}
		
		String ri = r + "invalid\\";
		f = new File(ri);
		fs = f.listFiles();
		for(File test:fs)
		{
			addTest(test,false);
		}
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

	private static void addTest(File test,boolean valid) throws IOException {
		
		String name = test.getName().substring(0,test.getName().lastIndexOf('.'));
		BufferedReader br = new BufferedReader(new FileReader(test));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		while(s!=null)
		{
			sb.append(s);
			s=br.readLine();
		}
		HashMap<String,String> map = valid?valids:invalids;
		map.put(name,sb.toString());
		br.close();
	}

}
