package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Application 
{
	public static void main(String[] args) 
	{
				//Steps for opening browser
				// 1. Name of the browser
				// 2. Path of the ChromeDriver.exe file
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Creating an object of ChromeDriver with the reference of WebDriver
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.instagram.com/");
		
	}

}
