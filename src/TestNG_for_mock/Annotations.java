package TestNG_for_mock;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations 
{
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Browser Opened", true);
	}
	
	@BeforeMethod
	public void hitUrl()
	{
		Reporter.log("Hit url and log in ", true);
	}
	
	
	@Test
	public void A_validateEmail()
	{
		Reporter.log("Validating Test Case",true);
	}
	
	@Test
	public void B_validateLogo()
	{
		Reporter.log("Validating Test Case 2", true);
	}
	
	@Test
	public void C_validateElements() 
	{
		Reporter.log("Validating Test Case 3", true);
		
	}

	@AfterMethod
	public void logOut()
	{
		Reporter.log("Loged out ", true);
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Brower closed", true);
	}
}
