package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_method 
{
		//isDisplayed() is in WebElement interface
			//this method is used to check element is present on webpage or not
				//this method returns boolean value 
					//if the element is present on WebPage then it will return true and if element is not present in WebPage then it will return Exception 
		
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
			
			//to findElement of Facebook logo 		
			WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
			
			//to check the element is present on WebPage or not
			boolean check = logo.isDisplayed();
			
			//to print
			System.out.println(check);
			

			
		}

}
