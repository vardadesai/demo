package trial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class NewTest1 {
	static String temp="not present";
  @Test
 
  public void Para() throws EncryptedDocumentException, InvalidFormatException, IOException {
	 
	  FileInputStream fi=new FileInputStream("C:\\Users\\Hareesh\\Desktop\\para_practice\\a.xlsx");
	  Workbook wb=WorkbookFactory.create(fi);
	  Sheet sh=wb.getSheet("Sheet1");
	  Row r1= sh.getRow(0);
	  Cell c1=r1.getCell(0);
	  System.out.println("test2");
	 //System.out.println(c1.getStringCellValue());
	  /*for(int i=0;i<=sh.getLastRowNum();i++)
	  {
		  if(sh.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase("cozmo"))
		  System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
	  }*/
	  for(int i=0;i<=sh.getRow(i).getLastCellNum();i++)
	  {
		  for(int j=0;j<sh.getRow(j).getLastCellNum();j++)
		  {
			  if(sh.getRow(i).getCell(j).getStringCellValue().equalsIgnoreCase("India"))
			  {
				  temp="present";
				  System.out.println("present in location-->+(i+1)+-->"+(j+1));
				  break;
			  }
			  if(temp==("present"))
			  {
				 break; 
			  }
		  }
	  }
	  
	  
	  
	  
  }
  @Test
  public void Output() throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  FileInputStream fi=new FileInputStream("C:\\Users\\Hareesh\\Desktop\\para_practice\\b.xlsx");
	  Workbook wb=WorkbookFactory.create(fi);
	  Sheet sh=wb.getSheet("Sheet1");
	  Row r1= sh.createRow(0);
	  Cell c1=r1.createCell(5);
	  c1.setCellType(Cell.CELL_TYPE_STRING);
	  FileOutputStream fo=new FileOutputStream("C:\\Users\\Hareesh\\Desktop\\para_practice\\b.xlsx");
	  c1.setCellValue("hi");
	  System.out.println("test1");
	  wb.write(fo);
	  wb.close();
	  
  }
  
}
