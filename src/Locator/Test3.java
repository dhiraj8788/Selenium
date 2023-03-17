package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Flipkart.com/");
		
		Thread.sleep(1000);
		
		//Xpath with text
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//Xpath with attribute  
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8600412337");
		
		//Xpath with text
		//driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
		
	}

}
