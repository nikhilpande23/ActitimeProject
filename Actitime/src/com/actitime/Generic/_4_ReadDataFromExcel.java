package com.actitime.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _4_ReadDataFromExcel {
	
	public String readDataFromExcelFile(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Testdata/Testdata2.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
		Workbook wb =WorkbookFactory.create(fis);
		String value = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}

}
