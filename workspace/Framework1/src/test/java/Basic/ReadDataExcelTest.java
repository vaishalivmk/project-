package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcelTest {
	public  void VtigerexcelExcelTest() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data4.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		org.apache.poi.ss.usermodel.Sheet 
		
		
		sh = wb.getSheet("Sheet1");
		
		Row rw = sh.getRow(1);
		
		Cell cl = (Cell) rw.getCell(1);
		
		String data = ((org.apache.poi.ss.usermodel.Cell) cl).getStringCellValue(); 
		
		System.out.println(data);
		
		
		
	}

}


