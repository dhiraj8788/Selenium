package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_method 
{
			//getText method is in WebElement interface
				//getText() is used to get the text present on WebPage
		
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
			
			//to get the text of Log in
			String s = text.getText();
			
			//to print
			System.out.println(s);
		
		}

}
