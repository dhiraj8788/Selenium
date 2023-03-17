package ListBox_for_mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test_By_selectByVisibleText2 
{
		//selectByVisibleText
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https:/Facebook.com/");
			
			//wait
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//wait
			Thread.sleep(1000);
			
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
			Select s = new Select(day);
			
			//s.selectByVisibleText("17");
					
			//s.selectByValue("2");
			
			s.selectByIndex(9);
			
			WebElement selectedOption = s.getFirstSelectedOption();
			
			System.out.println(selectedOption.getText());
			
			
			
			List<WebElement> alloptions = s.getOptions();
			
			for(WebElement w :alloptions)
			{
				String text = w.getText();
				System.out.println(text);	
			}
	
			
			
			
			
			
			
			
			
			
			
		}

}
