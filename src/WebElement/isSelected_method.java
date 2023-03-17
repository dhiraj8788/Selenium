package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_method 
{
			//isSelcted method is present in WebElment interface
				//isSelected () returns boolean value
					//it used to check the radio button is selected or not
					
	
		public static void main(String[] args) 
		{
			//setProperty() from System class
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			
			//creating object of ChromeDriver with reference of WbDriver
			WebDriver driver = new ChromeDriver();
			
			//to get url
			driver.get("https://www.facebook.com/");
			
			//to maximize the window
			//driver.manage().window().maximize();
			
			//to find create new account element and click on it
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			//to find male radio element 
			WebElement Radio = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		
			
			//to check the radio button is selected or not
			//creating variable and assigning radio.isSelected()
			boolean Check = Radio.isSelected();
			
			//print
			System.out.println(Check);
			
		
		}

}
