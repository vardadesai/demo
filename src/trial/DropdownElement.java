package trial;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownElement {

	static Logger log;
	static String temp;
	public static void main(String[] args) throws InterruptedException {
		 log = Logger.getLogger("devpinoyLogger");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
        driver.findElement(By.linkText("Projects & Customers")).click();
        Thread.sleep(3000);
        WebElement drp=driver.findElement(By.name("selectedCustomer"));
        Thread.sleep(3000);
        Select sel= new Select(drp);
       List<WebElement> l1= sel.getOptions();
       for(int i=0;i<=l1.size()-1;i++)
       {
    	   System.out.println(l1.get(i).getText());
    	   if(l1.get(i).getText().trim().equals("Vodafone"))
    	   {
    		   temp="pass";
    		   break;
    	   }
       }
       
       log.info(temp);
       driver.close();
	}

}
