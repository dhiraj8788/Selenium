package Parameterization_for_mock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test 
{
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			Workbook w = WorkbookFactory.create(file);
			
			Sheet s = w.getSheet("Sheet1");
			
			Row r =s.getRow(0);
			
			Cell c = r.getCell(1);
			
			String value = c.getStringCellValue();
			
			System.out.println(value);
			
			
		}

}
