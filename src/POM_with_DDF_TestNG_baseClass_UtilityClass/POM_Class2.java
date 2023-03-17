package POM_with_DDF_TestNG_baseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class2 
{
		// Insurance Broker Web page

	//Declare global variable with private access Specifier by @FindBy annotation
	
	//for signed in as
	@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")	private WebElement signedInAs;
	
	//for log out button
	@FindBy(xpath="//input[@class='btn btn-danger']")	private WebElement logOutBtn;
	
	
	//Create public constructor and initialize with page factory
		public POM_Class2(WebDriver driver)
		{
				PageFactory.initElements(driver, this);
		}
	
	//create methods to perform action
		//for signed in as
		public String getEmail()
		{
			String actualEmailAddress = signedInAs.getText();
			
			return actualEmailAddress;
			
		}
		
		// for log out
		public void logOut()
		{
			logOutBtn.click();
		}
	
	
	
	
	
	
	
	
	
}
