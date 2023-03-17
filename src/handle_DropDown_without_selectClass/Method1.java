package handle_DropDown_without_selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Method1 
{
	//	Method 1. By storing all options in list and iterating
	
		public static void main(String[] args) throws InterruptedException 
		{
			//setProperty()
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//For Chrome 111 V
			//Create object of ChromeOptions
			ChromeOptions co = new ChromeOptions();
			
			//Caling addAguments() with parameter --remote-allow-origins=*
			co.addArguments("--remote-allow-origins=*");
			
			//Creating object by reference of WebDriver(I)
			
			WebDriver driver = new ChromeDriver(co);
	
			//to maximize the window
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https://www.bstackdemo.com/");
			
			Thread.sleep(1000);
			
			//step1: find the drop down element
			driver.findElement(By.xpath("//select")).click();
			
			//step2: store the all options in list as web element 
			List<WebElement> Options = (List<WebElement>) driver.findElement(By.cssSelector("Select Option"));
			
			String op = "Lowest to highest";
			
			//step 3 : iterate the list by loop and click the given option
			for(int i = 0; i<=Options.size()-1; i++)
			{
				if(Options.get(i).getText().contains(op))
				{
					Options.get(i).click();
				}
			}
			
		}

}
