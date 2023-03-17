package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class1 extends Base_Class
{
	//WebDriver driver;
	
	//initializeBrowser()

	
	//declare POM1_Class_Dhiraj object globally
	POM1_Class_Dhiraj_logIn login ;
	
	//declare POM_Class2_After_Login object globally
	POM_Class2_After_Login registered;
	
	String TestCaseID;
	
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		//Create object of POM1_Class_Dhiraj_logIn
		login = new POM1_Class_Dhiraj_logIn(driver);
		
		//Create object of POM_Class2_After_Login
		registered = new POM_Class2_After_Login(driver);
		
	}
	
	
	@BeforeMethod
	public void logINtoApp() throws IOException
	{

		login.enterEmail(Utility_Class2.getDataFromPropertyFile("Email"));
		
		login.enterPassword(Utility_Class2.getDataFromPropertyFile("password"));
		
		login.clickOnlogInBtn();
		
	
	}
	
	
	@Test(priority=1)
	public void TC1() throws EncryptedDocumentException, IOException
	{
		
		TestCaseID = "TC1";
		
		registered.clickOnProfile();
		
		String ActualText = registered.getTextUnderProfile();
		
		String ExpectedText = Utility_Class2.getDataFromExcel(0, 0);
		
		Assert.assertEquals(ActualText,ExpectedText);
		
	}
	
	@Test(priority=2)
	public void TC2() throws EncryptedDocumentException, IOException
	{
		TestCaseID = "TC2";
		
		String ActualEmail = registered.getEmail();
		
		String ExpectedEmail = Utility_Class2.getDataFromExcel(0,1);
		
		Assert.assertEquals(ActualEmail,ExpectedEmail);
		
	}
	
	@Test(priority=3)
	public void TC3() throws EncryptedDocumentException, IOException
	{
		TestCaseID = "TC3";
		
		//click on Home
		registered.clickOnHome();
		
		//verify broker insurance Web page name
			//get ActualTitle
		String ActualTitle = registered.getTitleUnderHome();
		
			//get ExpectedTile
		String ExpectedTitle = Utility_Class2.getDataFromExcel(0,2);
		
		//Verify
		Assert.assertEquals(ActualTitle,ExpectedTitle);

	}
	
	@AfterMethod
	public void logOutFromApp(ITestResult Result) throws IOException
	{
		//if one of the TC is failed then take ScreenSHot for that
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			//call takeScreenShot()
			Utility_Class2.takeScreenShot(driver,TestCaseID);
			
		}
		
		registered.clickOnLogOutBtn();
	}
	
	@AfterClass
	public void closeTheApp()
	{
		driver.quit();
	}
		
}
