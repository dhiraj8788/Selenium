package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test 
{
							//Action Class
				/*
				 * Action Class is predefined class in selenium
				 * We can perform mouse related and keyboard related actions by using Action Class
				 */
	
	/*
	 * 	I.Mouse related actions
	 * 
	 * 		1.Move cursor
	 * 		2.Right click
	 * 		3.Left Click
	 * 		4.Double Click
	 * 		5.Drag an drop
	 */
	
	
							// 1.Move Cursor
	
		public static void main(String[] args) throws InterruptedException 
		{
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32_2\\chromedriver.exe");
			
			//It is for Chrome V 111
			//create object of ChromeOptions
			ChromeOptions co = new ChromeOptions();
			
			//calling adAgruments(); as parameter --remote-allow-origins=*
			co.addArguments("--remote-allow-origins=*");
			
			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver(co);			//Up casting
			
			
			//to get url
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			//wait
			Thread.sleep(1000);
			
			//Step I:
			//find drop down element and store it into WebELement object
			WebElement dropdown = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
			
			//Step II:
			//create object of Action Class and pass driver object as parameter of COnstructor
			Actions ac = new Actions(driver);
			
			//Step III:
			//call non-static moveToElement(); present in Actions class and returns Actions
			//and call perform() from Actions and returns void this method is for perform action
			ac.moveToElement(dropdown).perform();
			
			//wait
			Thread.sleep(1000);
			
			//to find Alerts element present in drop down of SwitchTo and click on it
			driver.findElement(By.xpath("//a[text()='Alerts']")).click();
				
		}	
}
