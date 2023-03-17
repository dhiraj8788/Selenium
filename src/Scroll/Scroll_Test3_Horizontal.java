package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Test3_Horizontal 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		Thread.sleep(1000);
		
		WebElement VBScript = driver.findElement(By.xpath("(//div[@class='canvas-middle'])[6]"));
		
		// type cast 
		// horizontal scroll
		// ("arguments[0].scrollInto()",address of VBScript)
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",VBScript);
		
		
	}

}
