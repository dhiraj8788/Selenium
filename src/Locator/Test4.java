package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[contains(@id,'mail')]")).sendKeys("8600412337");
		
		driver.findElement(By.xpath("//input[contains(@id,'s')]")).sendKeys("Dhiraj@8412");
		
		driver.findElement(By.xpath("//button[contains(@id,'u')]")).click();
	}

}
