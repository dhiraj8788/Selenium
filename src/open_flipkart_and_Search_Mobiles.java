import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_flipkart_and_Search_Mobiles 
{
		public static void main(String[] args) throws InterruptedException 
		{
			
			//setProperty()
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//Creating object by reference of WebDriver(I)
			
			WebDriver driver = new ChromeDriver();
	
			//to maximize the window
			driver.manage().window().maximize();
			
			//to get url
			driver.get("https://www.flipkart.com/");
			 
			//wait
			Thread.sleep(1000);
			
				//to find search element and give input
			driver.findElement(By.xpath(("(//img[@class='_396cs4'])[2]"))).click();
			
			
		}

}
