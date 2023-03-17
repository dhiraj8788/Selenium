package ListBox;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 
{
	//Display all selected options
	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			
			//to get url
			driver.get("https://www.Facebook.com/");
			
			//wait
			Thread.sleep(1000);
			
			//to find create new account webelement and click on it
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//wait
			Thread.sleep(1000);
			
			//to find drop down / list box
				//And store it into WebElement object
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			//creating object of Select Class and provide month object as parameter of Constructor of Select class
			Select s = new Select(month);
			
			//calling non-static getOptions() from Select class
				//And store it into List of WebElement
			List<WebElement> op = s.getOptions();
			
			//to iterate List of WebElement
			for(WebElement w : op)
			{
				String text = w.getText();
				System.out.println(text);
			}
			
			
		}

}
