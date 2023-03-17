package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test6 
{
	//
	
	@Test
	public void TC1()
	{
		String ActualResult = "Dhiraj";
		
		Assert.assertNotNull(ActualResult);
	}

	
	@Test
	public void TC2()
	{
		String ActualResult = null;
		
		Assert.assertNotNull(ActualResult);
	}

}
