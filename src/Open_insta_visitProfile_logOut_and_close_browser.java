import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_insta_visitProfile_logOut_and_close_browser 
{
		
		public static void main(String[] args) throws InterruptedException 
		{
			//setProperty()
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//Creating object of ChromeDriver by reference of WebDriver(I)
			WebDriver driver = new ChromeDriver();		//Up Casting
			
			//to get url
			driver.get("https://www.instagram.com/");
			
			//to maximize the browser
			driver.manage().window().maximize();
			
			//wait
			Thread.sleep(1000);
			
			//to find user name element and give input
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dhirajchauhan2612");
			
			//wait
			Thread.sleep(1000);
			
			//to find password element and give input
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dhiraj@8600");
			
			//wait
			Thread.sleep(1000);
			
			//to find log in button and click on it
			driver.findElement(By.xpath("//div[text()='Log in']")).click();
			
			//wait
			Thread.sleep(1000);
			
			//to find the address of not now button on save log in pop-up
			driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
			
			//wait
			Thread.sleep(1000);
			
			//to find the address of not now button on notification pop-up
			//driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
			
			
			
		}

}
