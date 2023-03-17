package ScreenShot_for_mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class test 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//set browser
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//creating object of ChromeDriver by reference of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//get url
		driver.get("https://www.Facebook.com/");
		
		//wait 
		Thread.sleep(1000);
		
		//to find Create new Account element
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//down casting/converting
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		//creaing object of File to copy the ss in files object
		File desti = new File("D:\\Software Testing\\Screen Shot Automation\\facebook for mock.jpg");
		
		//to copy screenshot
			//caling copy() it is a static method in FileHandler class
		FileHandler.copy(source, desti);
		
	}

}
