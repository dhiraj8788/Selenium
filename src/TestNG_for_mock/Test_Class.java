package TestNG_for_mock;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class 
{
	@Test
	public void m3()
	{
		Reporter.log("Test Case", true);
	}
	
	@BeforeMethod
	public void m2()
	{
		Reporter.log("m2 is Running",true);
	}
	
	@BeforeClass
	public void m1()
	{
		Reporter.log("m1 is Running",true);
	}
	
	@AfterMethod
	public void m4()
	{
		Reporter.log("m4 is Running", true);
	}
	
	@AfterClass
	public void m5()
	{
		Reporter.log("m5 is Running", true);
	}
	

}
