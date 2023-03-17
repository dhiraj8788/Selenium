package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
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
			
			//to find address of columns present in 1st row in table
			//First we have to find address of parent table 
			//then we have to find address of parent row of that columns
			//then find address of column
			//store it into List<WebElement> object
			List<WebElement> allcolumns = driver.findElements(By.xpath("(//table[@id='1234']//tr)[1]//th"));
			
			//to get size 
			System.out.println(allcolumns.size());
			
			//to get data at columns at row(1)
			 
			for(WebElement w : allcolumns)
			{
				System.out.print(w.getText()+"\s");
			}
					
			
		}

}
