package datareadexcel;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataReaderExcel {
	
	@Test
	public void test() throws IOException{
		FileInputStream io = new FileInputStream(
	"C:\\Users\\DChoudhary5\\eclipse-workspace\\TestNGSetup\\src\\datareadexcel\\data.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(io);
		System.out.println(workBook.getNumberOfSheets());
		int sheetCount = workBook.getNumberOfSheets();
		for (int i=0;i<sheetCount;i++) {
			if(workBook.getSheetName(i).equalsIgnoreCase("testData")) {
			 XSSFSheet sheet = workBook.getSheetAt(i);
			 Iterator<Row> row =   sheet.iterator();
			 Row firstRow = row.next();
			 Iterator<Cell> cell = firstRow.cellIterator();
			 while(cell.hasNext()) {
				 Cell value = cell.next();
				 System.out.println(value.getStringCellValue());
			 }
			}
		}
	}
}
