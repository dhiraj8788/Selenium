package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class test5 
{
					// 5.Drag and Drop
		public static void main(String[] args) throws InterruptedException 
		{
			// set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");

			//For Chrome V 111
			//Create object of ChromeOptions
			ChromeOptions co = new ChromeOptions();
			
			//calling addArguments() with parameter --remote-allow-origins=*
			co.addArguments("--remote-allow-origins=*");
			//Pass object of ChromeOptions as ChromeDriver constructor
			
			//create object of ChromeDriver
			WebDriver driver = new ChromeDriver(co);			// Up casting
			
			// to maximize
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			//wait
			Thread.sleep(1000);
			
			//Step I:
			//find 5000 element and store it into WebElement object
			WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
			
			//find amount field box and store it into WebElement object
			WebElement desti = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
			
			
			//Step II:
			//create objet of Actions class and pass driver object as parameter of Constructor
			Actions ac = new Actions(driver);
			
			//Step III:
			//call non-static dragAndDrop(); present in Actions Class and pass source and desti objects as parameter for(Drag and Drop)
			//call perform() from Actions class returns void
			ac.dragAndDrop(source,desti).perform();
			
		}

}
