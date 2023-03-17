package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test6 
{
			//Fetch boolean data from Excel file
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			// to reach upto Excel file
			//Create object of FileInputStream and pass path of the Excel file as parameter
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			
			//to open Excel file
			//Call static create() present in WorkbookFactory and return type is Workbook(I)
			//And store it into object have Workbook return type
			Workbook w = WorkbookFactory.create(file);
			
			//to enter in particular sheet
			//call non-static getSheet() present in Workbook(I) and return type is Sheet(I)
			//store it into object have Sheet return type
			Sheet s = w.getSheet("Sheet1");
			
			//to highlight specific row
			//call non-static getRow() present in Sheet(I) and return type is Row
			//And store it into object have Row return type
			Row r = s.getRow(2);
			
			//to highlight cell
			//call non-static getCell() present in Row(I) and return type is Cell(I)
			//And store it into object have Cell return type
			Cell c = r.getCell(1);
			
			//to get data on row(2) and cell(1)
			//call non-static getNumericCellValue present in Cell(I) and return type is boolean
			//And store it into object have boolean return type
			boolean info = c.getBooleanCellValue();
			
			System.out.println(info);
			
			
			
			
		}

}
