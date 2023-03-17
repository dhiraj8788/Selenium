package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 
{
	@Test
	public void TC5()
	{
		Reporter.log("TC5 is executed", true);
	}
	
	@Test
	public void TC6()
	{
		Reporter.log("TC6 is executed", true);
	}


}
