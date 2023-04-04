package pom.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLDataprovider {
	

  XSSFWorkbook wb;
  public XLDataprovider() throws IOException
  {
		String path=".\\TEstData\\TestDATA_1.xlsx";	
		FileInputStream file=new FileInputStream(path);
	    wb=new XSSFWorkbook(file);
  } 
	
  public String getStringdata(String SheetName, int Row, int Cell)
  {
		
	return wb.getSheet(SheetName).getRow(Row).getCell(Cell).getStringCellValue();		
		
  }
	
	
	
	
	
	
	
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	
	
	

}




