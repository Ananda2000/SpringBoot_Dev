package calculator_test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runnerclass {
	public static void main(String [] args)
	{
		// NOTE -- THIS ONE GETTING ERROR BELOW. NEED TO FIX IT .
		//Caused by: java.lang.ClassNotFoundException: org.junit.runner.JUnitCore 
		// FOR TIME BEING AM RUNNING "JUNITTESTSUITE.JAVA" CLASS.
		
		//Result rst = 
				JUnitCore.runClasses(AllTests.class);
		/*for(Failure flr : rst.getFailures())
		{
			System.out.println(flr.toString());
		}
		System.out.println(rst.wasSuccessful());
		*/
	}

}
