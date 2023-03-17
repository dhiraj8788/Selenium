package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test3 
{
	//assertTrue() present in Assert class
	//if value in ActualResult is true then test case is pass other wise fail
		
	
	@Test
	public void TC1()
	{
		boolean ActualResult = true;
		
		Assert.assertTrue(ActualResult);
	}
	
	@Test
	public void TC2()
	{
		boolean ActualResult = false;
		
		Assert.assertTrue(ActualResult);
		
	}
}
