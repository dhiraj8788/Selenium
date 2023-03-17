package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test 
{
						//to fech String data from Excel Sheet
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//to reach upto xlsheet
			//create object of FileInputSteam 
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//to open xlsheet
			//call static create() present in WorkBook 
			
			//to open Excel sheet
				//call static create() present in WorkbookFactory and return type is Workbook
					//store it into Workbook object
			Workbook w = WorkbookFactory.create(file);
			
			//to enter particular sheet
				//call non-static getSheet() present in Workbook(I) and return type is Sheet(I)
			
			Sheet s = w.getSheet("Sheet1");
			
			//to highlight row
				//call non-static getRow() present in Sheet (I) and return type is Row
			Row r = s.getRow(0);
			
			//to highlight cell
				//call non-static getCell() present in Row(I) return type is Cell(I)
			Cell c = r.getCell(0);
			
			//richTextString
			//to fetch data in cell(0) and row(0)
			//call non-static getStringCellValue() present in Cell(I) and return type is String
			String value = c.getStringCellValue();
			
			System.out.println(value);
			
			
		
			
			
		}

}
