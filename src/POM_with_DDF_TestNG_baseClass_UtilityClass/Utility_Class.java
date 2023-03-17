package POM_with_DDF_TestNG_baseClass_UtilityClass;

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
	// Utility class to fetch data from property file
	
	/*
	 * 	Automation Test Engineer : Dhiraj
	 * 	Date : 15 feb 2023
	 * 	Day : Wed
	 * 	Title : to fetch data from property file
	 */
	
	@Test
	public static String fetchData(String key) throws IOException
	{
		//to reach upto file
		//create object of FileInputStream and pass path of the file in constructor parameter
		FileInputStream file = new FileInputStream("C:\\Users\\DHIRAJ\\Desktop\\eclipse-workspacenew\\Oct_01_Selenium\\PropertyFile.properties");
		
		//to open file which have properties extension
		//create object of properties class
		Properties pro = new Properties();
		
		//call non-static load method present in properties class and pass file object as parameter of constructor
		pro.load(file);
		
		String value = pro.getProperty(key);
		
		return value;
		
	}
	
	/*
	 * 	Automation Test Engineer : Dhiraj
	 * 	Date : 17 feb 2023
	 * 	Day : Wed
	 * 	Title : to fetch data from Excel file
	 */
	
	@Test
	public static String getDataFromExcel(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
		
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet7");
		
		String ExpectedEmail = s.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return ExpectedEmail;	
	}
	
	@Test
	public static void getScreenShot(WebDriver driver,String TestCaseID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti = new File("D:\\Software Testing\\Screen Shot Automation\\"+TestCaseID+".jpg");
		
		FileHandler.copy(source,desti);
		
	}
	
	
	
	
	
	
	
	
	

}
