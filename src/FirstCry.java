

import java.util.List;
import java.util.Locale.Category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FirstCry {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://www.firstcry.com");
		driver.findElement(By.xpath("//a[contains(.,'Close')]/following-sibling::div")).click();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		List<WebElement> categories = driver.findElements(By.xpath("//div[@class=\"menu-container media-pros\"]/child::ul/li[not(starts-with(@class,'last'))]/a[not(@class='men_temp')]"));
		for(int i=0;i<categories.size();i++) {
			String CategoryText = categories.get(i).getText();
			System.out.println(CategoryText);//////////////////////////
			act.moveToElement(categories.get(i)).build().perform();
			Thread.sleep(2000);
			List<WebElement> secondCategory = driver.findElements(By.xpath("//div[@class=\"menu-option-container menu1\"]/div[@class='options']/descendant::li[starts-with(@id,'submenu')]/a"));
			for(int j=0;j<secondCategory.size();j++) {
				String secondCategoryText = secondCategory.get(j).getText();
				System.out.println(secondCategoryText);
				
			}
		}
		
	}

}
