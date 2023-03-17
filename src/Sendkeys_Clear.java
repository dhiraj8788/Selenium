import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Clear
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("9511655673");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).clear();
		
	}

}
