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

public class test8 
{
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//reach upto file
			//create object of FileInputStream and pass path of Excel file as parameter of constructor
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//to open Excel file
			//call static create() present in WorkbookFactoy class and returns Workbook(I)
			Workbook w = WorkbookFactory.create(file);
			
			//to enter in particular sheet
			//call non-static getSheet() present in Workbook(I) and returns Sheet(I)
			//store it into object have sheet return type
			Sheet s = w.getSheet("Sheet2");
			
			//to get last index of rows
			System.out.println(s.getLastRowNum());		//returns int
			
			//to highlight row
			//call non-static getRow() present in Sheet(I) and returns Row(I)
			//store it into object have Row return type
			Row r = s.getRow(1);
			
			//to get last index of cell of row(0)
			System.out.println(r.getLastCellNum()-1);		//returns int it return total size of cell for index we have use -1
			
			//to highlight cell
			//call non-static getCell() present in Row(I) and returns Cell(I)
			//store it into object have Cell return type
			Cell c = r.getCell(0);
			
			//to get data present in sheet2 and row(0) and cell(0)
			//call non-static getStringCellValue() present in Cell(I) and returns String 
			//store it into object have String return type
			String value = c.getStringCellValue();
			
			System.out.println(value);
			
		}

}
