package calculator_test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import calculator.SubTraction;

public class SubTraction_test {
	SubTraction sc;
	
	public SubTraction_test()
	{
		sc = new SubTraction();
		
	}
	
	@Test
	
	public void subtractiontest()
	{
		System.out.println("THIS IS SUBTRACTION TEST METHOD ---");
		int resutl = sc.subtract(3, 2);
		assertEquals("The values are not matching...", 1, resutl);
	}

}
