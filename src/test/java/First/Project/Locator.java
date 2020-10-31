package First.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static WebDriver driver ;

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//id
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("nahida1994@gmail.com");
		
		//Name
		WebElement  password = driver.findElement(By.name("pass"));
		password.sendKeys("ABC@123");
		
	
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
		
		
	}

}
