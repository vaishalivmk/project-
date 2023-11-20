package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		//File src=new File("C:\\vaishali\\ExcelData\\TestData.xlsx");
		//File src=new File("src/test/resources/Data.xlsx");
		FileInputStream fis=new FileInputStream("src/test/resources/Data.xlsx");
		
        Workbook wb= WorkbookFactory.create(fis);
        
      //  Sheet sh = wb.createSheet("Sheet1");
        
       Sheet sh=wb.createSheet("Deccan");
       
       Row rw = sh.createRow(8);
       
       Cell cl = rw.createCell(0);
       
       cl.setCellValue("pune");
       
		FileOutputStream fos=new FileOutputStream("src/test/resources/Data.xlsx");

		
		wb.write(fos);

       
       
        
		
	}

}
