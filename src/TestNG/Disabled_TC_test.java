package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disabled_TC_test 
{
	//if we disabled Test case then it will not execute
	
	//By using enabled="false"
	
	@Test
	public void TC1()
	{
		Reporter.log("TC 1 is executed", true);
	}

	@Test(enabled=false)
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
