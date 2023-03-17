package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disabled_TC_test3 
{
	//By using include
		/*
		 * 	1. create test suite
		 * 	2. open class
		 * 	3. open method
		 * 	4. write <include name = Test Case name/>(which we want to run test cases)
		 * 	5. close method
		 * 	6. close class
		 */
	
	@Test
	public void TC1()
	{
		Reporter.log("TC 1 is executed", true);
	}

	@Test
	public void TC2()
	{
		Reporter.log("TC 2 is executed", true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("TC 3 is executed", true);
	}

}
