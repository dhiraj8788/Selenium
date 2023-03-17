package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LogIn_page 
{
	@FindBy(xpath="//input[@name='username']")	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")	private WebElement passWord;
	
	@FindBy(xpath="//button[@class='_acan _acap _acas _aj1-']")	private WebElement logInBtn;
	
	
	public POM_LogIn_page(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String US)
	{
		userName.sendKeys(US);
	}
	
	public void enterPass(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	public void clickLogInBtn()
	{
		logInBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
