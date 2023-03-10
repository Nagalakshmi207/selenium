package datepicker;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {
	@Test
public void datepicker( )throws Exception {
WebDriverManager.chromedriver().setup();
//WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(options);
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
driver.get("https://jqueryui.com/datepicker/");
String month = "July 2023";
String day = "20";
driver.switchTo().frame(0);
driver.findElement(By.id("datepicker")).click();
Thread.sleep(3000);
while(true) {
	String text = driver.findElement(By.className("ui-datepicker-title")).getText();
	if (text.equals(month)) {
		break;
	} else {
		driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
	}
	
}
driver.findElement(By.xpath("//a[contains(text(),"+day+")]")).click();

	
}
}
