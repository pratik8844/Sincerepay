package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 public class ExcelSheet {
 public static String getDatafromExcel(int row,int cell) throws EncryptedDocumentException, IOException {
 String username;
 FileInputStream excel=new FileInputStream("D:/Project1/Sincere_Pay/exceldata/Data.xlsx");
 Sheet a=WorkbookFactory.create(excel).getSheet("sheet1");
 try {
 username = a.getRow(row).getCell(cell).getStringCellValue();
} catch(Exception e) {
  long pass=(long)a.getRow(row).getCell(cell).getNumericCellValue();
  username=""+pass;
}
  return username;

}
}
