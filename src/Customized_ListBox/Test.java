package Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Test 
{
								// Handle drop_down without using select class
	
					//select option by using Action class by keywords
	
		public static void main(String[] args) throws InterruptedException
		{
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");

			//For Chrome 111 V
			//Create object of ChromeOptions
			ChromeOptions co = new ChromeOptions();
			
			//Caling addAguments() with parameter --remote-allow-origins=*
			co.addArguments("--remote-allow-origins=*");
					
			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver(co);				//Up casting
			
			//to maximize
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https:/Facebook.com/");
			
			//wait
			Thread.sleep(1000);
			
			// find Create new account element and click on it
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//wait
			Thread.sleep(1000);
			
			//Step I:
			//find drop down element and store it into WebElement object by id() (if Select tag name is not there)
			WebElement month = driver.findElement(By.id("month"));
		
			//Step II:
			//create object of Actions Class and pass driver object as parameter
			Actions ac = new Actions(driver);
			
			//Step III:
			//call click(); present in Actions class and pass month object as paramter 
			//call perform()
			ac.click(month).perform();
			
			//To select option by keyboard down arrow
			
			//wait
			Thread.sleep(1000);
			
			//Step IV:
			//call sendKeys() from Actions class and pass enum and constant in enum as parameter returns
			//call perfrom() from Actions
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			ac.sendKeys(Keys.ARROW_DOWN).perform();
			
			//wait
			Thread.sleep(1000);
			
			//Step V:
			//call sendKeys() from Actions class and pass enum and constant in enum as parameter returns
			//call perform()
			ac.sendKeys(Keys.ENTER).perform();
			
			//wait
			Thread.sleep(1000);
			
			//call click(); present in Actions class and pass month object as paramter 
			//call perform()
			ac.click(month).perform();
			
			//To select option by keyboard Up arrow
			
			//call sendKeys() from Actions class and pass enum and constant in enum as parameter returns
			//call perform()
			ac.sendKeys(Keys.ARROW_UP).perform();
			ac.sendKeys(Keys.ENTER).perform();
			
			
		}

}
