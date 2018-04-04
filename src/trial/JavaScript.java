package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript {

	static WebDriver driver=null;
	public static void main(String[] args) {
		
		 driver = new FirefoxDriver();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.location='http://127.0.0.1/login.do'");
		 String str= js.executeScript("return document.domain;").toString();
		 System.out.println(str);
		 WebElement un = driver.findElement(By.name("username"));
		 WebElement pwd = driver.findElement(By.name("pwd"));
		 WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		 js.executeScript("arguments[0].value='admin'", un);
		 js.executeScript("arguments[0].value='manager'", pwd);
		 js.executeScript("arguments[0].click()", login);
		 

	}

}
