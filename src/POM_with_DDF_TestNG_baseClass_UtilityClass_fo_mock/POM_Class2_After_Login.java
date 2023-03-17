package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class2_After_Login 
{
	//for profile 
	@FindBy(xpath="//a[text()='Profile']")	WebElement profile;

	//for title in profile
	@FindBy(xpath="//strong[text()='Title:']")	WebElement title;
	
	//for email present on web page
	@FindBy(xpath="//h4[text()='dhirajrajput388@gmail.com']")	WebElement signedInAs;
	
	//for Home on web page
	@FindBy(xpath="//a[@id='ui-id-1']")	WebElement home; 
	
	//for text present under home tab
	@FindBy(xpath="//h2[text()='Broker Insurance WebPage']")	WebElement titleUnderHome;
	
	//for log out button on web page
	@FindBy(xpath="//input[@class='btn btn-danger']")	WebElement logOutBtn;
	
	
	public POM_Class2_After_Login(WebDriver driver)
	{
		
			PageFactory.initElements(driver,this);
		
	}
	
	//create method to perform action
	
	public void clickOnProfile()
	{
		profile.click();
	}
	
	public String getTextUnderProfile()
	{
		String ActualText = title.getText();
		
		return ActualText;
		
	}
	
	public String getEmail()
	{
		String actualEmail = signedInAs.getText();
		
		return actualEmail;
	}
	
	public void clickOnHome()
	{
		home.click();
	}
	
	public String getTitleUnderHome()
	{
		String titleInHome = titleUnderHome.getText();
		
		return titleInHome;
	}
	
	public void clickOnLogOutBtn()
	{
		logOutBtn.click();
	}
	
	
	
	
	

}
