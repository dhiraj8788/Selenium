package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_priority2 
{
	//if we give same priority to multiple test cases then it will execute based on their alphabetical order
	
	/*	All three test cases have same priority
	 * 	so, it will execute according to their alphabetical order
	 * 
	 * 	TC 1 will execute first then TC2 will execute and then TC3 execute
	 * 
	 */

	@Test(priority=1)
	public void TC1()
	{
		Reporter.log("TC1 is executed", true);
		
	}

	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("TC2 is executed", true);
	}
	
	@Test(priority=1)
	public void TC3()
	{
		Reporter.log("TC3 is executed", true);
	}
}
