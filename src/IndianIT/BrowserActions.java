package IndianIT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\AntiIndian\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("gayathri");
		Thread.sleep(5000);
		List<WebElement>suggestions=driver.findElements(By.xpath("//*[@role='listbox']/li"));
		for (WebElement m : suggestions) {
			String s=m.getText();
			System.out.println(s);
		}
		Thread.sleep(5000);
		}

	}


