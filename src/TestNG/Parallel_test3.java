package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_test3 
{
	@Test
	public void openFlipkart()
	{
		//setProperty() from System class
				System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
				
				//create object of ChromeDriver by reference of WebDriver
				WebDriver driver = new ChromeDriver();
				
				//to get url
				driver.get("https:/Flipkart.com/");
	}

}
