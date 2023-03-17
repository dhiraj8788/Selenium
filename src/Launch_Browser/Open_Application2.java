package Launch_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Application2 
{
	public static void main(String[] args) 
	{
		//	For opening browser
		 // Steps-
		// 1.Name of the browser
		// 2. path of the ChromeDriver.exe file
		
		
		//Method from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Create object of ChromeDriver
		
		ChromeDriver driver = new ChromeDriver();
		
		//calling get() which is in RemoteWebDriver
		
		driver.get("https://www.instagram.com/");
	}

}
