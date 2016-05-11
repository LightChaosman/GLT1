package overhead;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;

import beaver.Parser.Exception;
import oberon.OberonParser;
import oberon.OberonScanner;

public class OberonTester {
	
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
		valids.put("From book", "MODULE Sample; PROCEDURE Multiply;  VAR x, y, z: INTEGER; BEGIN Read(x); Read(y); z := 0;  WHILE x > 0 DO  IF x MOD 2 = 1 THEN z := z + y END ;  y := 2*y; x := x DIV 2  END ;  Write(x); Write(y); Write(z); WriteLn END Multiply; PROCEDURE Divide;  VAR x, y, r, q, w: INTEGER; BEGIN Read(x); Read(y); r := x; q := 0; w := y;  WHILE w <= r DO w := 2*w END ;  WHILE w > y DO  q := 2*q; w := w DIV 2;  IF w <= r THEN r := r - w; q := q + 1 END  END ;  Write(x); Write(y); Write(q); Write(r); WriteLn END Divide; PROCEDURE BinSearch;  VAR i, j, k, n, x: INTEGER;  a: ARRAY 32 OF INTEGER; BEGIN Read(n); k := 0;  WHILE k < n DO Read(a[k]); k := k + 1 END ;  Read(x); i := 0; j := n;  WHILE i < j DO  k := (i+j) DIV 2;  IF x < a[k] THEN j := k ELSE i := k+1 END  END ;  Write(i); Write(j); Write(a[j]); WriteLn END BinSearch; END Sample . ");
		valids.put("simplest ", "MODULE Sample; END Sample.");
		valids.put("declarations", "MODULE Sample; CONST END Sample.");
		valids.put("declarations", "MODULE Sample; CONST a = 10; END Sample.");
		valids.put("declarations", "MODULE Sample; CONST a = 10; b=10; END Sample.");
		valids.put("declarations", "MODULE Sample; TYPE END Sample.");
		valids.put("declarations", "MODULE Sample; TYPE a=a; END Sample.");
		valids.put("declarations", "MODULE Sample; TYPE a=a;b = ARRAY 10 OF x; END Sample.");
		valids.put("declarations", "MODULE Sample; TYPE a=a;b = ARRAY 10 OF x; END Sample.");
		valids.put("declarations", "MODULE Sample; VAR END Sample.");
		valids.put("declarations", "MODULE Sample; VAR a : b; END Sample.");
		valids.put("declarations", "MODULE Sample; VAR a,b : b; END Sample.");
		valids.put("declarations", "MODULE Sample; VAR a,b : b;a : b; END Sample.");
		valids.put("declarations", "MODULE Sample;CONST TYPE VAR END Sample.");
		valids.put("declarations", "MODULE Sample; PROCEDURE x; END x; END Sample.");
		invalids.put("Empty", "");
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
		OberonScanner scanner = new OberonScanner(reader);
		OberonParser parser = new OberonParser();
		Object o = null;
		try {
			o = parser.parse(scanner);
			
			if(valid)
			{
				System.out.println("Passed (valid) test "+ name);
			}else{
				System.err.println("Failed (invalid) test "+ name + " " + o);
			}
		} catch (RuntimeException | Exception e) {
			if(!valid)
			{
				System.out.println("Passed (invalid) test "+ name);
			}else{
				System.err.println("Failed (valid) test "+ name + " " + o + " " + e.getMessage());
			}
		}
		reader.close();
		System.out.println();
	}

	
}
