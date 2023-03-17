package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test5 
{
		//fetch numeric data from Excel file
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//to reach upto Excel file
			//create object of FileInputStream and pass path of the Excel file as parameter of Constructor
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//to fetch numeric data from Excel file on sheet1 on row(1) and cell(1) by one syntax
			//Step I: call static create() present in WorkbookFactory class and return type is Workbook(I)
			
			//Step II: call non-static getSheet() present in Workbook class and return type is Sheet(I)
			
			//Step III: call non-static getRow() present in Sheet(I) and return type is Row(I)
			
			//Step IV: call non-static getCell() present in Row(I) and return type is Cell(I)
			
			//Step V: call non-static getNumericCellValue() present in Cell(I) and return type is double
			double info = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
			
			System.out.println(info);
			
			
		}

}
