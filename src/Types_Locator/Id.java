package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id 
{
	//	Id it is a type of Locator which used when the multiple id address are not there in DevTool of any application

	public static void main(String[] args) 
	{
		//setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//Creating object of ChromeDriver by reference of WebDriver
		WebDriver driver = new ChromeDriver();
		
		//to get url
		driver.get("file:///D:/Software%20Testing/Automation/WebPages/id1.html");
		
		//to find address of UN and give input
		driver.findElement(By.id("abc123")).sendKeys("123");
		
		//to find address of PW and give input
		driver.findElement(By.id("abc456")).sendKeys("1234@abc");
	
	}
}
