package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test2 
{
	
	//assertNotEquals() present in Assert class
	//if value in expectedResult and ActualResult is not equal then test case is pass other wise fail
	
	@Test
	public void TC1()
	{
		String ExpectedResult = "Dhiraj";
		
		String ActualResult = "Dhiraj";
		
		
		Assert.assertNotEquals(ExpectedResult, ActualResult);
	}
	
	@Test
	public void TC2()
	{
		String ExpectedResult = "Dhiraj";
		
		String ActualResult = "Dhiraj";
		
		String ActualResult2 = "Rahul";
		
		Assert.assertNotEquals(ExpectedResult,ActualResult2);
		
	}

}
