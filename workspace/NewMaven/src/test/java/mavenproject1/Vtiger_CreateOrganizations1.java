package mavenproject1;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import CommonUtilas.ExcelUtils;
import CommonUtilas.PropertFileUtils;
import CommonUtilas.WebDriverUtils; 

public class Vtiger_CreateOrganizations1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
				final WebDriver driver;
			
				PropertFileUtils futils = new PropertFileUtils();
				WebDriverUtils wutils = new WebDriverUtils();
				ExcelUtils eutils = new ExcelUtils();
				
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
		        
		        wutils.maximize(driver);
		        wutils.implicitwait(driver);

			    driver.get(URL);
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
				
				driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				
				driver.findElement(By.name("accountname")).sendKeys(OrgName);
				driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
				Thread.sleep(2000);
				WebElement dropdown = driver.findElement(By.name("assigned_group_id"));
//				wutils.handledropdown(dropdown, Group);
				wutils.handledropdown(dropdown, 0);
				
				WebElement industrydropdown = driver.findElement(By.name("industry"));
				wutils.handledropdown(industrydropdown, Industry);
				
				WebElement box = driver.findElement(By.name("notify_owner"));
				wutils.action(driver, box);
				
				driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
				WebElement image = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				wutils.mousehover(driver,image);
				 driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
				   
				   WebElement mousehover1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				   wutils.mousehover(driver, mousehover1);
				   driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
				   
				//driver.findElement(By.xpath("(//input[@name='button'])[1]"));
				
		        


			}

		}
	


