package Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test4 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//For Chrome 111 V
			//Create object of ChromeOptions
			ChromeOptions co = new ChromeOptions();
			
			//Caling addAguments() with parameter --remote-allow-origins=*
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(co);
			
			
			driver.get("https:/Facebook.com/");
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			Thread.sleep(1000);
			
			WebElement day = driver.findElement(By.id("day"));
			
			Actions ac = new Actions(driver);
			
			ac.click(day).perform();
			
			Thread.sleep(1000);
			
			//ac.sendKeys(Keys.END).perform();
			
			//Thread.sleep(1000);
			
			for(int i = 19; i>=1; i--)
			{
				ac.sendKeys(Keys.ARROW_DOWN).perform();
				
			}
			
			ac.sendKeys(Keys.ENTER).perform();
			
			
			
		}

}
