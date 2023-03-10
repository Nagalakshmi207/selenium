package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	@Test
public static void demo() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	driver.switchTo().frame("moneyiframe");
	String nse= driver.findElement(By.id("nseindex")).getText();
	System.out.println("nse");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("CRICKET")).click();
	}
}
