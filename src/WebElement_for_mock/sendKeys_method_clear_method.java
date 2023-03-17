package WebElement_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys_method_clear_method
{
		public static void main(String[] args) throws InterruptedException
		{
				
				System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
				
				WebDriver driver = new ChromeDriver();		//up casting
				
				//to get url
				driver.get("https://www.facebook.com/");
				
				//wait
				Thread.sleep(1000);
				
				//to find address of email or mo no element
				WebElement mail= driver.findElement(By.xpath("//input[@name='email']"));
				
				//to give input
				mail.sendKeys("ABC");
				
				//wait
				Thread.sleep(1000);
				
				//to clear the input
				mail.clear();
				
				//wait
				Thread.sleep(1000);
				
				//to give the input
				mail.sendKeys("Dhiraj");
				
				
		}

}
