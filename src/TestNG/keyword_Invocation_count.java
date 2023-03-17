package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_Invocation_count 
{
	// Invocation is a keyword in TestNG which is used to execute test cases / Methods multiple times

	
	//run test case 5 times
	@Test(invocationCount=5)			//invocation keyword
	public void TC()
	{
		Reporter.log("TC is executed", true);
	}


}
