package com.J5.Calculator_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.J5.Calculator.CheckEvenNumber;


//THIS CLASS WE ARE USING @PARAMETERIZED ANNOTATION FOR TESTING ADD METHODS AND SUBTRACT METHODS...
public class Parameterized_Test 
{

	CheckEvenNumber cen;
	public Parameterized_Test()
	{
		cen = new CheckEvenNumber();
	}
	
	@Test
	@ParameterizedTest
	@ValueSource(ints={2,4,5,}) // parameterized the values.
	public void param_unitTest(int a)
	{
		int result =cen.evenNumber(a);
		if(result >0)
		{
			assertEquals(1, result, "The value is NOT EVEN NUMBER--"+a);
			
		}
		else
		{
			assertEquals(0, result, "The value is EVEN NUMBER--"+a);
		}
		System.out.println("this is parameterized test");
		System.out.println(a);
	}
}
