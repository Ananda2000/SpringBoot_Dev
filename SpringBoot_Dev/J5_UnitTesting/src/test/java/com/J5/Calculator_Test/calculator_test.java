package com.J5.Calculator_Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

import com.J5.Calculator.calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class calculator_test
{
	calculator aa ;
	
	public calculator_test()
	{
	aa= new calculator();
	}
	
	@BeforeAll
	@DisplayName("BEFORE ALL METHOD.")

	public static void BeforeAll_Method()
	{
		System.out.println("----- BEFORE ALL METHOD ---");
	}
	
	@BeforeEach
	public void Beforeach_Method()
	{
		System.out.println("--------BEFORE EACH METHOD -----------");
	}
	
	@Test
	@Tag("dev")
	@RepeatedTest(3)
	@DisplayName("TC-1 For Add_Test Method order -3")
	@Order(3)
	public void Add_test()
	{
	
		int result =aa.add(2, 1);
		System.out.println("Addition --"+result);
		assertEquals(3, result);
	}
	
	@Test
	@Tag("Qa")
	@DisplayName("TC-2 Subtraction Method order-4")
	@Order(4)
	
	public void sub_test() throws InterruptedException
	{
		Thread.sleep(15);
		int sub_result = aa.sub(2, 1);
		System.out.println("Subtraction--"+sub_result);
		assertEquals(1, sub_result);
	}
	
//THIS TEST METHOD WILL NOT EXECUTE. BECAUSE USED '@Disabled' annotation...
	@Test
	@Disabled
	@DisplayName("TC-3 used @disabled annotationation. hence not executed ---order-2")
	@Order(2)
	public void TC_3_disabled()
	{
		System.out.println("--@DISABLED ANNOTATION IMPLEMENTED----");
	}
	
	@Test
	@Order(1)
	@Tag("dev")
	@DisplayName("Tc-4 with order -1")
	public void ZZ_Tc_4_checkingOrder()
	{
		System.out.println(" This is Tc-4");
	}
	
	@Test
	@Tag("Timeout")
	@Timeout(value = 3, unit=TimeUnit.MICROSECONDS)
	public void timeout_Annotation_test()
	{
		System.out.println("timeout Annotation implemented");
	}
	
	@AfterEach
	public void AfterEach_method()
	{
		System.out.println("------AFTEREACH METHOD..----------");
	}
	
	
	
	
	
	
	@AfterAll
	@DisplayName("AFTER ALL METHOD")
	public static void AfterAll_Method()
	{
		System.out.println("---AFTER ALL METHOD---");
	}

}
