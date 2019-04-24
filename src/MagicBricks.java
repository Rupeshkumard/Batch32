

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagicBricks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.magicbricks.com");
		driver.findElement(By.id("keyword")).sendKeys("Bangalore South");
		driver.findElement(By.xpath("//div[@id='buy_propertyType']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[contains(.,'RESIDENTIAL') and (@class=\"propertyHeading\") ])[1]/parent::ul/descendant::input[@title=\"Flat\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@title=\"2 BHK\"])[1]")).click();
		driver.findElement(By.xpath("//input[@value='Budget' and @type='button' and @id='buy_budget_lbl']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Min' and @name='budgetBuyPerSqftMin']")).sendKeys("5000000");
		driver.findElement(By.xpath("//input[@id='rangeMaxLinkbudgetBuyinput' and @name='budgetPerSqftMax']")).sendKeys("7000000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}
