package Locator_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("XYZ");
		
		driver.findElement(By.xpath("//input[contains(@name,'field')]")).sendKeys("1234");
	}

}
