package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Native_Method 
{
	public static void main(String[] args) 
	{
		//Calling setProperty() from System class
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Creating object of ChromeDriver with reference of WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		
		//Calling native() from WebDriver to open application
		driver.navigate().to("https://www.facebook.com/");
		
	}

}
