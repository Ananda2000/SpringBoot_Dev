package cal_mulAndDivision_Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import cal_mulAndDivision.Multiplication;

public class Multiplication_Test 
{
	
	Multiplication mul=null;
	
	public Multiplication_Test()
	{
		mul = new Multiplication();
	}
	
	@Test
	public void mulitplication_numbers()
	{
		int result = mul.multiplication(5,4);
		assertEquals(20, result);
	}

}
