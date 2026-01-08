package com.J5.Calculator_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.J5.Calculator.calculator;

// UNIT TESTING OF ADD METHOD INS CALCUATOR USING METHODSOURCE PARAMETERIZEATION.
//https://reflectoring.io/tutorial-junit5-parameterized-tests/
public class MethodSource_parameterized_Test 
{
	calculator ca;
	
	public MethodSource_parameterized_Test()
	{
		ca = new calculator();
	}
	
	@ParameterizedTest
	@Test
	@MethodSource("arrayProvider")
		public void methodSourceParam(int [] array)
		{
			int sizzzz =array.length;
			//System.out.println(sizzzz);
			System.out.println(array[0]);
			System.out.println("This is method parameterisze----");
			int res=ca.add(array[1], array[2]);
			assertEquals(array[0], res);
			
			
		}
	
	static Stream<int []> arrayProvider() {
		return Stream.of(
		        new int[]{3, 2, 1},
		        new int[]{4, 5,1},
		        new int[]{30, 20, 10}
		    );
    }
}
