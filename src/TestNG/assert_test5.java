package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test5 
{
	//assertNull() present in Assert class
	//if value in ActualResult is null then test case is pass other wise fail
		
	
	@Test
	public void TC1()
	{
		String ActualResult = null;
		
		Assert.assertNull(ActualResult);
	}

	
	@Test
	public void TC2()
	{
		String ActualResult = "Dhiraj";
		
		Assert.assertNull(ActualResult);
	}
	
}
