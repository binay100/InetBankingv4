package project1edureka.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel1 {

	public static void main(String[] args) throws IOException {
		
		String excelfilepath=".\\data\\Test.xlsx";
		FileInputStream inputstream=new FileInputStream(excelfilepath);
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		//////Using for loop/////
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
	   for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<cols;c++)
			{
			XSSFCell cell=row.getCell(c);
			
			switch (cell.getCellType())
			{
			case STRING:System.  
				case BOOLEAN:
			case NUMERIC:
				
			}
			
			  
			}
		}
		
		
		
		
		

	}

}
