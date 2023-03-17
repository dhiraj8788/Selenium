package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 
{
	@Test
	public void TC1()
	{
		Reporter.log("TC1 is executed", true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("TC2 is executed", true);
	}


}
