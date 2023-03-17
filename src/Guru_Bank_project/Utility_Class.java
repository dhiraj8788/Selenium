package Guru_Bank_project;

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

public class Utility_Class 
{
	@Test
	public static String getDataFromPF(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("c:\\Users\\DHIRAJ\\Desktop\\eclipse-workspacenew\\Oct_01_Selenium\\Guru_Bank_Project_LogIn_data.properties");
		
		//create object of Properties class
		
		Properties pro = new Properties();
		
		pro.load(file);
		
		String UserId = pro.getProperty(key);
		
		return UserId;
		
	}
	
	@Test
	public static String getDataFromExcel(int i, int j) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
		
		
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet9");
		
		String value = s.getRow(i).getCell(j).getStringCellValue();
		
		return value;
		
	}
	
	@Test
	public static void getScreenShot(WebDriver driver) throws IOException
	{
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File deti = new File("D:\\Software Testing\\Screen Shot Automation\\Failed TC.jpg");
		
		FileHandler.copy(source, deti);
		
		
		
		
	}

}
