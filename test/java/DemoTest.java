package test.java;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import main.java.*;




public class DemoTest {

	@Test
	public void testMain() {
	    String  input = "1"+System.getProperty("line.separator")+"2"+System.getProperty("line.separator")+"3"+System.getProperty("line.separator"); ;
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream (out));
		
		//Invoke
		String[] args = {};
		Demo.main(args);
		
		//Expected output
		String output = "Enter side 1: " + System.getProperty("line.separator");
		output += "Enter side 2: " + System.getProperty("line.separator");
		output += "Enter side 3: " + System.getProperty("line.separator");
		output += "This is not a triangle."+ System.getProperty("line.separator");;
		assertEquals (output, out.toString());
		
	}
	
	

	@Test
	public void testIsTriangle() {	
		Demo myDemo = new Demo();
		double t = 1;
	    double  r = 2;
		double s = 1.5;	
		boolean actual = Demo.isTriangle(t, r, s);
		boolean expectedResult  = true;
		assertEquals(expectedResult, actual);
	}
}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 


