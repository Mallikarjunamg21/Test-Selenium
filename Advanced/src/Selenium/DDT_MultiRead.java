package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_MultiRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\MGM001\\eclipse-workspace\\Advanced\\Excel\\MultiWrite.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Sheet1");
		for (int i=0; i<s.getLastRowNum();i++)
		{	
			Row r = s.getRow(i);
			System.out.println(r.getCell(1).getStringCellValue());
			System.out.println();
		}
	}
}
