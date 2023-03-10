package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotdemo {
@Test	
	public void Screenshotdemo()throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook.com");
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.tagName("h3")).click();
		File sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dest= new File("./screenshoot/img1.jpg");
		File dest= new File("C:\\Users\\HP\\Desktop\\lucky\\img1.jpg");
		FileUtils.copyFile(sourceFile, dest);
		System.out.println("screenshot save successfully");
		
	}

}
