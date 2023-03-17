package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{
	
		public static void main(String[] args) throws InterruptedException 
		{
			
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");

			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver();				//Up casting
			
			//to maximize
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			
			//wait
			Thread.sleep(1000);
			
			
			//switch focus from main to frame by passing String WebElement as parameter of frame()
			//call swtichTo().frame();
			// switchTo() returns-->TargetLocator
			// frame() returns-----> WebDriver
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
			
			//Now to focus is on IFrame
			
			//to find and click on click me to display date and time element present on IFrame on Web page
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
		}

}
