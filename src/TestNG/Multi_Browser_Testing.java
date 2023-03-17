package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multi_Browser_Testing 
{
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver = null;
		
		if(browserName.equals("Chrome"))
		{
			// for Chrome 
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
				driver = new ChromeDriver();				
		}	
		
		else if(browserName.equals("firefox"))
		{
			// for fire fox
			System.setProperty("webdriver.gecko.driver","D:\\Software Testing\\Chrome Driver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
			// to hit url
			driver.get("https://demo.guru99.com/insurance/v1/index.php");
			
			//to find user name field and pass input
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saradeg41@gmail.com");
			
			//wait
			Thread.sleep(1000);
			
			//to find password field and pass input
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sai@1117");
			
			//wait
			Thread.sleep(1000);
			
			//to find logIn button and click on it
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			
			//Test case : Validate actual and expected email
			
			String ExcpectedEmail = "saradeg41@gmail.com";
			
			WebElement w = driver.findElement(By.xpath("//h4[text()='saradeg41@gmail.com']"));
			
			String ActualEmail = w.getText();
			
			Assert.assertEquals(ActualEmail, ExcpectedEmail);
			
			Reporter.log("Test case is passed", true);
			
			
	}

}
