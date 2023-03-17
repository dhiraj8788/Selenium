package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_dependsOnMethod 
{

	//If 1 TC execution depends on multiple TC then we need to use "dependsOnMethods" TestNG keyword.
	
	/*
	 * 	we write dependsOnMethods keyword for TC3
	 * 	
	 * 	so TC3 is depends on TC2
	 *  if TC2 will fail then TC3 is skipped
	 *  
	 *  if TC2 is passed then TC2 will execute
	 */

	@Test
	public void TC1()
	{
		Reporter.log("TC1 is executed", true);
		
	}
	
	@Test
	public void TC2()
	{
		//to fail the test case
		Assert.fail();
		
		Reporter.log("TC2 is executed", true);
	}
	
	@Test(dependsOnMethods= {"TC2"})
	public void TC3()
	{
		Reporter.log("TC3 is executed", true);
	}
}

