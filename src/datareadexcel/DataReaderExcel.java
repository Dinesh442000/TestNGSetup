package datareadexcel;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataReaderExcel {
	
	public ArrayList<String> test(String caseUser) throws IOException{
		ArrayList<String> arr = new ArrayList<String>();
		FileInputStream io = new FileInputStream(
	"C:\\Users\\DChoudhary5\\eclipse-workspace\\TestNGSetup\\src\\datareadexcel\\data.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(io);
		System.out.println(workBook.getNumberOfSheets());
		int sheetCount = workBook.getNumberOfSheets();
		int k=0,desiredColumn=0;
		for (int i=0;i<sheetCount;i++) {
			if(workBook.getSheetName(i).equalsIgnoreCase("testData")) {
			 XSSFSheet sheet = workBook.getSheetAt(i);
			 Iterator<Row> row =   sheet.iterator();
			 Row firstRow = row.next();
			 Iterator<Cell> cell = firstRow.cellIterator();
			 while(cell.hasNext()) {
				 Cell value = cell.next();
				 if(value.getStringCellValue().equalsIgnoreCase("Name"))
				 {
					// System.out.println(value.getStringCellValue());
					 desiredColumn=k;
				 }
				 k++;
			 }
			 System.out.println(desiredColumn);
			 while(row.hasNext()) {
				 Row r =row.next();
				
//				if( r.getCell(desiredColumn).getStringCellValue().equalsIgnoreCase("Jane")
//					) 
				if(CellUtil.getCell(r, desiredColumn).toString().equalsIgnoreCase(caseUser)){
					 Iterator<Cell> cv = r.cellIterator();
					 while(cv.hasNext()) {
						 System.out.println(cv.next().getStringCellValue());
						 arr.add(cv.next().getStringCellValue());
					 }
				 }
			 }
			}
		}
		return arr;
	}
}
