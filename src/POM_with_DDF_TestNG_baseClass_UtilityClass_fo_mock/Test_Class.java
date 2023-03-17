package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base_Class 
{
	POM_LogIn_page logIn;
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		//Create object of POM_Login_page
		logIn = new POM_LogIn_page(driver);
		
	}
	
	
	
	@BeforeMethod
	public void logInToApp() throws IOException
	{
		logIn.enterUserName(Utility_Class.getDataFromPropertyFile("US"));
		
		logIn.enterPass(Utility_Class.getDataFromPropertyFile("pass"));
		
		logIn.clickLogInBtn();
		
		
	}
	
	
	
	@Test
	public void profileIsClickableOrNot()
	{
		
	}

}
