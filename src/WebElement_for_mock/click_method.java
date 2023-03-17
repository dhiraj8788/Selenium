package WebElement_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_method 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();		//up casting
		
		//to get url
		driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(1000);
		
		//to give input and find add of mo element
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dhiraj");
		
		//wait
		Thread.sleep(1000);
		
		//to find add of pass element
		WebElement login = driver.findElement(By.xpath("//input[@id='pass']"));
		
		
		//to click on pass
		login.click();
		
		
	}

}
