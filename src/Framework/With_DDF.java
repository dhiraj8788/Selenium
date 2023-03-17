package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF 
{
			// With Data Driven Framework (DDF)
	
				// Test Case : Verify Email address
		
				/*Steps :
				 * 
				 *  	1.Open browser
				 *  	2.Hit url
				 *  	3.Access Excel sheet
				 *  	4.Enter email and password from Excel Sheet
				 *  	5.Click on Log In button
				 *  	6.Verify Email address
				 */
	
		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
		{
			//Step 1 :
			//Steps for opening browser
			// 1. Name of the browser
			// 2. Path of the ChromeDriver.exe file

			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");


			//Creating an object of ChromeDriver with the reference of WebDriver

			WebDriver driver = new ChromeDriver();
		
			//Step 2 :
			//Get url
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			//Step 3: 
			//Access Excel sheet
			//Create object of FileInputStream and pass path of Excel sheet as parameter of constructor
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//to open Excel sheet 
			Sheet s =WorkbookFactory.create(file).getSheet("Sheet6");
			//get data from Sheet 6 at row(0) cell(0) for user name
			//and store it into String object
			String email = s.getRow(0).getCell(0).getStringCellValue();
			
			//to open Excel sheet and get data from Sheet 6 at row(0) cell(1) for password
			//and store it into String object
			String password= s.getRow(0).getCell(1).getStringCellValue();
			
			
			//to open Excel sheet and get data from Sheet 6 at row(0) cell(2) for Expected result
			//and store it into String object
			String expectedResult = s.getRow(0).getCell(2).getStringCellValue();
			
			//Step 4 :
			//find email input field and pass input from Excel sheet
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			
			//wait
			Thread.sleep(1000);
			
			//find password input field and pass input from Excel sheet
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			
			//wait
			Thread.sleep(1000);
			
			
			//Step 5 :
			
			//find login button and click on it
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			
			
			//Step 6:
			
			//find email address element and store it into WebElement object
			//get text of element
			WebElement t = driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
			
			String actualResult = t.getText();
			
			
			//Now verify Expected and Actual result
			
			if(expectedResult.equals(actualResult))
			{
				System.out.println("Email is verified test case is passed");
			}
			else
			{
				System.out.println("Email is not verified test case is failed");
			}
			
		}
				

}
