package Customized_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test2 
{
								//Actions Class using by Keyboard

		//Customized list box means there is not select Tag name
	
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
			
			//find Day drop down and store it into WebElement object
			WebElement day = driver.findElement(By.id("day"));
			
			//create object of Actions class
			//pass driver object as parameter of Constructor
			Actions ac = new Actions(driver);
			
			//call non static click() from Action class returns void
			//pass day object as parameter of click()
			//call perform() to perform action
			ac.click(day).perform();
			
			//wait
			Thread.sleep(1000);
			
			//call non-static sendKeys() from Actions class
			//pass Keys enum and HOME constant for go at top at Day drop down
			//call perform() to perform action
			ac.sendKeys(Keys.HOME).perform();
			
			//wait
			Thread.sleep(1000);
			
			
			//to select 17th option of day drop down
			
			for(int i = 1; i<=16; i++)
			{
				//to reach on option
				//call non-static sendKeys() from Actions class
				//pass Keys enum and ARROW_DOWN constant for go downward at Day drop down
				//call perform() to perform action
				ac.sendKeys(Keys.ARROW_DOWN).perform();
			}
			
			//wait
			Thread.sleep(1000);
			
			//to select option
			//call non-static sendKeys() from Actions class
			//pass Keys enum and ENTER constant for press Enter
			//call perform() to perform action
			ac.sendKeys(Keys.ENTER).perform();
			
		}

}
