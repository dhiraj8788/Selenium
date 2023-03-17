package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName 
{
		//it is a type of Locator which use when multiple same add are not there in DevTool of any application
	
	public static void main(String[] args) 
	{
		//setProperty() from System Class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Creating object of ChromeDriver by reference of WebDriver(I)
		WebDriver driver = new ChromeDriver();		//up casting
		
		//to get url
		driver.get("file:///D:/Software%20Testing/Automation/WebPages/class2.html");
		
		//to find add of UN and give input
		driver.findElement(By.className("xyz12")).sendKeys("Dhiraj");
		
		//to find add of PW and give input
		driver.findElement(By.className("xyz12")).sendKeys("DA");
	}

}
