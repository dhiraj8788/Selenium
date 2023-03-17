package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_pop_up 
{
		//Handle Hidden_Division_pop_up
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//create Object of ChromeDriver by reference of WebDriver
			WebDriver driver = new ChromeDriver();
			
			//to get url
			driver.get("https:/Flipkart.com/");
			
			//wait
			Thread.sleep(1000);
			
			//to find enter mo no field 
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8600412337");
			
			//to find submit button
			driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		}

}
