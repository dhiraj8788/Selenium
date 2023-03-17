package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Test2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		Thread.sleep(1000);
		
		//find address of career and store it into object
		WebElement career = driver.findElement(By.xpath("//a[text()='Career Guru99']"));
		
		//type cast 
		// scroll down upto career tab
		//Scroll down : scroll to view ("arguments[index].scrolltoView()",address of career tab)
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",career);
		
	}

}
