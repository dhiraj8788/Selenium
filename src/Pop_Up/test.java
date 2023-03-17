package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
						// Handle Alter pop-up
	
	public static void main(String[] args) throws InterruptedException 
	{
		//setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//create object of ChromeDriver by reference of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//to get url
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//wait 
		Thread.sleep(2000);
		
		//to find the Customer Id and give input
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		
		//wait
		Thread.sleep(1000);
		
		//to find submit button and click on it
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//to switch the focus of selenium from main page to alter pop-up 
		Alert alt = driver.switchTo().alert();
		
		//wait
		Thread.sleep(1000);
		
		//to click on ok on alter pop-up
		alt.accept();
		
		//wait
		Thread.sleep(1000);
		
		//again to click on ok button on alter pop-up
		alt.accept();
		
		
		
	}

}
