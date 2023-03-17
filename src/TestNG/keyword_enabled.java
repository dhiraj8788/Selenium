package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_enabled 
{
	//Disabling a test method/TC in TestNG can be achieved by setting the enabled attribute of the @Test annotation to false.
	
	// we apply enabled=false keyword to TC3 so it now execute

	//test case 1 
		@Test
		public void TC1()
		{
			Reporter.log("TC1 executed",true);
		}
		
		//test case 2 
		@Test
		public void TC2()
		{
			Reporter.log("TC2 executed",true);
		}
		
		//Test case 3 
		// disabling this test case by using (enabled=false)
		@Test(enabled=false)
		public void TC3()
		{
			Reporter.log("TC3 executed", true);
		}
}
