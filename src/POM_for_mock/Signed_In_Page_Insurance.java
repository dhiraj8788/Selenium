package POM_for_mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signed_In_Page_Insurance
{
	//Step 1 :
		// Class created for Log In page
		
			//Step 2 :
		//Declare global variable have private access specifier using @FindBy annotation for WebElements on which we want to perform action
		
			//for signed in as
			@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")	private WebElement signedInAs;
			
			//for log out button
			@FindBy(xpath="//input[@class='btn btn-danger']")	private WebElement logOutButton;
			
			
			
			//Step 3 :
		//Create public parameterized constructor and pass object of WebDriver as parameter of constructor

			//Step 4 :
		//call static initElements(); present in pageFactory class inside block of constructor

			public Signed_In_Page_Insurance(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//create methods to perform action
			//to verify Expected Email and Actual Email
			public void verifyEmail(String ExpectedEmail)
			{
				String ActualEmail = signedInAs.getText();
				
				if(ExpectedEmail.equals(ActualEmail))
				{
					System.out.println("Test case is pass");
				}
				else
				{
					System.out.println("Test case is fail");
				}
				
			}
			
			// to click on sign out
			public void clickOnLogOutButton()
			{
				logOutButton.click();
			}

}
