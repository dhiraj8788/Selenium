package Locator_for_mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_index 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Xpath by index use when there are many duplicate addresses 
		//	Syntax - (//tag name[@attribute name='attribute value'])[index]  
		
		//seProperty() from System class
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		//creating object of ChromeDriver by reference of WebDriver(I)
		WebDriver driver = new ChromeDriver();
		
		//to get url
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook Opened");
		
		
		//to find sign up field and click
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		System.out.println("Clicked on Sign up");
		//wait
		Thread.sleep(1000);
		
		//to find First name field and enter input
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Dhiraj");	//Xpath by index
		System.out.println("Entered First Name");
		
		//to find Surname field and enter input
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Rajput");	//Xpath by index
		System.out.println("Entered Last name");
		
		//to find mobile no or email field and enter input
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8600412337");	//Xpath by index
		System.out.println("Entered Mobile No");
		
		//to find password field and enter input
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Dhiraj@8412");	//Xpath by index
		System.out.println("Entered Password");
		
		//wait
		Thread.sleep(1000);
		
		//to find day field of DOB and click on 17
		driver.findElement(By.xpath("//option[text()='17']")).click();	//Xpath by text
		System.out.println("Click on day as 17");
		
		//wait
		Thread.sleep(1000);
		
		//to find month field and click on Apr
		driver.findElement(By.xpath("//option[text()='Apr']")).click();	//Xpath by text
		System.out.println("Clicked on month as Apr");
		
		//wait
		Thread.sleep(1000);
		
		//to find Year field and click on 1999
		driver.findElement(By.xpath("//option[text()='1999']")).click();	//Xpath by text
		System.out.println("Clicked on year as 1999");
		
		//wait
		Thread.sleep(1000);
		
		//to find male radio button and click on it
		driver.findElement(By.xpath("//label[text()='Male']")).click();		//Xpath by text
		System.out.println("Selected male radio button");
		
		//wait
		Thread.sleep(1000);
		
		//to find submit button and click on it
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();		//Xpath by attribute
		System.out.println("Clicked on Sign Up");
	}

}
