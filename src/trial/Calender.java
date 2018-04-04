package trial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		/* Actitime example:
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Reports")).click();
		WebElement start=driver.findElement(By.xpath("//td[contains(text(),'From')]/following-sibling::td[1]//img"));
		start.click();
		Thread.sleep(2000);
		Set<String> s1=driver.getWindowHandles();
		Iterator it=s1.iterator();
		String pid=(String)it.next();
		String cid=(String)it.next();
		driver.switchTo().window(cid);
		int i=3;
		int mm=6;
		int dd=2;
		while(i<=12)
		try
		{
			driver.findElement(By.xpath("//td[contains(@onclick,'2018-"+mm+"-2')]//*[text()='"+dd+"']")).click();
			break;
			
		}
		catch(NoSuchElementException e)
		{
			driver.findElement(By.xpath("//img[@alt='next month']")).click();
		}
*/
		//Air Asia example:
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airasia.com/en/home.page?cid=1");
		WebElement origin=driver.findElement(By.xpath("//span[span[span[div[span[text()='Origin']]]]]"));
		Actions act=new Actions(driver);
		act.moveToElement(origin).perform();
		act.click(origin).perform();
		act.sendKeys("Kol").perform();
	driver.findElement(By.xpath("//div[span[contains(text(),'Kolkata')]]")).click();
	
	driver.findElement(By.xpath("//span[span[span[div[span[text()='Destination']]]]]")).sendKeys("Goa");;
    WebElement dest1=driver.findElement(By.xpath("//div[span[contains(text(),'Goa')]]"));	
    //act.sendKeys("Goa").perform();
    act.click(dest1).perform();
    driver.findElement(By.id("dtRngeStart")).click();
    Thread.sleep(1000);
    int i=3;
    while(i<=12)
    {
    	try
    	{
    		driver.findElement(By.xpath("//span[@data-month='5' and text()='2']")).click();
    	    break;
    	}
    
    	catch(NoSuchElementException e)
    	{
    		act.click(driver.findElement(By.xpath("//th[@class='next available']/i"))).perform();
    	Thread.sleep(3000);
    	}
    }
   


		
		
		
		
		
	}

}
