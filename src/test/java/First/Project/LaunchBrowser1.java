package First.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		

	}

}
