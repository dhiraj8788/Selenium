import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_cick_ation 
{
	
	
		public static void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.dhiraj.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https:/Facebook.com/");
			
			Thread.sleep(1000);
			
			
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
			
			WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
			
			WebElement Career = driver.findElement(By.xpath("//a[text()='Careers']"));
			
			
			
			Actions ac = new Actions(driver);
			
			//ac.contextClick(userName).perform();
			//ac.click(logo).perform();
			
			Thread.sleep(1000);
			
			ac.click(logo).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.END).perform();
			
			Thread.sleep(1000);
			
			ac.click(Career).perform();
			
		}

}
