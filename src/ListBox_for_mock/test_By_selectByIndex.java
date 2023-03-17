package ListBox_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test_By_selectByIndex 
{
	//By selectByIndex
		//NOTE: We have to provide wait after click on create new account

		public static void main(String[] args) throws InterruptedException 
		{
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//creating object of CHromeDriver
			WebDriver driver = new ChromeDriver();		//up casting
			
			//to get url
			driver.get("Https://Facebook.com/");
			
			//to find create new account element and click on it
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//wait
			Thread.sleep(1000);			//we have to provide wait after click on create new account
			
			//to find drop down/list box and store it into WebElemnt object
			WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			
			//create object of Select Class 
			Select s = new Select(month);
			
			//calling selectByIndex method
			s.selectByIndex(4);
			
		}

}
