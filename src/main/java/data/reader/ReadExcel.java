package data.reader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	public String[][] readExcel(String excelSheetName) throws IOException {
		XSSFWorkbook excel= new XSSFWorkbook("./Excel/"+excelSheetName+".xlsx");
		//excel.getSheet("Sheet1");		
		XSSFSheet sheet = excel.getSheetAt(0);
		int RowCount = sheet.getLastRowNum();
		System.out.println(RowCount);
		XSSFRow headerRow = sheet.getRow(0);
		int lastCellNum = headerRow.getLastCellNum();
		System.out.println(lastCellNum);
		String[][]data =new String[RowCount][lastCellNum];
		for(int i=1;i<=RowCount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++) {
				
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				data[i-1][j]=value;
			}
		}
		excel.close();
		return data;
		
		
		
	}
}
