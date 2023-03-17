package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://Facebook.com/");
		
		//Type casting
		//Scroll up : enter 2nd parameters +ve pixel value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		
		//wait
		Thread.sleep(1000);
		
		//Type casting
		//Scroll up : enter 2nd parameters +ve pixel value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
	}

}
