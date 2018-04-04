package trial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
        WebElement wb=driver.findElement(By.linkText("Projects & Customers"));
        Actions act = new Actions(driver);
        act.contextClick(wb).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.ARROW_DOWN).perform();
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        Set<String>s1=driver.getWindowHandles();
        Iterator it=s1.iterator();
        String pid = (String) it.next();
        String cid = (String) it.next();
        driver.switchTo().window(cid);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
        driver.close();
        driver.switchTo().window(pid);
        System.out.println(pid);
        System.out.println(cid);
        
        

	}

}
