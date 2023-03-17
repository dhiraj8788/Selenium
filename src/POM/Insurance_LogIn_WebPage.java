package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_LogIn_WebPage 
{
	
				//Web pages are represented as classes(No of webpages=No of POM Classes)
				//The various elements on the webpage are defined as variables in the class.
				//Data members/Global Variables should be declared globally with access level private by using @findby
				
			//for email
		@FindBy (xpath="//input[@id='email']")	 private WebElement Email ;	// private WebElemnt Email = driver.findElement(By.xpath("//input[@id='email']"));
		
		
			//for password
		@FindBy(xpath="//input[@id='password']") private WebElement Password ;  // private WebElemnt Password = driver.findElement(By.xpath("//input[@id='password']"));
		
			//for Log in button 
		@FindBy(xpath="//input[@name='submit']") private WebElement LogInButton ; //private WebElement LogInButton = driver.findElement(By.xpath("//input[@name='submit']"));
		
		
		//Initialize within a constructor with access level public using pagefactory
			//public parameterized constructor
				//pass object of WebDriver object as parameter of constructor
		public Insurance_LogIn_WebPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			/*
			 * 	initElement() convert @findBy annotation into findElements(By.xpath("Xpath expression")) with driver object because we pass driver as its parameter
 			 */
		}
		
		//Utilize within a method with access level public
		//to pass input in Email field
		public void enterEmail(String mail)
		{
			Email.sendKeys(mail);
		}
		
		//to pass input in password field
		public void enterPassword(String password)
		{
			Password.sendKeys(password);
		}
		
		//to click on log in button
		public void clickOnLogInButton()
		{
			LogInButton.click();
		}

		
		

}
