package Pop_Up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_or_child_browser_pop_up 
{
		//Handle Window/child browser pop-up
		public static void main(String[] args) throws InterruptedException 
		{
			//set browser
			System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			//create object of chromedriver by reference of WebDriver
			WebDriver driver = new ChromeDriver();
			
			//to get url
			driver.get("https://skpatro.github.io/demo/links/");
			
			//wait
			Thread.sleep(1000);
			
			//to find new tab and click on it
			driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
			
			//wait
			Thread.sleep(1000);
			
			//to switch selenium focus from main browser window to child browser window
				//step I: get Ids of browser windows by getWindowHandles() which is present in WebDriver(I)
				//step II: store it into set<String> because getWindowHandles() returns set<String>
				//step III: create object of String ArrayList like ArrayList<String> and pass IDs object as parameter of constructor
				//step IV: call get() present in ArrayList to get value at index and IDs of main page and child page 
					//will be store by index form in ArrayList object
				//step V : switch the focus of selenium from main page to child page by using switchTo().window(give parameter of object which stores page ID) 
					//and this method is present in WebDriver(I) and return type is TargetLOcator
					//And return type of window is WebDriver and it is present in TargetLocator interface
			
			
			//to get Ids of browser windows by getWindowHandles() which is present in WebDriver(I)
				//store it into set<String> because getWindowHandles() returns set<String>
			Set<String> IDs = driver.getWindowHandles();
			
			//create object of String ArrayList like ArrayList<String> and pass IDs object as parameter of constructor
			ArrayList<String> al = new ArrayList<String>(IDs);
			
			
			//calling get() to get value at index 0 (For main window page)
				//And store it into String object
			String mainPageID = al.get(0);
			
			

			//calling get() to get value at index 1 (For child window page)
				//And store it into String object
			String childPageID = al.get(1);
			
			
			//swtich the focus of selenium from main page to child page
			driver.switchTo().window(childPageID);
			
			//Now click on training field present on child page
			//to find training element present on child browser
			driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
			
			//wait
			Thread.sleep(1000);
			
			//to click on New window which is present on Main page
				//first we have switch the focus of selenium from child page to main page
				//we have window IDs so by using object in which Ids are store we can call swtichTo().window()
			driver.switchTo().window(mainPageID);
			
			//to find New Window and click on it which is present on Main page
			driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		}

}
