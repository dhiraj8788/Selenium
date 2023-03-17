package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 
{
		//to handle multiple select
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
			
			//Create object of Select Class and options object in parameter of Constructor of Select Class
			Select s = new Select(options);
			
			//Selecting multiple options
			
			//calling selectByVisibleText()
			s.selectByVisibleText("Ind");
			
			//wait
			Thread.sleep(1000);
			
			//calling selectByVisibleText()
			s.selectByVisibleText("Aus");
			
			//wait
			Thread.sleep(1000);
			
			//dis select option Aus
			s.deselectByVisibleText("Aus");
			
			//to get text of first selected option
			//step I: 
			//calling non-static getFirstSelectedOption() present in Select Class this method will find the address of first selected option
			//now we have to store the address of first selected option in a Web Element object

			WebElement firstSelectedText = s.getFirstSelectedOption();
			
			//step II :
			//calling non-static getText() present in WebElement(I)
			//and store it into String Variable because this method returns String value
			String text = firstSelectedText.getText();
			
			//step III :
			//Print text
			System.out.println(text);
			
		}

}
