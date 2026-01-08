package com.J5.Calculator_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.J5.Calculator.calculator;

public class Csv_FileREading_test 
{
	
	 calculator ca;
	 public Csv_FileREading_test()
	 {
		 ca = new calculator();
	 }
	 
	 @Test
	 @ParameterizedTest
	 @CsvFileSource(files="C:\\Users\\ANANDA K R\\SpringBoot_Dev\\J5_UnitTesting\\Resource\\csv_FileREader.csv",numLinesToSkip=1)
	public void param_using_CsvFile(int result1, int a, int b)
	{
		int result =ca.add(a, b);
		assertEquals(result1, result);
		
	}

}
