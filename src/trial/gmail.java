package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement((By.xpath("//a[text()='Sign In']"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("varda91");
		driver.findElement((By.xpath("//span[text()='Next']"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ganeshganesh123");
		driver.findElement((By.xpath("//span[text()='Next']"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("to")).sendKeys("jyothish.testy@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Assignment");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hi Jyothish");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(3000);
		System.out.println("mail send");
		
		
		
		

	}

}
