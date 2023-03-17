package Selenium_Architecture;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
	 //Interface					  extends
public class test_WebDriver_Interface implements SearchContext
{
	/*	SearchContext is a super most interface in selenium which have 2 methods
	 * 	Note- WebDriver is a interface which extends SearchContext interface	
	 *  For understanding in practical i just write class and implements don't get confused
	 */

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
