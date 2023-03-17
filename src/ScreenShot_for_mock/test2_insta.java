package ScreenShot_for_mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class test2_insta 
{
	public static void main(String[] args) throws InterruptedException, IOException 
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
		
		//to get Screen shot of the web page
					//Type casting/Down casting/converting
		//putting it into source object of File Class
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//to print location of ss
		System.out.println(source);
		
		//creating object of file class to copy the ss into its object
		File desti = new File("D:\\Software Testing\\Screen Shot Automation\\InstaMock.jpg");
		
		//calling static copy() present in  FileHandler Class
		FileHandler.copy(source, desti);
		
		
	}

}
