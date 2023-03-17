package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test9 
{
				//To print the values at index of cells at particular row index
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
			//reach upto Excel sheet
			//Create object of FileInputStream and pass path of the Excel file as parameter of constructor
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			
			//to open Excel file
			//call create() from WorkbookFactory class returns Workbook(I)
			Workbook w = WorkbookFactory.create(file);
			
			//enter in particular sheet
			//call getSheet() from Workbook(i)
			//store it into Sheet object because sheet is return type of this method
			Sheet s = w.getSheet("Sheet3");
			
			//to get last index of cell at row(0)
			int lastIndexCell = s.getRow(0).getLastCellNum()-1;
			
			
			//to print the values of cells present on row(0)
			for(int i = 0; i<=lastIndexCell;i++)
			{
				String value = s.getRow(0).getCell(i).getStringCellValue();
				
				System.out.print(value+" ");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
