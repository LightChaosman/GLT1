package overhead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import beaver.Parser.Exception;
import picoJava.PicoJavaParser;
import picoJava.PicoJavaScanner;

public class PicoJavaTester {

	public static void main(String[] args) throws IOException {
		String r = System.getProperty("user.dir");
		r = r + "\\tests\\PicoJava\\";
		String rv = r + "valid\\";
		File f = new File(rv);
		File[] fs = f.listFiles();
		for(File test:fs)
		{
			runTest(test,true);
		}
		
		String ri = r + "invalid\\";
		f = new File(ri);
		fs = f.listFiles();
		for(File test:fs)
		{
			runTest(test,false);
		}

	}

	private static void runTest(File test,boolean valid) throws IOException {
		Reader reader = new FileReader(test);
		PicoJavaScanner scanner = new PicoJavaScanner(reader);
		PicoJavaParser parser = new PicoJavaParser();
		String name = test.getName().substring(0,test.getName().lastIndexOf('.'));
		try {
			Object o = parser.parse(scanner);
			
			if(valid)
			{
				System.out.println("Passed (valid) test "+ name);
			}else{
				System.out.println("Failed (invalid) test "+ name);
			}
		} catch (RuntimeException |Exception e) {
			if(!valid)
			{
				System.out.println("Passed (invalid) test "+ name);
			}else{
				System.out.println("Failed (valid) test "+ name + " " + e);
			}
		}
	}

}
