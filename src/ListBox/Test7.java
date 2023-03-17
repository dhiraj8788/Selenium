package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 
{
		public static void main(String[] args) throws InterruptedException 
		{
			//calling setProperty()
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//create object of WebElement by reference of ChromeDriver
			WebDriver driver = new ChromeDriver();
			
			
			//to get url
			driver.get("https:/Facebook.com/");
			
			//wait
			Thread.sleep(1000);
			
			//to find Create new account element
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//wait
			Thread.sleep(1000);
			
			//to find drop down/ list box and store it into WebElement object
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			//to create object of Select Class and give month object as parameter of Constructor
			Select s = new Select(month);
			
			//to check drop down is multi-selectble or not
				//write is non-static() present in Select Class
					//And store it into boolean object
			boolean multiple = s.isMultiple();
			
			System.out.println(multiple);
			
			//calling non-static getOptions() present in Select Class
				//And store it into list of WebElement
			List<WebElement> listOfOptions = s.getOptions();
			
			//to iterate list of WebElement
			for(WebElement w : listOfOptions)
			{
				//calling non-static() present in WebElement(I)
				String options = w.getText();
				System.out.println(options);
			}
			
			//to select Apr option
				//calling non-static selectByVisibleText() from Select class
			s.selectByVisibleText("Apr");
			
			//to get address of selected option
			WebElement firstOption = s.getFirstSelectedOption();
			
			//to get text of first selected option
				//And Store it into String object
			String text = firstOption.getText();
			
			System.out.println(text);
			
			
		}

}
