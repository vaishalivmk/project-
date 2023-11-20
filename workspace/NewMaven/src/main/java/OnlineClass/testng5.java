package OnlineClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng5 {

	public WebDriver driver;
	@Parameters("Browser")
	@Test
	public void Instagramm(String Browser) {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}else {
			driver = new FirefoxDriver();
		}
		driver.get("https://www.instagram.com/");
	}

}
