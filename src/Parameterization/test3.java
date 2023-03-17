package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test3 
{
							//to fech String data from Excel Sheet
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//to reach upto Excel sheet
			//create object of FileInputStream and give path of excel sheet as parameter of Constructor
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//fetch the data on particular sheet in particular row in particular cell in one syntax
			//Step I: call static method create() present in WorkbookFactory class and return type is Workbook
			
			//Step II: call non-static getSheet() present in Sheet(I) and return type is Sheet
			
			//Step III: call non-static getRow() present in Sheet(I) and return type is Row(I)
			
			//Step IV: call non-static getCell() present in Row(I) and return type is Cell(I)
			
			//Step V: call non-static getStringCellValue() present in Cell(I) and return type is String
			String info = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
			
			System.out.println(info);
			
		}

}
