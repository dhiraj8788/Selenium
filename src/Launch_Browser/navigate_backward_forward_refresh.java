package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_backward_forward_refresh 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Calling static setProperty() from System Class
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//creating an object of ChromeDriver from WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		//Calling navigate().to() from WebDriver interface
		driver.navigate().to("https://www.facebook.com/");
		
		
		//wait
		Thread.sleep(3000);
		
		
		//Calling navigate().to() from WebDriver interface
		driver.navigate().to("https://www.instagram.com/");
		
		
		//wait
		Thread.sleep(4000);
		
		
		//Calling navigate().backward() from WebDriver interface
		driver.navigate().back();
		
		//wait
		Thread.sleep(4000);
		
		
		//Calling navigate().refresh() from WebDriver interface
		driver.navigate().refresh();
		
		//wait
		Thread.sleep(3000);
		
		
		//Calling navigate().forward() from WebDriver interface
		driver.navigate().forward();
		
		//wait
		Thread.sleep(3000);
		
		//navigate().refresh() from WebDriver
		driver.navigate().refresh();
		
		
	}

}
