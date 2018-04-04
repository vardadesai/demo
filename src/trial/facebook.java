package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("varda91@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("varda1234567");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div/input[@class='_5eay']")).sendKeys("cozmo india");
        driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
        driver.findElement(By.xpath("//div[text()='Cozmo India']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='_42ft _4jy0 FriendRequestAdd addButton _4jy4 _517h _9c6']")).click();
        System.out.println("Cozmo india request send");
        
	}

}
