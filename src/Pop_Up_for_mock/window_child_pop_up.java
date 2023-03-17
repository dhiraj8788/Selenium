package Pop_Up_for_mock;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_child_pop_up 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdrver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		
		
		Set<String> IDs = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(IDs);
		
		String IdOfMainPage = al.get(0);
		
		System.out.println(IdOfMainPage);
		
		String IdOfChildPage = al.get(1);
		
		System.out.println(IdOfChildPage);
		
		
		driver.switchTo().window(IdOfChildPage);
		
		driver.findElement(By.xpath("//i[@class='fa-fw fab fa-youtube']")).click();
	}

}
