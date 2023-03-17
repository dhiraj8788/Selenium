package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
								//IFrame

			// To perform action on iframe 
	
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
			
				/* Now we want to perform action on frame present on Web page
				 * for that we have switch the selenium focus from main page to i frame
				 * to switch focus we have switchTo().frame();
				 * we have pass any one of the following as parameter of fame()
				 * 1.String framename----->name attribute
				 * 2.String frameid	 ----->id attribute
				 * 3.int frameindex----->index
				 * 4.WebElement--------> WebElement
				*/
				
				//switch focus by passing String frame name
				
				//call switch().frame() from WebDriver(i)
				// switchTo() returns---> TargetLocator
				// frame() returns ----> WebDriver(I)
				driver.switchTo().frame("iframeResult");
				
				//Now focus is on IFrame we can perform action on IFrame
				
				//to find and click on click me to display date and time element present on IFrame on Web page
				driver.findElement(By.xpath("//button[@type='button']")).click();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		}
	

	
}
