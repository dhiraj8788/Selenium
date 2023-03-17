package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test7 
{
	//if we write multiple static assert methods in one test case and one of the method is fail then it will stop execution
	
	@Test
	public void TC1()
	{
		String s1 = "Dhiraj";
		
		String s2 = "Rahul";
		
		String s3 = "Abhishek";
		
		Assert.assertNotEquals(s1, s2);
		
		Assert.assertEquals(s1, s2);
		
		Assert.assertNull(s3);
		
		Assert.assertNotNull(s1);
	}

}
