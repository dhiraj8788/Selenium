package Types_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_linkText 
{
		//it is a type of LOcator which used when multiple text add are not there in DevTool 
			// Partial linkText is a like suppose text is 'Facebook' so we can write 'Face'
	public static void main(String[] args) 
	{
			//setProperty() from System Class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
			//Creating object of ChromeDriver by reference of WebDriver(I)
		WebDriver driver = new ChromeDriver();
			
			//to get url
		driver.get("file:///D:/Software%20Testing/Automation/WebPages/linktext.html");
		
		
			//to find facebook text and click
		driver.findElement(By.partialLinkText("face")).click();
		
	}

}
