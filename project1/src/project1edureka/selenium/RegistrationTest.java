package project1edureka.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.*;

public class RegistrationTest {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath=".\\data\\Test.xlsx";
		FileInputStream inputstream=new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		////USING FOR LOOP
		
		/*int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getCellFormula());break;
				
				
				}
				System.out.print("   |  ");
			}
			System.out.println();
			
		}*/
		
		
		///////////////ITERATOR/////////////////
		
		Iterator iterator=sheet.iterator();
		while(iterator.hasNext())
		{
			XSSFRow row=(XSSFRow) iterator.next();
			
			Iterator cellIterator=row.cellIterator();
			
			while(cellIterator.hasNext())
			{
				XSSFCell cell=(XSSFCell)cellIterator.next();
				switch(cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getCellFormula());break;
				}
				System.out.print("  |  ");
			}
			System.out.println();
			}
		}
	}

