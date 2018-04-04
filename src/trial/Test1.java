package trial;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverService.Builder;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test1
{
  static  WebDriver dr; 
	@Test
	public void login() throws ParserConfigurationException, SAXException, IOException, InterruptedException
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		File f1 = new File("D:\\Selenium_Practice\\Selenium\\pull.xml");
		Document d = builder.parse(f1);
		NodeList l1 = d.getElementsByTagName("dev");
		
	   dr=new FirefoxDriver();
		dr.get(l1.item(0).getTextContent());
		Thread.sleep(1000);
		/*l1=d.getElementsByTagName("test");
		Thread.sleep(1000);
		dr=new FirefoxDriver();
		dr.get(l1.item(0).getTextContent());
		l1=d.getElementsByTagName("preprod");
		Thread.sleep(1000);
		/*dr=new FirefoxDriver();
		dr.get(l1.item(0).getTextContent());
		*/
		
		System.out.println("hi world");
		
	}
	
	
	
}
