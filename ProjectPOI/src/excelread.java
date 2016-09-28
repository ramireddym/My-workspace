import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelread {

	public static void main(String[] args) throws IOException {
		
		File Excel=new File("D:\\Venkata Rami Reddy\\Venkataramireddy.Daily Tracker.xlsx");
		FileInputStream fis=new FileInputStream(Excel);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("input");
		int rownum=ws.getLastRowNum();
		int colnum=ws.getRow(0).getLastCellNum();
		String[][]data=new String[rownum][colnum];
		for(int i=0;i<rownum;i++)
		{
			XSSFRow row=ws.getRow(i);
			for(int j=0;j<colnum;j++)
			{
				XSSFCell cell=row.getCell(j);
				String value=celltostring(cell);
				data[i][j]=value;
				System.out.println("this value is" +value);
			}			
		}
	}

	private static String celltostring(XSSFCell cell) {
		int type;
		Object result;
		type=cell.getCellType();
		switch (type)
		{
		case 0:
			result=cell.getNumericCellValue();
			
		case 1:
			result=cell.getStringCellValue();
			
		}
		return null;
	}

}
