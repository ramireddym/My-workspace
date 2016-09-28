package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexceldatasircode {
	public static void main(String[] args) throws IOException, InvalidFormatException {
	 XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File("D:\\Venkata Rami Reddy\\Venkataramireddy.Daily Tracker.xlsx")));
	   XSSFSheet sheet = workbook.getSheetAt(0);
	   int rows = sheet.getLastRowNum();
	   for(int i=0;i<rows;i++){
	    XSSFRow row = sheet.getRow(i);
	    int cellscount = row.getLastCellNum();
	     for(int j=0;j<cellscount;j++){
	      XSSFCell cell = row.getCell(j);
	      System.out.println("Data in row,cell:"+i+","+j+" is :"+cell.getStringCellValue());
	     }
	   }
	   workbook.close();
	}
	 
}

