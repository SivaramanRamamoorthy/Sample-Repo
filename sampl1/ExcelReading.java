package sampl1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {
public static void main(String args[]) throws IOException
{
		
File files= new File (".//ExcelFiles//ExcelTestDate.xlsx");
FileInputStream FIS= new FileInputStream(files);
XSSFWorkbook workbk= new XSSFWorkbook(FIS);
XSSFSheet sheet= workbk.getSheet("Sample1");
int row = sheet.getLastRowNum()+1;
int col = sheet.getRow(0).getLastCellNum();
for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
		String readingdata= sheet.getRow(i).getCell(j).getStringCellValue();
		
		System.out.println(readingdata);		
	}
}


}
}
