package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert 
{
	/*	It is class, which contains non-static methods which is used to do verification

		SoftAssert will do verification if any verification is failed, notifies and execute the rest of the verification in a test method.
		
		When to use soft assert class in the test method at the end to use assertAll() method the main role is here if verification is fail
		to notify that verification and give output in consol.
	 */
	
	@Test
	public void TC1()
	{
		SoftAssert soft = new SoftAssert();
		
		String s1 = "Dhiraj";
		
		String s2 = "Abhishek";
		
		String s3 = "Rahul";
		
		soft.assertEquals(s1, s2);
		
		soft.assertNotEquals(s1, s2);
		
		soft.assertNull(s3);
		
		soft.assertNotNull(s3);
		
		soft.assertAll();	//if one of verification is failed then this method will show failed verification in consol
		
		
		
	}

}
