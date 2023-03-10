package rgb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rgbclrs {
	@Test
	public void rgb() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration .ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://jqueryui.com/progressbar/");
		WebElement text = driver.findElement(By.xpath("//img[@title=\"Support the JS Foundation\"]"));
		String name = text.getCssValue("color");
	    System.out.println(name);
		String color=Color.fromString(name).asHex();
		System.out.println(color);
		if (color.equals("#b24926")) {
			System.out.println("color matched");
		}else {
			System.out.println("color not matched");
		}
		
	
		
		
	}

}



