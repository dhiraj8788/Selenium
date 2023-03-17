package Handle_Dynamic_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
{
						//To get Reviews of APPLE iPhone 14 Pro Max (Gold, 128 GB) in console
	public static void main(String[] args) throws InterruptedException 
	{
		//set browser
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//create object of ChromeDriver
		WebDriver driver = new ChromeDriver();			//Up casting
		
		//to maximize 
		driver.manage().window().maximize();
		
		//to get url
		driver.get("https:/Flipkart.com/");
		
		
		//wait
		Thread.sleep(1000);
		
		//find close(X) element of Hidden division pop-up and click on it
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//wait
		Thread.sleep(1000);
		
		// to find search box and give input
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("apple 14 pro max");
		
		//wait
		Thread.sleep(1000);
		
		//to find search button and click on it
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//wait
		Thread.sleep(1000);
		
		//To get reviews of APPLE iPhone 14 Pro Max (Gold, 128 GB)
		
		//To find dynamic element ----> dynamic means it will change
		//first find xpath of parent and in parent find xpath of child
		//store it into object have WebElement return type
		WebElement review = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]"));
		
		//To get text
		//call getText() from WebElement and returns String
		//store it into object have String return type
		String text = review.getText();
		
		System.out.println("Reviews of APPLE iPhone 14 Pro Max (Gold, 128 GB) is  --  "+text);	
		
		//wait
		Thread.sleep(2000);
		
		//to close tab
		driver.close();
		
	}

}
