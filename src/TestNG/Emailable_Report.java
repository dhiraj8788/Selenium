package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	@Test					//Test case 1 / method
	public void m1()
	{
		Reporter.log("m1 is running", true);
		
	}
	
	@Test					//Test case 2
	public void m2()
	{
		Reporter.log("m2 is Running", true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("m3 is RUnning", true);
	}
	
	@Test
	public void m4()
	{
		// Assert.fail();     // Assert.fail(); is used to fail the test case
		Reporter.log("m4 is running", true);
	}
	
	@Test
	public void m5()
	{
		Reporter.log("m5 is running", true);
	}
	

}
