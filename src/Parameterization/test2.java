package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test2 
{	
							//to fech String data from Excel Sheet
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//to reach upto Excel Sheet
			//create object of FileInputStream and give path of the Excel sheet as parameter of Constructor 
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//to open excel sheet
			//call the static create() present in WorkbookFactory class and return type is Workbook(I)
			//And store it into object have Workbook return type
			Workbook w = WorkbookFactory.create(file);
			
			//to enter particular sheet
			//call non-static getSheet() present in Workbook(I) and return type is Sheet
			//And store it into object have Sheet return type
			Sheet s = w.getSheet("Sheet1");
			
			//to highlight row
			//call non-static getRow() present in Sheet(I) return type is Row(I)
			//And store it into object have Row return type
			Row r = s.getRow(0);
			
			//to highlight cell
			//call non-static getCell() present in Row(I) and return type is Cell(I)
			//And store it into object have Cell return type
			Cell c = r.getCell(1);
			
			//to fetch data present on row(0) and Cell(1)
			//call getStringCellValue() present in Cell(i) and return type is String
			//And store it into object have String return type
			String info = c.getStringCellValue();
			
			System.out.println(info);
			
			
			
			
		}

}
