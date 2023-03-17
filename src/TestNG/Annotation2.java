package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 
{
	
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Browser Opened",true);
	}
	
	@BeforeMethod
	public void logIn()
	{
		Reporter.log("Loged in an application", true);
	}
	
	
	@Test
	public void TC1()
	{
		Reporter.log("Test Case 1 is running", true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Test Case 2 is running", true);
	}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("Loged out an application", true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Browser is closed", true);
	}
	
	

}
