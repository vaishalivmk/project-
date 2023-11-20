package mavenproject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import CommonUtilas.ExcelUtils;
import CommonUtilas.PropertFileUtils;
import CommonUtilas.WebDriverUtils;

public class Vtiger_CreateContact {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		// TODO Auto-generated method stub
		final WebDriver driver;	
	    PropertFileUtils utils = new PropertFileUtils();
	    ExcelUtils eutils = new ExcelUtils();
	    WebDriverUtils wUtils = new WebDriverUtils();
	    
	  //To read Data from properties file File
	    
		String BROWSER = utils.getDataFromPropertyFile("browser");
		String URL = utils.getDataFromPropertyFile("url");
		String USERNAME = utils.getDataFromPropertyFile("username");
		String PASSWORD= utils.getDataFromPropertyFile("password");
		
		//To read Data from Excel File
		String FirstName = eutils.getDataFromExcelFile("Sheet1", 1, 3);

		String LastName = eutils.getDataFromExcelFile("Sheet1", 1, 4);
		String group = eutils.getDataFromExcelFile("Sheet1", 4, 1);
        String leadsource = eutils.getDataFromExcelFile("Sheet1",4,2);
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else {
		      driver=new FirefoxDriver();
		}
		
		wUtils.maximize(driver);
		wUtils.implicitwait(driver);		
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	    driver.findElement(By.name("firstname")).sendKeys(FirstName);      
		driver.findElement(By.name("lastname")).sendKeys(LastName);
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
        WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
        wUtils.handledropdown(dropdown, group);
        
        WebElement leadsourcedropdown1 = driver.findElement(By.name("leadsource"));
        wUtils.handledropdown(leadsourcedropdown1,leadsource);
        
        WebElement box = driver.findElement(By.name("notify_owner"));
        wUtils.action(driver,box);
        
        driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		   
		   WebElement mousehover1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		   wUtils.mousehover(driver, mousehover1);
		   driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		   
		//driver.findElement(By.xpath("(//input[@name='button'])[1]"));
        
        
        
        
        
        
        
		
        
       
	}

}
