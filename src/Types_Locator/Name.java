package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name 
{
		//it is a type of Locator which used when multiple add are not there in DevTool of any application
	
	public static void main(String[] args) 
	{
		//setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Creating object of ChromeDriver by reference of WebDriver(I)
		WebDriver driver = new ChromeDriver();
		
		
		//to get url
		driver.get("file:///D:/Software%20Testing/Automation/WebPages/name2.html");
		
		//to find add of UN and give input
		driver.findElement(By.name("1234")).sendKeys("Dhiraj");
		
		//to find add of PW and give input
		driver.findElement(By.name("1234")).sendKeys("dhiraj@8412");
		
		
		
	}

}
