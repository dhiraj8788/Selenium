package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_method 
{
		//Clear method is in WebElement interface
			// clear() is used to clear the value in text field
	
		public static void main(String[] args) throws InterruptedException 
		{
			//to set Name of the browser and path of the ChromeDriver
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			
			//to Create object of ChromeDriver by reference of WebDriver(I)
			WebDriver driver = new ChromeDriver();
			
			
			//to get url
			driver.get("https://www.facebook.com/");
			
			//to findElement of email or mobile no and give input		
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dummy User");
			
			//wait
			Thread.sleep(1000);
			
			//to findElement of email or mobile no and clear the value
			driver.findElement(By.xpath("//input[@name='email']")).clear();
		}

}
