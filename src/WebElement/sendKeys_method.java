package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys_method 
{
		//WebElement is an interface which is used to perform actions on WebPage
		
		/*sendKeys is the method in WebElement 
		 * sendKeys used to enter value in input field on WebPage
		 * 	
		 * 		Syntax--> .sendKeys("Input value");
		 */
		
		public static void main(String[] args) 
		{
			//to set Name of the browser and path of the ChromeDriver
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			
			//to Create object of ChromeDriver by reference of WebDriver(I)
			WebDriver driver = new ChromeDriver();
			
			
			//to get url
			driver.get("https://www.facebook.com/");
			
			//to findElement of email or mobile no and give input		
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dummy User");	//sendKeys() for enter value in input field
		}

}
