package trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selected_link {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		List<WebElement> l1= driver.findElements(By.xpath("//a"));
		String exp_link="Archives";
		for(int i =0;i<=l1.size()-1;i++)
		{
			if(l1.get(i).getText().equals(exp_link))
			{
				l1.get(i).click();
				System.out.println("archives selected");
			}
		}

	}

}
