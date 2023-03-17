package POM_with_DDF_TestNG_baseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Base_Class 
{
	//Base Class to write code for Open Browser
	
	
	
	public WebDriver driver ;
	
	public void initializeBrowser()
	{
		//set browser
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
				
				
		//create object of chromedriver by refeernce of WebDriver (I)
		driver = new ChromeDriver();
				
		
		//get url
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		// provide implicit wait
		//if we provide implicit wait 5 sec and url is opened in 2 sec then it will not wait for remaining 3 sec 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

}
