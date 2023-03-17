package Customized_ListBox_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test 
{
		public static void main(String[] args) throws InterruptedException 
		{
				//set browser
				System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
				
				//create object of chromedriver
				
				WebDriver driver = new ChromeDriver();			//Up casting
				
				//to get url
				driver.get("https:/Facebook.com/");
				
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				
				//wait
				Thread.sleep(1000);
				
				WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
				
				//Actions object
				
				Actions ac = new Actions(driver);
				
				ac.click(day).perform();
				
				ac.sendKeys(Keys.HOME).perform();
				
				Thread.sleep(1000);
				
				
				for(int i = 1; i<=9; i++)
				{
					ac.sendKeys(Keys.ARROW_DOWN).perform();
				}
				
				Thread.sleep(1000);
				
				for(int i = 1; i<=5; i++)
				{
					ac.sendKeys(Keys.ARROW_UP).perform();
				}
				
				Thread.sleep(1000);
				
				// to press enter
				ac.sendKeys(Keys.ENTER).perform();
		}

}
