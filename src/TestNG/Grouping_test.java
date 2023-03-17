package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_test 
{
	@Test(groups="Health insurance")
	public void TC1()
	{
		Reporter.log("TC1 is executed", true);
	}
	

	@Test(groups="Health insurance")
	public void TC2()
	{
		Reporter.log("TC2 is executed", true);
	}

	@Test(groups="Health insurance")
	public void TC3()
	{
		Reporter.log("TC3 is executed", true);
	}
	

	@Test(groups="Life insurance")
	public void TC5()
	{
		Reporter.log("TC5 is executed", true);
	}
	
	@Test(groups="Life insurance")
	public void TC6()
	{
		Reporter.log("TC6 is executed", true);
	}
	

	@Test(groups="Life insurance")
	public void TC7()
	{
		Reporter.log("TC7 is executed", true);
	}

	@Test(groups="Car insurance")
	public void TC8()
	{
		Reporter.log("TC8 is executed", true);
	}
	

	@Test(groups="Car insurance")
	public void TC9()
	{
		Reporter.log("TC9 is executed", true);
	}
	
}
