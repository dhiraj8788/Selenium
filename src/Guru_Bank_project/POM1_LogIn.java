package Guru_Bank_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_LogIn 
{
	@FindBy(xpath = "//input[@name='uid']")	private WebElement UserID;
	
	@FindBy(xpath = "//input[@name='password']")	private WebElement Password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")	private WebElement LoginBtn;
	
	
	public POM1_LogIn(WebDriver driver)
	{
			PageFactory.initElements(driver,this);
	}
	
	public void enterUserId(String UID)
	{
		UserID.sendKeys(UID);
	}

	public void enterPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
}
