package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	
	WebDriver driver;
	
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

}
