package POM_with_DDF_TestNG_baseClass_UtilityClass_fo_mock;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility_Class2 
{
	@Test
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DHIRAJ\\Desktop\\eclipse-workspacenew\\Oct_01_Selenium\\Dhiraj_Insurance_login.properties");
	
	
		Properties p = new Properties();
	
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
		
	}
	
	@Test
	public static String getDataFromExcel(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
		
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet8");
		
		String expectedText = s.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return expectedText;
		
		
		
	}
	
	@Test
	public static void takeScreenShot(WebDriver driver,String TestCaseID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti = new File("D:\\Software Testing\\Screen Shot Automation\\"+TestCaseID+".jpg");
		
		FileHandler.copy(source, desti);
		
	}
	

}
