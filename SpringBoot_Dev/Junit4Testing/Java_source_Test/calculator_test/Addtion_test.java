package calculator_test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.JUnitCore;
import org.junit.runner.OrderWith;
import org.junit.runner.RunWith;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.MethodSorters;

import calculator.Addition;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Addtion_test {
	
	static Addition aa;
	
	@BeforeClass // this annotation execute below code only once before start of any  Method..
	public static void Before_Class()
	{
		System.out.println("This is @BEFORE CLASS annotation.------");
		aa = new Addition();
	}
	
	@Before // This will run every time before each test method..
	public void before_each()
	{
		System.out.println("This is @Before annotation --");
		
	}
	@Test()
	@Ignore
	public void Addtion_test()
	{
		System.out.println("This is Addition test call in unit testing..");
		long result = aa.Addition(4, 1);
		
		assertEquals("The values are not matching...", 5, result);
		long result1 = aa.Addition(10000, 200000);
		assertEquals(210000, result1);
	}
	
	@Test
	@Category(Dev.class)
	public void a3_test2()
	{
		System.out.println("this is order 2");
	}
	@Test
	@Category(Dev.class)
	public void a1_Test3()
	{
		System.out.println("This is test case-3");
	}
	@Test(timeout=5)
	public void a0_Test4()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is test case-4");
	}
	
	@After // This annotation makes below code execute after each test method..
	public  void after()
	{
		System.out.println("This is @after annotation.");
	}
	
	
	
	@AfterClass // this annotation makes below method execute only once after executing all method.
	public static void After_Class()
	{
		System.out.println("This is @AFTER CLASS annotation.------");
		aa=null;
		System.out.println(aa);
	}

}
