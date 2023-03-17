package TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal_Class 
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
			
		
	}

}
