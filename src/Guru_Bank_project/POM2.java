package Guru_Bank_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 
{
	@FindBy(xpath = "//a[text()='Manager']")	private WebElement manager;
	
	@FindBy(xpath = "//a[text()='Manager']")	private WebElement NewCustomer;
	
	
	@FindBy(xpath = "//a[text()='New Customer']")	private WebElement logOutBtn;
	
	
	public POM2(WebDriver driver)
	{
			PageFactory.initElements(driver,this);
	}
	
	public String getTextOfManager()
	{
			String TextOfManger = manager.getText();
			
			return TextOfManger;	
	}
	
	public String getTextOfNewCustomer()
	{
		String TextOfNewCustomer= NewCustomer.getText();
		
		return TextOfNewCustomer;
		
	}

	public void clickOnLogout()
	{
		logOutBtn.click();
	}
}
