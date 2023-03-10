import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {
	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		String act=driver.getTitle();
		String expect = "Facebook";
		Assert.Equals(act,expect);
		System.out.println("Actual title:"+act);
		
		
		
		
	}

	private static void Equals(String act, String expect) {
		// TODO Auto-generated method stub
		
	}

	
	}
