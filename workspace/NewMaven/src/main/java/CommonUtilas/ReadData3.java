package CommonUtilas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadData3 {

	public static void main(String[] args) throws IOException 
	{
     final WebDriver driver;
		
		FileInputStream fis = new FileInputStream("src\\main\\resources\\Data.Properties3");
		Properties p = new Properties();
		p.load(fis);
		 String BROWSER = p.getProperty("browser");
		 
		 //public WebDriver driver=null;
		 
	 		
	        if(BROWSER.equalsIgnoreCase("chrome")) {
	        	driver = new ChromeDriver();
	        	
	        }else if(BROWSER.equalsIgnoreCase("Edge")) {
	        	driver = new EdgeDriver();
	        	
	        }else {
	        	driver = new FirefoxDriver();
	        }
	        
		 String URL = p.getProperty("url");
		 String USERNAME = p.getProperty("username");
		 String PASSWORD = p.getProperty("password");
		 
		 driver.get(URL);

		 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// TODO Auto-generated method stub

	}

}
