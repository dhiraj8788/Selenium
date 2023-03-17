package Handle_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
			//To handle multiple elements by findElements();
	
		public static void main(String[] args) throws InterruptedException 
		{
			
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");

			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver();				//Up casting
			
			//to maximize
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https:/Facebook.com/");
			
			//wait
			Thread.sleep(1000);
			
			//To find all link elements
			//call findElements() present in WebDriver and returns List<WebElement>
			//store it into object have List<WebElement> return type
			List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
			
			//to get Text of each element
			// call getText() present in WebElement in for each loop
			
			for(WebElement w : allLinks)
			{
				String text = w.getText();
				
				System.out.println(text);
				
			}
			
		}

}
