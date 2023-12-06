package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataPropertyTest {
	public WebDriver driver;

	@Test
	public  void vtigercrmPropertyTest() throws IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data2.Properties.txt");
		Properties p = new Properties();
		p.load(fis);
		
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
			
		}else if (BROWSER.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
			
			
		}else {
			driver = new EdgeDriver();
			
			
		}
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(USERNAME);
		//driver.findElement(By.id("user_name")).sendKeys(USERNAME);
		System.out.println("Good Morning");

        		
		

	}

}
 


