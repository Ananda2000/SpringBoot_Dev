package com.J5.Calculator_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.J5.Calculator.calculator;

public class CsvSource_Method_param_test 
{
calculator ca;
	
	public CsvSource_Method_param_test()
	{
		ca = new calculator();
	}
	
	@Test
	@ParameterizedTest
	@CsvSource({"3,1,2","4,3,1"})
	public void csv_method_reading(int result, int a, int b)
	{
		int csv_result =ca.add(a, b);
		System.out.println(csv_result);
		assertEquals(result, csv_result);
	}

}
