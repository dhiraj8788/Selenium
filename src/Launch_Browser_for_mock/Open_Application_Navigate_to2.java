package Launch_Browser_for_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Application_Navigate_to2 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);

		driver.navigate().refresh();

		Thread.sleep(5000);
		
		driver.navigate().to("https://www.instgram.com/");

		Thread.sleep(5000);

		driver.navigate().refresh();

		Thread.sleep(5000);

		driver.navigate().back();

		Thread.sleep(5000);

		driver.navigate().refresh();

		driver.close();
	}

}
