package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(200,500);
		
		driver.manage().window().setSize(d);
		
		Point p = new Point(500,100);
		
		driver.manage().window().setPosition(p);
		
		driver.get("https://www.Instagram.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		
	}

}
