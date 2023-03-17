package Guru_Bank_project;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base_Class
{
	//WebDriver driver;			due to inheritance
	
	//declare globally object of POM1_LogIn
	POM1_LogIn login;
	
	//declare globally object of POM2
	POM2 register;
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		
		//create object of POM1_LogIn
		login = new POM1_LogIn(driver);
		
		//create object of POM2
		register = new POM2(driver);
		
	}
	
	@BeforeMethod
	public void logInToApp() throws IOException, InterruptedException
	{
	
		login.enterUserId(Utility_Class.getDataFromPF("UserId"));
		
		login.enterPassword(Utility_Class.getDataFromPF("Password"));
		
		login.clickOnLoginBtn();
		
	
	}
	
	@Test (priority = 1)
	public void veifyManagerText() throws EncryptedDocumentException, IOException
	{
		String ActualText = register.getTextOfManager();
		
		String ExpectedText = Utility_Class.getDataFromExcel(0, 0);
		
		Assert.assertEquals(ActualText, ExpectedText);
		
	}
	
	@Test (priority = 2)
	public void verify_New_Customer_Text() throws EncryptedDocumentException, IOException
	{
		String ActualText = register.getTextOfNewCustomer();
		
		String ExpectedText = Utility_Class.getDataFromExcel(0, 1);
		
		Assert.assertEquals(ActualText,ExpectedText);
	}
	
	@AfterMethod
	public void logOutFromApp(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			Utility_Class.getScreenShot(driver);
		}
		
		
		register.clickOnLogout();
	}

	@AfterClass
	public void closeApp()
	{
		
		Alert a = driver.switchTo().alert();
		
			a.accept();
		
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
}
