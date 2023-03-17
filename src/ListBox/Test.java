package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test 
{
		//Handle drop down with Select Class
			//by select text
		public static void main(String[] args) throws InterruptedException
		{
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//creating object of ChromeDriver by reference of WebDriver
			WebDriver driver = new ChromeDriver();
			
			//get url
			driver.get("https://www.Facebook.com/");
			
			//wait 
			Thread.sleep(1000);
			
			//to find Create new Account element
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//wait
			Thread.sleep(1000);		//we have to provide wait after clicking new account other wise it will throw exception

			
			//to find list box/drop down and store it into WebElement object
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			//creating the object of Select Class
			Select s = new Select(month);
			
			//calling method by selectByVisibleText
			s.selectByVisibleText("Apr");
			
		}

}
