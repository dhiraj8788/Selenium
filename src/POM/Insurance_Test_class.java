package POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurance_Test_class 
{
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
		{
			//Steps for opening browser
			// 1. Name of the browser
			// 2. Path of the ChromeDriver.exe file
	
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	
	
			//Creating an object of ChromeDriver with the reference of WebDriver
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			//wait
			Thread.sleep(1000);
			
			//create object of Insurance_LogIn_WebPage class
			Insurance_LogIn_WebPage logIn = new Insurance_LogIn_WebPage(driver);
			
			//to get data from Excel sheet
			//create object of FileInputStream
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//Open file and to reach upto sheet
			Sheet s = WorkbookFactory.create(file).getSheet("Sheet6");
			
			//to email from file
			String mail = s.getRow(0).getCell(0).getStringCellValue();	
			
			//to get password from Excel sheet
			String password = s.getRow(0).getCell(1).getStringCellValue();
			
			
			//calling method for mail
			logIn.enterEmail(mail);
			
			//wait
			Thread.sleep(1000);
			
			//calling method for password
			logIn.enterPassword(password);
			
			//wait
			Thread.sleep(1000);
			
			//calling method to clik on log in button
			logIn.clickOnLogInButton();
					
			//Create object of INsurance_Broker_system class
			Insurance_Broker_system broker = new Insurance_Broker_system(driver);
			
			//to get ExpectedEmail from Excel Sheet
			String ExpectedEmail = s.getRow(0).getCell(2).getStringCellValue();
			
			//calling method for Expected Email
			broker.verifyEmail(ExpectedEmail);
			
			//wait
			Thread.sleep(1000);
			
			broker.clickOnLogOut();
			
			driver.close();
			
			
			
			
			
			
		}

}
