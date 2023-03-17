package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test11 
{
			//to print the all values present in a Excel file
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//to reach upto Excel file
			FileInputStream file = new FileInputStream("D:\\Software Testing\\Automation\\Sample.xlsx");
			
			//to open file and to enter in particular sheet
			Sheet s = WorkbookFactory.create(file).getSheet("Sheet5");
			
			// to get last index of row
			int lastIndexRow = s.getLastRowNum();
			
			
			//Outer for loop for rows
			for(int i = 0; i<=lastIndexRow; i++)
			{
				//to get last index of cell
				int lastIndexCell = s.getRow(i).getLastCellNum()-1;
				
				//inner for loop for cells
				for(int j = 0; j<=lastIndexCell;j++)
				{
					//to get value at row(i) and cell(j)
					String value = s.getRow(i).getCell(j).getStringCellValue();
					
					System.out.print(value+" ");
					
				}
				System.out.println();
			}
			
			
			
		}

}
