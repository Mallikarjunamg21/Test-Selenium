package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultiWrite
{
	 public static void main(String[] args) throws EncryptedDocumentException, IOException
	 {
		FileInputStream fis = new FileInputStream("./Excel/DEMO.xlxs");
		WorkbookFactory.create(fis);
	 }

}
