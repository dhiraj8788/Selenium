package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class test 
{
		public static void main(String[] args) throws IOException, InterruptedException 
		{
			//caling setProperty() from System Class to set chrome driver
			System.setProperty("webdriver.crome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//creatin object of chrome driver by reference of WebDrive
			WebDriver driver = new ChromeDriver();						//up casting
			
			//to get url
			driver.get("https://www.instagram.com/");
			
			//to maximize
			driver.manage().window().maximize();
			
			//wait
			Thread.sleep(2000);
			
			//Step:I
			//to get Screen shot of the web page
						//Type casting/Down casting/converting
			//putting it into source object of File Class
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			System.out.println(source);
			
			//Step:II
			//to give path for store screen shot
			/* crating object of File class which is predefine in selenium and putting path of the 
			 * folder in which we are going to save the Screenshot as parameter of the Constructor
			 */			
			File Destination = new File("D:\\Software Testing\\Screen Shot Automation\\Inst SS.jpg");
			
			//Step:III
			//calling copy method it is a static method which is present in FileHander class
			//FileHandler class is pre-defined in selenium
			//copy method is used to copy the ss from c drive to path which we are giving in the object of File class
			FileHandler.copy(source, Destination);
			
			
		}

}
