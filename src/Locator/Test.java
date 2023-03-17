package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
								//Xpath by attribute
	
	public static void main(String[] args) throws InterruptedException 
	{
		//calling setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//creating an object of chromedriver with reference of WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("8600412337");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Dhiraj@8412");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
	}

}
