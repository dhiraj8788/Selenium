package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.Facebook.com/");
		
		String Url = driver.getCurrentUrl();
		
		System.out.println(Url);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.Instagram.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		
	}

}
