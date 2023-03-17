package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 
{
	
		//to handle multiple select
			//By selectByIndex method

		public static void main(String[] args) throws InterruptedException 
		{
			//setProperty()
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//to create object of ChromeDriver
			WebDriver driver = new ChromeDriver();			//up casting
			
			//to get url
			driver.get("file:///D:/Software%20Testing/Automation/Selenium/MultiselectableListbox.html");
			
			//wait
			Thread.sleep(1000);
			
			//to find drop down/list box and store into object of WebElement
			WebElement options = driver.findElement(By.xpath("//select[@id='1234']"));
			
			//Create object of Select Class and give options object as a parameter of Constructor of Select Class
			Select s = new Select(options);
			
			//Selecting multiple options
			
			//calling non-static selectByIndex() present in Select Class
			s.selectByIndex(3);
			
			//wait
			Thread.sleep(1000);
			
			//calling non-static selectByIndex() present in Select Class
			s.selectByIndex(0);
			
			//wait
			Thread.sleep(1000);
			
			//to get text of first selected option
			//step I: 
			//calling non-static getFirstSelectedOption() present in Select Class this method will find the address of first selected option
			//now we have to store the address of first selected option in a Web Element object
			WebElement selectedOption = s.getFirstSelectedOption();
			
			//step II :
			//calling non-static getText() present in WebElement(I)
			//and store it into String Variable because this method returns String value
			String text = selectedOption.getText();
			
			//step III :
			//Print text
			System.out.println(text);
			
			//to deselect all options
			s.deselectAll();
			
	}
}
