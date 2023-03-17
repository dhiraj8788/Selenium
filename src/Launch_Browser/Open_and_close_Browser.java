package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_and_close_Browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Calling the static setProperty()which is in System class
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//Creating an Object of ChromeDriver class 
		//with the reference of WebDriver Interface
		
		WebDriver driver = new ChromeDriver();				//Up casting
		
		//Calling the non-static get()which is in WebDriver interface
		driver.get("https://www.amazon.in/");
		
		
		//Calling the static sleep() which is in Thread Class
		Thread.sleep(5000);
		
		//Calling the non-static close()which is in WebDriver interface
		driver.close();
	}

}
