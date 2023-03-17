package POM_for_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page_Insurance 
{
	
		//Step 1 :
	// Class created for Log In page
	
		//Step 2 :
	//Declare global variable have private access specifier using @FindBy annotation for WebElements on which we want to perform action
	
		//for email
		@FindBy(xpath="//input[@name='email']")	private WebElement email;
		
		//for password
		@FindBy(xpath="//input[@id='password']")	private WebElement password;
		
		//for logIn button
		@FindBy(xpath="//input[@name='submit']")	private WebElement logInButton;
		
		
		//Step 3 :
	//Create public parameterized constructor and pass object of WebDriver as parameter of constructor

		//Step 4 :
	//call static initElements(); present in pageFactory class inside block of constructor

		public LogIn_Page_Insurance(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//create method to perform action
		//for Email
		public void enterEmail(String Email)
		{
			email.sendKeys(Email);
		}
		
		//for password
		public void enterPassword(String Pass)
		{
			password.sendKeys(Pass);
		}
		
		//to click on logIn button 
		public void clickLoginButton()
		{
			logInButton.click();
		}

}
