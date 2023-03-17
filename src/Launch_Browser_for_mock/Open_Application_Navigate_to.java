package Launch_Browser_for_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Application_Navigate_to 
{
	public static void main(String[] args) throws InterruptedException 
	{
			//Calling static setProperty() from System Class
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
			//Creating an Object of ChromeDriver with the reference of WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		
			//Calling non-static navigate() from WebDriver 
		driver.navigate().to("https://www.facebook.com/");				//Giving URL
		
		
			//wait
		Thread.sleep(3000);
		
			//Calling non-static navigate() from WebDriver 
		driver.navigate().to("https://www.instagram.com/");	
		
		
			//wait
		Thread.sleep(5000);
		
			//Calling non-static navigate().back()
		driver.navigate().back();										//for Backward
		
		
			//wait
		Thread.sleep(5000);
		
		
			//Calling non-static navigate().forward()
		driver.navigate().forward();
		
	}

}
