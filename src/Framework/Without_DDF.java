package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF 
{
		// Without Data Driven Framework (DDF)
	
			// Test Case : Verify Email address
	
			/*Steps :
			 * 
			 *  	1.Open browser
			 *  	2.Hit url
			 *  	3.Enter email and password
			 *  	4.Click on Log In button
			 *  	5.Verify Email address
			 */
			
		
		public static void main(String[] args) throws InterruptedException 
		{
			//Step 1 :
			//Steps for opening browser
			// 1. Name of the browser
			// 2. Path of the ChromeDriver.exe file
	
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	
	
			//Creating an object of ChromeDriver with the reference of WebDriver
	
			WebDriver driver = new ChromeDriver();
			
			//Step 2 :
			//Get url
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			//wait
			Thread.sleep(1000);
			
			//Step 3 :
			//find email input field and pass input by findElement();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saradeg41@gmail.com");
			
			//wait
			Thread.sleep(1000);
			
			//find password input field and pass input by findElement();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sai@1117");
			
			//wait
			Thread.sleep(1000);
			
			//Step 4 :
			//find login button and click on it
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			//Step 5 :
			
			String expectedResult = "saradeg41@gmail.com";
			
			// find address of Email and store it into object WebElement return type
			WebElement s = driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
			
			//to get text on WebElement
			String actualResult = s.getText();
			
			//Verify actual and expected results
			
			if(expectedResult.equals(actualResult))
			{
				System.out.println("Email is verified: Test Case Pass");
			}
			else
			{
				System.out.println("Email is not verifield: Test Case Fail");
			}

		}

}
