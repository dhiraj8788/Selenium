package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_method 
{
		//isEnabled method is in WebElement interface
			//this method is used to check the element is enable or not 
				//return type of isEnabled() is boolean
					//if the element is enable then it return true and if the element id disable then return false
	
		public static void main(String[] args) throws InterruptedException 
		{
			//to set Name of the browser and path of the ChromeDriver
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			
			//to Create object of ChromeDriver by reference of WebDriver(I)
			WebDriver driver = new ChromeDriver();
			
			
			//to get url
			driver.get("https://www.facebook.com/");
			
			//wait.
			Thread.sleep(1000);
			
			//to findElement of login 		
			WebElement text = driver.findElement(By.xpath("//button[text()='Log in']"));
			
			//to get element is enables or not
			boolean Enable  = text.isEnabled();
			
			//to Print
			System.out.println(Enable);
			
			
			
			
		}

}
 