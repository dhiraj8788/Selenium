package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_method 
{
	
			//click method is in WebElement interface
				//click() is used to click on the button , select the radio buttons and check box
	
	public static void main(String[] args) throws InterruptedException 
	{
		//to set Name of the browser and path of the ChromeDriver
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//to Create object of ChromeDriver by reference of WebDriver(I)
		WebDriver driver = new ChromeDriver();
		
		
		//to get url
		driver.get("https://www.facebook.com/");
		
		//wait.
		Thread.sleep(1000);
		
		//to findElement of login and click on it		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
	}

}
