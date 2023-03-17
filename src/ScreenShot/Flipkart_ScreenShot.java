package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_ScreenShot 
{
		public static void main(String[] args) throws InterruptedException, IOException
		{
			
			//setProperty() from System
			
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//to create object of ChromeDriver by reference of WebDriver
			WebDriver driver = new ChromeDriver();							//up casting
			
			//to get url
			driver.get("https://www.flipkart.com/");

			//to maximize
			driver.manage().window().maximize();
			
			//wait
			Thread.sleep(2000);
			
			//type casting / converting / down casting
			/*
			 * allocating method into object of File class which is predefine in selenium
			 * 
			 */
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			System.out.println(source);
			
			//create object of File class and give the path of the folder in the constructor of File class
			
			File desti = new File("D:\\Software Testing\\Screen Shot Automation\\Flipkart ss.jpg");
			
			//calling copy method it is a static method which is present in FileHandler class
			//return type of copy is void
			FileHandler.copy(source, desti);
			
		}

}
