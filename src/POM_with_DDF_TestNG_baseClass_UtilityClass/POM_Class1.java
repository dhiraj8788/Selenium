package POM_with_DDF_TestNG_baseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class1 
{
		// Insurance Log IN page
	
	//Declare global variable with private access Specifier by @FindBy annotation
	
	//for email
	@FindBy(xpath="//input[@id='email']")	private WebElement email;
	
	//for password
	@FindBy(xpath="//input[@id='password']")	private WebElement password;
	
	//for log in button
	@FindBy(xpath="//input[@name='submit']")	private WebElement logInbtn;
	
	//Create public constructor and initialize with page factory
	public POM_Class1(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	
	//Create method for enterEmail
	public void enterEmail(String EM)
	{
		email.sendKeys(EM);
		
	}
	
	//Create method for enterPassword
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
		
	}
	
	//Create method for click on log in button
	public void clickOnLoginBtn()
	{
		logInbtn.click();
	}
	
	

}
