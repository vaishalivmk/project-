package mavenproject1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readvi {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		//To read  data from ecternal resource
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data1.properties");
		
		//To read data from property file
		Properties p = new Properties(); 
		
		//To read the location of property file
		p.load(fis);
		
		//To read key from property file
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);


	}

}
