package project1edureka.selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class NewFileCreation {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("EmpInfo");
		Object empdata[][]= { {"Empid","Name","job"},
				              {"102","Smith","Manager"},
				              {"103","Warner","Analyst"},
	                         };
		//////////Using For LOOp//////////
		int rows=empdata.length;
		int cols=empdata[0].length;
		System.out.println("rows");
		System.out.println("cols");
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<=cols;c++)
			{
				XSSFCell cell= row.createCell(c);
				Object value = empdata[r][c];
				
				if (value instanceof String)
					cell.setCellValue((String)value);
				if (value instanceof Integer)
					cell.setCellValue((Integer)value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		String filepath=".\\data\\Employee.xlsx";
		FileOutputStream outstream=new FileOutputStream(filepath);
		workbook.write(outstream);
		outstream.close();
		System.out.println("Employee.xlsx file writtem Sucessfully.........");
	}
}


