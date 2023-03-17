package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test4 
{
	//assertFalse() present in Assert class
	//if value in ActualResult is false then test case is pass other wise fail
			
	
	@Test
	public void TC1()
	{
		boolean ActualResult = false;
		
		Assert.assertFalse(ActualResult);
	}
	
	@Test
	public void TC2()
	{
		boolean ActualResult = true;
		
		Assert.assertFalse(ActualResult);
		
	}

}
