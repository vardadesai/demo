package trial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://127.0.0.1/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
    driver.findElement(By.linkText("Projects & Customers")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[.='Airtel']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
    Thread.sleep(3000);
    Alert alt=driver.switchTo().alert();
    System.out.println(alt.getText());
    //alt.dismiss();
alt.accept();
}
}