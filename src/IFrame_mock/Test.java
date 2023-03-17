package IFrame_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			
			//wait
			Thread.sleep(1000);
			
			//to switch focus from main page to iframe
			driver.switchTo().frame("iframeResult");
			
			// to find add of element present on iframe and click on it
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
			Thread.sleep(1000);
			
			// to switch focus from iframe to main page
			// By parentFrame();
			driver.switchTo().parentFrame();
			
			//By defaultContent();
			driver.switchTo().defaultContent();
			
			//find add of element present on main page and click on it
			driver.findElement(By.xpath("[//a[@id='tryhome']")).click();
			
			
			
			
			
			
			
			
			
		}

}
