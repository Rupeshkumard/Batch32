

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com");
		driver.findElement(By.name("search_query")).sendKeys("rings");
	//	driver.findElement(By.xpath("//input[contains(@name,'search') and @class='button']"));
		
	}

}
