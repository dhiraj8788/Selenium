package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_timeOut 
{
	/*
	 * 	If test class contains multiple test methods if one of the test method is time consuming 
	 * 	to execute then TestNG by default fail that TC & executes the other TC.
	 * 
	 * 	so we apply (timeOut=3000)
	 * 	it will wait till 3 second if under 3 second it complete its execution then this test case will pass other wise fail
	 */
	
	@Test
	public void TC1()
	{
		Reporter.log("TC1 is executed", true);
	}
	
	@Test(timeOut=3000)
	public void TC2() throws InterruptedException
	{
		//wait
		Thread.sleep(5000);
		
		Reporter.log("TC2 is executed", true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("TC3 is executed", true);
	}
	

}
