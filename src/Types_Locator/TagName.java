package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName
{
	//it is a type of locator if there is not a double double tag name then we can use this type of locator
	
	public static void main(String[] args) 
	{
		//setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//Creating object of ChromeDriver by reference of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//to find address of UN and give input		
		driver.get("file:///D:/Software%20Testing/Automation/WebPages/tagname.html");
	
		//to find address of UN and give input	
		driver.findElement(By.tagName("input")).sendKeys("1234");
		
		//to find address of PW and give input
		driver.findElement(By.tagName("input")).sendKeys("fdfdsf");
	}

}
