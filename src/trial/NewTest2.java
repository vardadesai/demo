package trial;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	public static WebDriver dr ;
	static String URL="http://127.0.0.1/login.do";
	
@BeforeClass
public void login()
{
	dr=new FirefoxDriver();
	dr.get(URL);
	dr.findElement(By.name("username")).sendKeys("admin");
	dr.findElement(By.name("pwd")).sendKeys("manager");
	dr.findElement(By.xpath("//input[contains(@value,'Login now')]")).click();
}

@AfterClass
public void logout()
{
dr.findElement(By.xpath("//img[@alt='Logout']")).click();
dr.close();

}

  @Test
  public void AddCust() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
  {
	  Thread.sleep(3000);
	String actual=dr.getTitle();
	Assert.assertEquals(actual, "actiTIME - Open Tasks", "Title verified");
	  WebElement Project=dr.findElement(By.linkText("Projects & Customers"));
	  String lnk=Project.getCssValue("color");
	Assert.assertEquals(lnk, "rgba(4, 52, 112, 1)", "Color Verified");
	Project.click();
	Thread.sleep(3000);
    Thread.sleep(3000);
	FileInputStream fi=new FileInputStream("C:\\Users\\Hareesh\\Desktop\\para_practice\\b.xlsx");
	Workbook wb=WorkbookFactory.create(fi);
	Sheet sh=wb.getSheet("Sheet1");
	Row r1=sh.getRow(0);
	Cell c1=r1.getCell(0);
	FileOutputStream fo=new FileOutputStream("C:\\Users\\Hareesh\\Desktop\\para_practice\\b.xlsx");
	wb.write(fo);
	for(int i=0;i<=sh.getLastRowNum();i++)
	{
		Thread.sleep(1000);
		dr.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		String Customer=sh.getRow(i).getCell(0).getStringCellValue();
		Thread.sleep(1000);
		dr.findElement(By.name("name")).sendKeys(Customer);
		dr.findElement(By.name("createCustomerSubmit")).click();
		r1.createCell(1);
		c1.setCellValue(c1.CELL_TYPE_STRING);
		c1.setCellValue("Added");
		
		/*List<WebElement> l1=dr.findElements(By.xpath("//table[tbody[tr[th[contains(text(),'Customer / Project')]]]]//td[1]/a[2]"));
		
        for(int j =0;j<=l1.size()-1;j++)
        {
        	Assert.assertEquals(Customer, l1.get(i).getText());
        }*/
		
	}
	
	
	
	
	  
	 
	  
  }
}
