package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Calling an static setProperty() from System class
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Creating an object of ChromeDriver with the reference of WebDriver interface
		WebDriver driver = new ChromeDriver();		//Up Casting
		
		
		//Calling the non-static get() from WebDriver interface to give URL
		driver.get("https://www.instagram.com/");
		
		driver.get("https://www.flipkart.com/");
		
		driver.get("https://www.facebook.com/");
		
		
		//wait
		Thread.sleep(5000);
		
		//Calling non-static quit method from WebDriver interface
		driver.quit();
	}

}
