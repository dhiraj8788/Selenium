package Locator_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Creating object of ChromeDriver with reference of WebDriver(I)
		WebDriver driver = new ChromeDriver();
		
		//to get url
		driver.get("https://www.instagram.com/");
		
		//wait
		Thread.sleep(1000);
		
		//to find user name field and to give input
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']")).sendKeys("mr_dhiraj_rajput_");
		
		//to find pass word field and give input
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dhiraj@8412");
		
		//wait
		Thread.sleep(1000);
		
		//to find log in button and click
		driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']")).click();
	}

}
