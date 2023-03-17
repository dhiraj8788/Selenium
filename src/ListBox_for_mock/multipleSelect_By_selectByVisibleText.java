package ListBox_for_mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelect_By_selectByVisibleText 
{
	// multiple select
		//By selectByVisibleText method

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
			
			//creating object of select Class and give options as parameter of Constructor of Select class
			Select s = new Select(options);
			
			//multiple select
			
			//calling non-static selectByVisibleText() present in Select Class
			s.selectByVisibleText("Aus");
			
			//wait
			Thread.sleep(1000);
			
			//calling non-static selectByVisibleText() present in Select Class
			s.selectByVisibleText("Ind");
			
			//wait
			Thread.sleep(1000);
			
			//to get text of first selected option
			//step I: 
			//calling non-static getFirstSelectedOption() present in Select Class this method will find the address of first selected option
			//now we have to store the address of first selected option in a Web Element object
			WebElement selectedOption =  s.getFirstSelectedOption();
			
			//step II :
			//calling non-static getText() present in WebElement(I)
			//and store it into String Variable because this method returns String value
			String text = selectedOption.getText();
			
			//step III :
			//Print text
			System.out.println(text);
			
			//to deselected option
			s.deselectByVisibleText("Aus");
		
		}

}
