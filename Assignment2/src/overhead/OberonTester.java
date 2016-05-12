package overhead;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;

import beaver.Parser.Exception;
import oberon.OberonParser;
import oberon.OberonScanner;

public class OberonTester {
	
	
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
		valids.put("factor", "MODULE Sample; CONST a = 1; END Sample.");
		valids.put("factor", "MODULE Sample; CONST a = b; END Sample.");
		valids.put("factor", "MODULE Sample; CONST a = b.c; END Sample.");
		valids.put("factor", "MODULE Sample; CONST a = (b.c + d.e); END Sample.");
		valids.put("factor", "MODULE Sample; CONST a = ~(b.c + d.e); END Sample.");
		valids.put("selector", "MODULE Sample; CONST a = b[5]; END Sample.");
		valids.put("selector", "MODULE Sample; CONST a = b[5].c[4][5].d.e.f[z]; END Sample.");
		valids.put("term", "MODULE Sample; CONST a = a * b; END Sample.");
		valids.put("term", "MODULE Sample; CONST a = a * b * c; END Sample.");
		valids.put("term", "MODULE Sample; CONST a = a * b * c & d; END Sample.");
		valids.put("term", "MODULE Sample; CONST a = a * b * c & d DIV 8; END Sample.");
		valids.put("term", "MODULE Sample; CONST a = a * b * c & d DIV 8 MOD 2; END Sample.");
		valids.put("SimpleExpression", "MODULE Sample; CONST a = +1; END Sample.");
		valids.put("SimpleExpression", "MODULE Sample; CONST a = -1; END Sample.");
		valids.put("SimpleExpression", "MODULE Sample; CONST a = 1+b; END Sample.");
		valids.put("SimpleExpression", "MODULE Sample; CONST a = 1 OR b; END Sample.");
		valids.put("SimpleExpression", "MODULE Sample; CONST a = 1 - b; END Sample.");
		valids.put("Expression", "MODULE Sample; CONST a = 1 = b; END Sample.");
		valids.put("Expression", "MODULE Sample; CONST a = 1 < b; END Sample.");
		valids.put("Expression", "MODULE Sample; CONST a = 1 <= b; END Sample.");
		valids.put("Expression", "MODULE Sample; CONST a = 1 > b; END Sample.");
		valids.put("Expression", "MODULE Sample; CONST a = 1 >= b; END Sample.");
		valids.put("Expression", "MODULE Sample; CONST a = 1+b >= ~b-d; END Sample.");
		valids.put("type", "MODULE Sample; TYPE a = b; END Sample.");
		valids.put("type", "MODULE Sample; TYPE a = ARRAY 10-b OF c; END Sample.");
		valids.put("type", "MODULE Sample; TYPE a = RECORD END; END Sample.");
		valids.put("record", "MODULE Sample; TYPE a = RECORD a:b END; END Sample.");
		valids.put("record", "MODULE Sample; TYPE a = RECORD a,c:b END; END Sample.");
		valids.put("record", "MODULE Sample; TYPE a = RECORD a,c:b;d,e,c:z END; END Sample.");
		valids.put("record", "MODULE Sample; TYPE a = RECORD a,c:b;d,e,c:ARRAY x OF y END; END Sample.");
		valids.put("IdentList", "MODULE Sample; VAR a,b,c: a; END Sample.");
		valids.put("IdentList", "MODULE Sample; VAR a,b,c: RECORD a,b,c:ARRAY a OF b END; END Sample.");
		valids.put("procedure", "MODULE Sample; PROCEDURE x;  END x; END Sample.");
		valids.put("procedure", "MODULE Sample; PROCEDURE x();  END x; END Sample.");
		valids.put("procedure", "MODULE Sample; PROCEDURE x(a:b);  END x; END Sample.");
		valids.put("procedure", "MODULE Sample; PROCEDURE x(VAR a:b);  END x; END Sample.");
		valids.put("procedure", "MODULE Sample; PROCEDURE x(VAR a:b;c,e:d);  END x; END Sample.");
		valids.put("procedure", "MODULE Sample; PROCEDURE x(VAR a:b;VAR c,e:d);  END x; END Sample.");
		valids.put("procedurebody", "MODULE Sample; PROCEDURE x; PROCEDURE x;   END x;  END x; END Sample.");
		valids.put("procedurebody", "MODULE Sample; PROCEDURE x; VAR a,b:c;  END x; END Sample.");
		valids.put("procedurebody", "MODULE Sample; PROCEDURE x; TYPE a=c;  END x; END Sample.");
		valids.put("procedurebody", "MODULE Sample; PROCEDURE x; CONST a=c;  END x; END Sample.");
		valids.put("procedurebody", "MODULE Sample; PROCEDURE x; CONST a=c;TYPE a=b; VAR a,b:c;  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN a:=b  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN a:=b;a:=c  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN END x; END Sample.");
		valids.put("statementseq", "MODULE Sample; PROCEDURE x; BEGIN ;  END x; END Sample.");
		valids.put("statementseq", "MODULE Sample; PROCEDURE x; BEGIN ;;;;  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN WHILE x=0 DO x:=1; END  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN IF x=0 THEN x:=1; END  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN IF x=0 THEN x:=1; ELSEIF x=2 THEN x:=3; END  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN IF x=0 THEN x:=1; ELSEIF x=2 THEN x:=3;ELSEIF x=4 THEN x:=5; END  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN IF x=0 THEN x:=1; ELSEIF x=2 THEN x:=3;ELSEIF x=4 THEN x:=5; ELSE x:=6; END  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN IF x=0 THEN x:=1; ELSE x:=6; END  END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN y END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN y.z END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN y.z[1] END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN y.z[1]() END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN y.z[1](10) END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN y.z[1](10,6) END x; END Sample.");
		valids.put("statement", "MODULE Sample; PROCEDURE x; BEGIN y.z[1](10,6); END x; END Sample.");
		valids.put("statementseq", "MODULE Sample; PROCEDURE x; BEGIN y.z[1](10,6); a:=b; END x; END Sample.");
		
		invalids.put("Empty", "");
		invalids.put("only layout", " ");

		valids.put("no trim", " MODULE Sample; END Sample. ");
		valids.put("no trim", "\n MODULE Sample; END Sample. \n ");
		
		valids.put("there is no semantics", "MODULE a; END b.");
		
		invalids.put("early EOS", "MODULE Sample; END Sample");
		invalids.put("early EOS", "MODULE Sample; END ");
		invalids.put("early EOS", "MODULE Sample; END");
		invalids.put("early EOS", "MODULE Sample; EN");
		invalids.put("early EOS", "MODULE Sample; ");
		invalids.put("early EOS", "MODULE Sample;");
		invalids.put("early EOS", "MODULE Sample");
		invalids.put("early EOS", "MODULE ");
		invalids.put("early EOS", "MODULE");
		invalids.put("early EOS", "MOD");
		
		invalids.put("keywords as ID", "MODULE MODULE; END MODULE.");
		invalids.put("keywords as ID", "MODULE MODULE; END END.");
		valids.put("case sensitivity of keywords", "MODULE Module; END End.");
		valids.put("case sensitivity of keywords", "MODULE a; BEGIN WHILE Do > 0 DO ENd(); END; END a.");
		
		invalids.put("No END id", "MODULE a; END.");
		invalids.put("No MODULE id", "a; END a.");
		
		invalids.put("decl ordering", "MODULE a; BEGIN b:=c+d; CONST e=f; END a.");
		
		invalids.put("empty if", "MODULE a; IF a=0 END END a.");
		invalids.put("if else ordering", "MODULE a; IF a=0 ELSE a=0 THEN a=0 END END a.");
		//invalids.put("empty procedure", "MODULE a; END a.");
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
