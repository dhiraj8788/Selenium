package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Broker_system 
{
	//Web pages are represented as classes(No of webpages=No of POM Classes)
	//The various elements on the webpage are defined as variables in the class.
	//Data members/Global Variables should be declared globally with access level private by using @findby
	
			//for signed in as WebElement  
		@FindBy(xpath="//h4[text()='saradeg41@gmail.com']")	private WebElement signedInAs ; 
		
			//for logout WebElement
		@FindBy(xpath="//input[@class='btn btn-danger']")	private WebElement logOut ;
		
		//Initialize within a constructor with access level public using pagefactory
		//public parameterized constructor
			//pass object of WebDriver object as parameter of constructor
		public Insurance_Broker_system(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//Utilize within a method with access level public
		//to verify Email
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
		
		//to click on log out
		public void clickOnLogOut()
		{
			logOut.click();
		}
		

}
