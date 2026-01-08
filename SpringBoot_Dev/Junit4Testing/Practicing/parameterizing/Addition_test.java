package parameterizing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;



@RunWith(value =Parameterized.class)
	public class Addition_test 
	{
		int a;
		int b;
		int result;
	
	public Addition_test(int a, int b, int result)
	{
		this.a =a ;
		this.b = b;
		this.result = result;
	}
@Parameterized.Parameters
	public static Collection<Object[]> testvalues()
	{
		return Arrays.asList( new Object[][] {{2,4,6},{1,1,3}});
	}
	
@Test
	//@Parameters(name="testvalues")
	public void addition()
	{
		Addition ad = new Addition();
		int resut1 = ad.addi(a, b);
		Assert.assertEquals(result, resut1);
		
	}

}
