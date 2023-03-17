package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2
{
	@Test
	public void TC3()
	{
		Reporter.log("TC3 is executed", true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("TC4 is executed", true);
	}


}
