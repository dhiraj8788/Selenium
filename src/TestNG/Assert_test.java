package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_test 
{
	
	//assertEquals() present in Assert class
	//if value in expectedResult and ActualResult is equal then test case is pass other wise fail
	
	
	@Test
	public void TC1()
	{
		String ExpectedResult = "Dhiraj";
		
		String ActualResult = "Dhiraj";
		
		Assert.assertEquals(ExpectedResult, ActualResult);
	}
	
	@Test
	public void TC2()
	{
		String ExpectedResult = "Dhiraj";
		
		String AcutalResult = "Abhishek";
		
		Assert.assertEquals(ExpectedResult, AcutalResult);
	}

}
