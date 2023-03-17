package Guru_Bank_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class
{
	
	//declare WebDriver globally
	WebDriver driver ;
	
	
	
	public void initializeBrowser()
	{
		
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
			
	}
	
	
}
