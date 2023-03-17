package Locator_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		//to get url
		driver.get("https://www.instagram.com/");
		
		//wait
		Thread.sleep(1000);
		
		//to find user name field and input
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("DhirajRajput"); 	//used xpath by attribute because text is not there in username field
		
		//wait
		Thread.sleep(1000);
		
		//to find forget password text and click
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		
		
	}

}
