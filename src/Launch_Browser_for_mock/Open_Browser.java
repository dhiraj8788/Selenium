package Launch_Browser_for_mock;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser
{
	public static void main(String [] args)
	{
				//Steps for opening browser
				// 1. Name of the browser
				// 2. Path of the ChromeDriver.exe file
	
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");

		//Creating an object of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
	}
}
