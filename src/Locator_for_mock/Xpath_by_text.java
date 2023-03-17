package Locator_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text 
{
	public static void main(String[] args) 
	{
		
		//setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//Creating object of chromeDriver with reference of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//to get url
		driver.get("https://www.instagram.com/");
		
		//to find log in with facebook text and click
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		
	}

}
