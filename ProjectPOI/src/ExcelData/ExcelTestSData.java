package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestSData {
	 public static void main(String[] args) throws IOException {
		  File src=new File("D:\\sampleexceldata.xlsx");
		  FileInputStream fis=new FileInputStream(src);
		  XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sheet=wb.getSheetAt(2);
		 String data=sheet.getRow(0).getCell(1).getStringCellValue();
		 System.out.println("data from excel:"+data);
		 String data1=sheet.getRow(1).getCell(1).getStringCellValue();
		 System.out.println("data from excel:"+data1);
		  wb.close();
		  
		 }

		}


