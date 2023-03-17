package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test
{
		public static void main(String[] args) throws InterruptedException 
		{
			
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver();
			
			// to hit url
			driver.get("file:///D:/Software%20Testing/Automation/Selenium/Web%20Table/MultiSelectable%20Listbox.html");
			
			//wait
			Thread.sleep(1000);
			
			//to find the all elements in WebTable and store it into object have List<WebElement>
			List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
			
			//to get size of row
			System.out.println(allRows.size());
				
			//to get values
			for(WebElement w : allRows)
			{
				System.out.println(w.getText());
			}
			
			
			
			
		}

}
