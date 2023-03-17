package POM_with_DDF_TestNG_baseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Insurance_test_Class extends Base_Class
{
	//public WebDriver driver ;		- due to inheritance
	
	//Declare logIn object of POM_Class1 globally
	POM_Class1 logIn;
	
	//Declare logIn object of POM_Class2 globally
	POM_Class2 broker;
	
	
	String TestCaseID;
	
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		//Initialize logIn object
		logIn = new POM_Class1(driver);
		
		//Initialize broker object
		
		broker = new POM_Class2(driver);
		
	}
	
	
	
	@BeforeMethod
	public void logIntoApp() throws IOException
	{
		logIn.enterEmail(Utility_Class.fetchData("Email"));
		
		logIn.enterPassword(Utility_Class.fetchData("Password"));
		
		logIn.clickOnLoginBtn();
	}
	
	
	@Test(priority=1)
	public void verifyEmail() throws EncryptedDocumentException, IOException
	{
		TestCaseID = "TC1";
		
		String ActualEmail = broker.getEmail();
		
		String ExpectedEmail = Utility_Class.getDataFromExcel(0,0);
		
		//Verify
		Assert.assertEquals(ActualEmail, ExpectedEmail);
	
	}
	
	@Test(priority=2)
	public void verifyTitle() throws EncryptedDocumentException, IOException
	{
		TestCaseID = "TC2";
		
		String ActualTitle = driver.getTitle();
		
		String ExpectedTitle = Utility_Class.getDataFromExcel(1, 0);
		
		//verify
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);	
		
	}
	
	@AfterMethod
	public void logOutFromApp(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			Utility_Class.getScreenShot(driver,TestCaseID);
		}
		
		broker.logOut();
	}
	
	@AfterClass
	public void closeTheBroser()
	{
		driver.quit();
	}	
}
