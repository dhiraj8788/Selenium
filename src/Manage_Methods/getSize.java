package Manage_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.amazon.in/");
			
			Dimension s1 = driver.manage().window().getSize();
			
			System.out.println(s1);
	
	}

}
