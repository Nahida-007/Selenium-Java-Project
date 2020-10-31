package First.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebdriverMethod1 {
	
	public static WebDriver driver;

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
	String CurrentUrl =	driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	
	String Title = driver.getTitle();
	System.out.println(Title);
	
	String PageSource = driver.getPageSource();
	System.out.println(PageSource);
	
	driver.navigate().to("https://www.google.com");
	
	driver.close();

	}

}
