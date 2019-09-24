package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		
		String path = "C:\\Users\\shailesh.kumar2\\eclipse-workspace\\dataRead\\ExcelRead.xlsx";
		String sheetName = "Sheet1";
		
		FileInputStream ExcelFile = new FileInputStream(path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		
		Cell = ExcelWSheet.getRow(1).getCell(2);
		String cellData = Cell.getStringCellValue();
		System.out.println("Data of excel is : "+ cellData);
	}

}
