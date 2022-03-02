package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_SingleRead 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\MGM001\\eclipse-workspace\\Advanced\\Excel\\DEMO.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Plan1");
		Row r = s.getRow(2);
		Cell c = r.getCell(3);
		String value = c.getStringCellValue();
		System.out.println(value);
		
		
		
	}
}
