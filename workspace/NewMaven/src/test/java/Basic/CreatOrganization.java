package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilas.ExcelUtils;
import CommonUtilas.JavaUtils;
import CommonUtilas.PropertFileUtils;
import CommonUtilas.WebDriverUtils;
import POM.HomePage;
import POM.LoginPage;
import POM.OrganizationPage;

public class CreatOrganization {

	@Test
	
	public  void Organization () throws IOException, InterruptedException
	{
		final WebDriver driver;
		
		PropertFileUtils futils = new PropertFileUtils();
		WebDriverUtils wutils = new WebDriverUtils();
		ExcelUtils eutils = new ExcelUtils();
		JavaUtils jutils = new JavaUtils();

		/*To read the data from property file */
		String BROWSER=futils.getDataFromPropertyFile("browser");
		String URL=futils.getDataFromPropertyFile("url");
		String USERNAME=futils.getDataFromPropertyFile("username");
		String PASSWORD=futils.getDataFromPropertyFile("password");
		
		/* To read data from excel utils*/
		String OrgName = eutils.getDataFromExcelFile("Sheet1", 1, 0);
		String Group = eutils.getDataFromExcelFile("Sheet1", 1, 1);
		String Industry = eutils.getDataFromExcelFile("Sheet1", 1, 2);
				
        		
        if(BROWSER.equalsIgnoreCase("chrome")) {
        	driver = new ChromeDriver();
        	
        }else if(BROWSER.equalsIgnoreCase("Edge")) {
        	driver = new EdgeDriver();
        	
        }else {
        	driver = new FirefoxDriver();
        }
        //To Launch url
	    driver.get(URL);
	    //To maximize window
        wutils.maximize(driver);
        //To apply implicit wait
        wutils.implicitwait(driver);

        //login to applicatin
        driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//Enter account name
		driver.findElement(By.name("accountname")).sendKeys(OrgName + jutils.getrandomnumber());
		//Dropdown webelement
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		//Handle dropdown by visible text
//		wutils.handledropdown(dropdown, Group);
		wutils.handledropdown(dropdown, 2);
		//dropdown webelement
		WebElement industrydropdown = driver.findElement(By.name("industry"));
		//Handle dropdown by visible text
		wutils.handledropdown(industrydropdown, Industry);
		//checkbox
		WebElement box = driver.findElement(By.name("notify_owner"));
		//click on action on checkbox
		wutils.action(driver, box);
		//TO click on save
		//Admin image
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();//save button
		// mouse hovering on admin image 
       /* WebElement image = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        
		   wutils.mousehover(driver, image);
			Thread.sleep(4000);*/
			//to sign out 
			   //driver.findElement(By.xpath("//a[text()='Sign Out']")).click();//sign out 

		   




	    
	   
		// TODO Auto-generated method stub

	}

}
