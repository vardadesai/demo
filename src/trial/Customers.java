package trial;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Customers {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
        WebElement wb=driver.findElement(By.linkText("Projects & Customers"));
        Thread.sleep(3000);
        
        /*
        List<WebElement> l1=driver.findElements(By.xpath("//table[tbody[tr[th[contains(text(),'Customer / Project')]]]]//td[1]/a[2]"));
        for(int i =0;i<=l1.size()-1;i++)
        {
        	System.out.println(l1.get(i).getText());
        }
        */
      /*  
        //sendkeys in action class
        //windows handling
        
        Actions act=new Actions(driver);
       
        act.contextClick(wb).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        
        
        //click and hold
    /*act.clickAndHold(wb).perform(); 
    Thread.sleep(2000);
    act.release();
    */
   /* Set<String> s1=driver.getWindowHandles();
    Iterator it=s1.iterator();
    String pid=(String) it.next();
    String cid=(String) it.next();
    driver.switchTo().window(cid);
    Thread.sleep(3000);
    //driver.close();
    driver.switchTo().window(pid);
	
	*/
    
    
   
    
        
	}

}
