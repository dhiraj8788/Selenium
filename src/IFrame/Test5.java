package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{
		//1. first perform action on iframe
		//2. then perform action on main page
	
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
		
		//to switch focus on iframe
		//call switchTo().frame() by passing String framename as parameter of frame()
		// switchTo() returns-->TargetLocator
		// frame() returns-----> WebDriver
		driver.switchTo().frame("iframeResult");
		
		//Now focus is on iframe
		

		//to find and click on click me to display date and time element present on IFrame on Web page
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//wait
		Thread.sleep(1000);
		
		// Now we have to switch selenium focus from iframe to main page to perform actions on main page
		// We can switch focus from iframe to main page By 2 methods
		// 1.switchTo().parentFrame();
		// 2.switchTo().defaultContent();
		
		//to switch focus from iframe to main page
		//call switchTo().parentFrame() from WebDriver(i)
		// switchTo() returns-->TargetLocator
		// parentFrame() returns-----> WebDriver
		driver.switchTo().parentFrame();
		
		// Now focus is on main page
		// we can perform action on main page
		
		// to find and click on Home link 
		driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-home']")).click();
		
		
		
		
		
		
	}

}
