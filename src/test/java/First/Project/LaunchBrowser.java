package First.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		
	  

	}

}
