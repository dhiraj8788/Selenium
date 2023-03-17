package WebElement_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_method 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();		//up casting
		
		//to get url
		driver.get("https://www.facebook.com/");
		
		//wait
		Thread.sleep(1000);
		
		//to find add of login button
		WebElement W1 = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		//to check the element present on WebPage or not
		boolean D = W1.isDisplayed();
		
		//to print
		System.out.println(D);
		
	}

}
