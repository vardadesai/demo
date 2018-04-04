package trial;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;



public class Download {

	public static void main(String[] args) throws IOException, InterruptedException {
		FirefoxProfile pf=new FirefoxProfile();
		pf.setPreference("browser.download.folderList",2);
		pf.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		pf.setPreference("browser.download.dir", "C:\\Users\\Hareesh\\Documents\\Softwares");
		File f=new File("C:\\Users\\Hareesh\\Downloads\\firebug-2.0.19-fx.xpi");
		pf.addExtension(f);
		WebDriver driver=new FirefoxDriver(pf);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Java']/following-sibling::td[3]/a")).click();
		
		

	}

}
