package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_Class_Dhiraj_logIn 
{
	
	//for Email
	@FindBy(xpath = "//input[@name='email']")	WebElement Email;
	
	//for password
	@FindBy(xpath = "//input[@name='password']")	WebElement passWord;
	
	//for log in button
	@FindBy(xpath= "//input[@name='submit']")	WebElement logInBtn;
	
	
	public POM1_Class_Dhiraj_logIn(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//create method to perform action
	public void enterEmail(String email)
	{
		Email.sendKeys(email);
		
	}
	
	public void enterPassword(String pass)
	{
		passWord.sendKeys(pass);
		
	}
	
	public void clickOnlogInBtn()
	{
		logInBtn.click();
	}
	
	
	
	
	
	
	
	

}
