package OnlineClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng3 {

	@Test
	public void facebook() {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
	}
	@Test
	public void Instagramm() {
	  ChromeDriver chromeDriver = new ChromeDriver();
	   chromeDriver.get("https://www.instagram.com/");	

	}
	@Test(groups="shopping")
	public void flipcart() {
		 ChromeDriver chromeDriver = new ChromeDriver();
		   chromeDriver.get("https://www.flipkart.com/");	
	}
	@Test(groups="shopping")
	public void myntra() {
		 ChromeDriver chromeDriver = new ChromeDriver();
		   chromeDriver.get("https://www.myntra.com/");	
	}

}
