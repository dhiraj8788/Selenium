package Selenium_Architecture;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class test_selenium_remote_webdriver3 implements TakesScreenshot
{

	//TakesScreenshot is a super interface of SeleniumRemoteWebdriver which contains 1 method
	
	@Override
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

}
