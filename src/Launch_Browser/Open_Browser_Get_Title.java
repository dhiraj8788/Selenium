package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_Get_Title 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Calling setProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//Creating an object of ChromeDriver by reference of WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		//calling get() from WebDriver interface
		driver.get("https://www.amazon.in/");		//for getting URL
		
		String title = driver.getTitle();			//For printing title of application
		
		Thread.sleep(1000);
		
		System.out.println("The Title of the Application :"+title);
		
		
	}

}
