package trial;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/search?dcr=0&source=hp&ei=-pyVWr7XE4np0ATlt7ewDw&q=selenium&oq=selenium&gs_l=psy-ab.3..0l10.1747.6917.0.9168.8.6.0.2.2.0.224.734.0j4j1.5.0....0...1c.1.64.psy-ab..1.7.756...0i131k1j0i131i46k1j46i131k1j0i3k1.0.UCmH3rOO_y0");
		WebElement srch=driver.findElement(By.xpath("//input[@id='lst-ib' and @type='text']"));
		srch.clear();
		srch.sendKeys("Cognizant");
		Thread.sleep(5000);
		List<WebElement> auto=driver.findElements(By.xpath("ul[@role='listbox']/li/div/div[2]"));
		System.out.println(auto.size());
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		for(int i=0;i<=auto.size()-1;i++)
		{
			if(auto.get(i).getText().trim().equals("Cognizant wiki"))
			{
				act.sendKeys(Keys.ENTER).perform();
				break;
				
			}
			else
			{
				act.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(1000);
			}
		}
		

	}

}
