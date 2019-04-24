package sampl1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDataSpecific {
	public static void main(String args[]) throws IOException
	{

		String excelsheetvalue =getvaluefromexcelsheet("Sample1", 1, 1);
		System.out.println("The excelsheet value is: " +excelsheetvalue);

	}

	public  static String getvaluefromexcelsheet(String sheenamt, int rowno, int columnno) throws IOException
	{
		FileInputStream FIS= new FileInputStream(".//ExcelFiles//ExcelTestDate.xlsx");
		XSSFWorkbook workbk= new XSSFWorkbook(FIS);
		XSSFSheet sheet= workbk.getSheet(sheenamt);
		String readingvalue= sheet.getRow(rowno).getCell(columnno).getStringCellValue();
		return readingvalue;

	}

}
