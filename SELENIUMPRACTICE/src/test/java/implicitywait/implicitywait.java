package implicitywait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitywait {
	@Test
	public static void demo() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://web.whatsapp.com/");
		String act=driver.getTitle();
		String expect = "WhatsApp Web";
		Assert.assertEquals(act,expect);
		System.out.println("Actual title:"+act);
	
	File sourcefile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\HP\\Desktop\\lucky\\.img4.jpg");
	FileUtils.copyFile(sourcefile,dest);
	System.out.println("Schreenshot saved successfully");
	
}

}
