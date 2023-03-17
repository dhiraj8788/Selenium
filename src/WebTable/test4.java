package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 
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
			
			//	To get data at row[2] columns
			// use for loop
			
			//First we have to find address of parent table 
			//then we have to find address of parent row of that column
			//then find address of columns
			//store it into WebElement object
			
			for(int i = 1; i<=3; i++)
			{
				//First we have to find address of parent table 
				//then we have to find address of parent row of that column
				//then find address of columns
				WebElement data = driver.findElement(By.xpath("((//table[@id='1234']//tr)[2]//td)["+i+"]"));
				
				
				//to get text
				System.out.print(data.getText()+"\s");
				
			}
			
			
			
			
			
			
			
		}

}
