package Pop_Up_for_mock;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop_up 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdrver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(1000);
		
		
		//to switch the focus of selenium from main page to alert pop-up
		Alert al =  driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
		
		al.accept();
		
		
		
		
		
		
		
		
	}

}
