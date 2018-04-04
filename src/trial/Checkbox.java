package trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D://chromedriver_win32.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
        driver.findElement(By.linkText("Projects & Customers")).click();
        List<WebElement> l1=driver.findElements(By.xpath("//table[tbody[tr[th[contains(text(),'Customer / Project')]]]]//input[@type='checkbox']"));
        for(int i =0;i<=l1.size()-1;i++)
        {
        	if(!(l1.get(i).isSelected()))
        	{
        		l1.get(i).click();
        	
        		
        	}
        	
        }
	}

}
