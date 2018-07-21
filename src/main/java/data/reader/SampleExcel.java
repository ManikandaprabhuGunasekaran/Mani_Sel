package data.reader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SampleExcel {

	@Test
	public void readExcel() throws IOException {
		XSSFWorkbook n=new XSSFWorkbook("C:/Users/kalai/Desktop/Excel_practise.xlsx");
		XSSFSheet b=n.getSheetAt(0);
		int RowCount=b.getLastRowNum();
		System.out.println(RowCount);
		XSSFRow headerRowSize=b.getRow(0);
		int cell_size=headerRowSize.getLastCellNum();
		System.out.println(cell_size);
		String[][] data_in_cell= new String[RowCount][cell_size];
		for(int i=0;i<RowCount;i++) {
		XSSFRow c=b.getRow(i);
		for(int j=0;j<cell_size;j++) {
		XSSFCell d=c.getCell(j);
		String value = d.getStringCellValue();
		System.out.println(value);
		data_in_cell[i-1][j]=value;
		
		}}
		
		
		
	}
}
