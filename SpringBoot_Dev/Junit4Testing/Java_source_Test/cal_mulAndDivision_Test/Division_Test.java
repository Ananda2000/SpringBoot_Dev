package cal_mulAndDivision_Test;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import cal_mulAndDivision.Division;

public class Division_Test 
{
	
	Division div = null;
	public Division_Test()
	{
		div = new Division();
	}

	@Test
	public void division_2_numbers()
	{
		Float div_value =div.division_of_numbers(4, 2);
		System.out.println(div_value);
		//assertEquals(2.0, div_value);
	}
}
