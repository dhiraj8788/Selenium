package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test2 
{
							// 2.Right Click
	
		public static void main(String[] args) throws InterruptedException 
		{
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//For Chrome V 111
			//create object of ChromeOptions 
			ChromeOptions co = new ChromeOptions();
			
			//calling addArguments() sa parameter --remote-allow-origins=*
			co.addArguments("--remote-allow-origins=*");
			//pass object of ChromeOptions as parameter of ChromeDriver constructor
			
			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver(co);			//Up casting
			
			//to maximize 
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https:/Flipkart.com/");
			
			
			//wait
			Thread.sleep(1000);
			
			//find close(X) element of Hidden division pop-up and click on it
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			//wait
			Thread.sleep(1000);
			
			
			//Step I:
			//to find cart element and store it into WebElement object
			WebElement cart = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
			
			//Step II:
			//create object of Actions class and pass driver object as parameter of Constructor
			Actions ac = new Actions(driver);
			
			//Step III:
			//call non-static contextClick();present in actions class and returns actions and pass cart object as parameter for(Right Click)
			//call non-static perform(); present in actions class for perform action and return void
			ac.contextClick(cart).perform();
			
			
			
			
		}

}
