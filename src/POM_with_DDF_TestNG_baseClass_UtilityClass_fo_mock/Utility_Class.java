package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utility_Class 
{
	@Test
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\DHIRAJ\\Desktop\\eclipse-workspacenew\\Oct_01_Selenium\\LogIn_Data_Facebook.properties");
		
		Properties pro = new Properties();
		
		pro.load(file);
		
		String value = pro.getProperty(key);
		
		return value;
		
	}

}
