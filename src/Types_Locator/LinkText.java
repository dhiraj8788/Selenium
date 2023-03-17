package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText 
{
		//it is a type of Locator which is used when multiple text add are not there in DevTool 
	public static void main(String[] args) 
	{
			//setProperty() from System Class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
			//Creating object of ChromeDriver by reference of WebDriver
		WebDriver driver = new ChromeDriver();
		
			//to get url
		driver.get("file:///D:/Software%20Testing/Automation/WebPages/linktext.html");
		
			//to find add of facebook and click
		driver.findElement(By.linkText("facebook")).click();
		
	}

}
