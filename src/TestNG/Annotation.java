package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation 
{
	
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Browser Opened", true);
	}
	
	@BeforeMethod
	public void logIn()
	{
		Reporter.log("Log in to Application", true);
	}
	
	@Test				//Test Case / Method
	public void TC1()
	{
		//Verify Email 
		Reporter.log("TC1 is running", true);
	}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("Loged out", true);
	}
	
	@AfterClass
	public void closeBrower()
	{
		Reporter.log("Browser Closed", true);
	}

	

}
