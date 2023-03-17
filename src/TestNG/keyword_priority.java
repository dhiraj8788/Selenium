package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword_priority 
{
	//priority is a keyword in TestNG which is used to change test case / method execution order
	
	// Execution of test case is based on priority
	// lowest priority test case will execute first
	//if we give same priority to multiple test cases then it will execute based on their alphabetical order
	/*
	 * 	Priority can be
	 * 					- By default = 0
	 * 					- +ve integer
	 * 					- -ve integer
	 * 				But can not be decimal or variable
	 */
	
	/*	In below program we are giving 2 priority to TC1 and 1 priority to the TC2
	 * 	
	 * 	So lowest priority TC will execute first
	 * 		TC 3 will execute first and then TC 2 will execute and then TC 1 will execute
	 * 
	 */
	
	//test case 1 with priority 2
	@Test(priority=2)
	public void TC1()
	{
		Reporter.log("TC1 executed",true);
	}
	
	//test case 2 with priority 1
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("TC2 executed",true);
	}
	
	//Test case 3 with priority 0 (Default priority will be 0)
	@Test
	public void TC3()
	{
		Reporter.log("TC3 executed", true);
	}

}
