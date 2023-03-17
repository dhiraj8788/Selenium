package POM_for_mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Insurance_Broker_system;
import POM.Insurance_LogIn_WebPage;

public class test_Insurance 
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
		LogIn_Page_Insurance logIn = new LogIn_Page_Insurance(driver);
		
		//to get data from Excel File
		//Create object of FileInputStream
		FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
		
		//to open file and reach upto sheet6
		Sheet s= WorkbookFactory.create(file).getSheet("Sheet6");
		
		//to get Email from excel sheet
		String Email = s.getRow(0).getCell(0).getStringCellValue();
		
		//to get Password from Excel Sheet
		String Pass = s.getRow(0).getCell(1).getStringCellValue();
		
		
		//calling method
		logIn.enterEmail(Email);
		
		//wait
		Thread.sleep(1000);
		
		
		//calling method 
		logIn.enterPassword(Pass);
		
		//wait
		Thread.sleep(1000);
		
		//calling method
		logIn.clickLoginButton();
		
		
		//Create object of INsurance_Broker_system class
		Insurance_Broker_system broker = new Insurance_Broker_system(driver);
		
		//to get Exected Email from Excel file
		String ExpectedEmail = s.getRow(0).getCell(2).getStringCellValue();
		
		//calling method
		broker.verifyEmail(ExpectedEmail);

		//wait
		Thread.sleep(1000);
				
		//calling method
		broker.clickOnLogOut();
		
	}

}
