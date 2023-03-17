package Action_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test4 
{
							// 4.Double Click
		public static void main(String[] args) throws InterruptedException 
		{
			// set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//For Chrome V 111
			//create object of ChromeOptions
			ChromeOptions co = new ChromeOptions();
			
			//calling addArgument () as parameter --remote-allow-origins=*
			co.addArguments("--remote-allow-origins=*");
			//pass object of ChromeOptions as parameter of ChromeDriver constructor	
			
			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver(co);			//Up casting
			
			// to maximize
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			// wait
			Thread.sleep(1000);
			
			//Step I:
			// find the double click on me to see Alert element and store it into webelemnt object
			WebElement double_click_on_me = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			//Step II:
			//create object of Actions class and pass driver object as parameter of Constructor
			Actions ac = new Actions(driver);
			
			//Step III:
			//call non-static doubleClick(); present in Actions Class and returns Actions and pass double_click_on_me object as parameter for(Double Click)
			//call non-static perform(); present in Actions class an returns void
			ac.doubleClick(double_click_on_me).perform();
			
			//wait
			Thread.sleep(1000);
			
			
			//to click on Ok present in Alert pop-up
			//Step I:
			//switch the focus of selenium from main page to alert pop
			//call non static switchTo(); present in WebDriver(I) and returns
			//And store it into object have Alert return type
			
			Alert al = driver.switchTo().alert();
			
			//Step II:
			// call accept(); present in Alert and return void
			al.accept();
		}

}
