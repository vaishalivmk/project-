package Basic;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//import org.openqa.selenium.JavaScriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import CommonUtilas.ExcelUtils;
import CommonUtilas.JavaUtils;
//import CommonUtilas.FileUtils;
import CommonUtilas.PropertFileUtils;
import CommonUtilas.WebDriverUtils;
import POM.ContactPage;
//import POM.ContactPage;
import POM.HomePage;
import POM.LoginPage;
import POM.OrganizationPage;
//import POM.homepagecontact;

public class CreateContact {

	
	@Test
	
	public void Contact () throws IOException, InterruptedException
	{
		
		final WebDriver driver;
		
		  PropertFileUtils futils = new PropertFileUtils();
		  WebDriverUtils wutils = new WebDriverUtils();
		  ExcelUtils eutils = new ExcelUtils();
			JavaUtils jutils = new JavaUtils();
		  // TO READ DATA FORM PROPERTY FILE
		  
		 String BROWSER = futils.getDataFromPropertyFile("browser");
		 String URL = futils.getDataFromPropertyFile("url");
		 String USERNAME = futils.getDataFromPropertyFile("username");
		  String PASSWORD = futils.getDataFromPropertyFile("password");
		  
		  // TO READ DATA FROM EXEL FILE
		  
		   String firstname = eutils.getDataFromExcelFile("Sheet1", 1, 3);   
		   String lastname = eutils.getDataFromExcelFile("Sheet1", 1, 4);   
		   String Drop = eutils.getDataFromExcelFile("Sheet1",1,2);
		   String OrgName = eutils.getDataFromExcelFile("Sheet1",0,2);
		   String PARENTURL = eutils.getDataFromExcelFile("Sheet1",1,5);
		   String CHILDURL = eutils.getDataFromExcelFile("Sheet1",4,5);

		   //to launch the browes 
		   
		   if(BROWSER.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}else if(BROWSER.equalsIgnoreCase("Edge")) {
				driver=new EdgeDriver();
			}else {
			      driver=new FirefoxDriver();
			}
		   
		  //To maximize the window
		   
		    wutils.maximize(driver);
		 //To apply implicitwait   
		    wutils.implicitwait(driver);
		//To launch url    
		    driver.get(URL);
        // Login to applicatio
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		// to click onconatacts 
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// click on contact + image
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
		// to enter first name
		
		 driver.findElement(By.name("firstname")).sendKeys(firstname);  
		 //To enter last name
			driver.findElement(By.name("lastname")).sendKeys(lastname);
		//To click on group radiobutton	
			driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		//To Dropdown webelemnt	
	       // WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
		//to handle dropdwon by visible text	
	       // wutils.handledropdown(dropdown, Drop);
	    //click on + in organization name
	        driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
	        
			//To Transfer control from parent to child

	        wutils.switchtowindow(driver,CHILDURL);
			
			//To Transfer control from parent to child
			
			/*driver.findElement (By.id("search_txt")).sendKeys("TCS");
			driver.findElement (By.name("search")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='TCS']")).click();
	        Thread.sleep(2000);*/
	        
			//To Transfer control from child to parent
	        wutils.switchtowindow(driver,PARENTURL);
	       
			// To  take screenshot on webpage
			
				wutils.screenshot(driver);
				Thread.sleep(2000);
			//To scrolling on webpage	
				wutils.scrolling(driver);
			//To click on save button	
			  driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();//save button
			  
               WebElement image = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
               
			   wutils.mousehover(driver, image);
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("//a[text()='Sign Out']")).click();//sign out */
			   

	         
		}
		
	
	}



