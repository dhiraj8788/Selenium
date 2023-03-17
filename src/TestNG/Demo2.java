package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void TC3()
	{
		//to fail test case
		//Assert.fail();
		
		Reporter.log("TC3 is executed", true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("TC4 is executed", true);
	}

}
