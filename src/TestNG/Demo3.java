package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	@Test
	public void TC5()
	{
		Reporter.log("TC5 is executed", true);
	}
	
	@Test
	public void TC6()
	{
		//to fail test case
		//Assert.fail();
				
		Reporter.log("TC6 is executed", true);
	}

}
