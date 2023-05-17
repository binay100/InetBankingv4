package project1edureka.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apa {

	

			public static void main(String[] args) throws IOException {
				
				FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\BU SIR\\Book1.xlsx");
				
				XSSFWorkbook workbook = new XSSFWorkbook(file);
				
				XSSFSheet sheet =workbook.getSheet("Sheet1");
				
				int rowcount=sheet.getLastRowNum();//returns row count
				int colcount=sheet.getRow(0).getLastCellNum();//returns col count
				
				for(int i=0;i<rowcount;i++)
				{
					XSSFRow currentrow=sheet.getRow(i); //focused on current row
					for(int j=0;j<colcount;j++)
					{
						String value=currentrow.getCell(j).toString();  //read the value from the cell
						System.out.println("    " + value);
						
					}
				}
				
				
				
				

			}

		

	}


