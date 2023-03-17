package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test10 
{
		//To print values at particular Row index and cell index if Row is variable means value will be diff after one by one
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//to reach upto Excel file
			
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//to open Excel file and to enter in Particular sheet
				//in one syntax
			Sheet s = WorkbookFactory.create(file).getSheet("Sheet4");
			
			//to get last index of row
			int lastIndexRow = s.getLastRowNum();
			
			//for loop for row
			for(int i = 0; i<=lastIndexRow; i++)
			{
				String value = s.getRow(i).getCell(0).getStringCellValue();
				
				System.out.println(value+" ");
			}
			
			
			
			
			
			
			
		}

}
