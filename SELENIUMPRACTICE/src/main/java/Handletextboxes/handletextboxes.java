package Handletextboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handletextboxes {
		
			public static void main(String[] args) throws Exception{
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://github.com/login");
				Thread.sleep(3000);
				WebElement usernameTxt = driver.findElement(By.id("login_field"));
				if(usernameTxt.isDisplayed()) {
					if(usernameTxt.isEnabled()) {
						usernameTxt.sendKeys("nagalakshmi");
						String enteredText = usernameTxt.getAttribute("value");
						System.out.println(enteredText);
						Thread.sleep(3000);
						usernameTxt.clear();
					}
					else
						System.out.println("Username textbox is not enabled");
				}
				else
					System.out.println("Username textbox is not displayed");
				
			}

		

	}


