package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilas.ExcelUtils;
import CommonUtilas.PropertFileUtils;
import CommonUtilas.WebDriverUtils;

public class CreateOrganizationpom {

	@Test
	public  void CreateOrganizationpom() throws IOException
	{
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
        //To Launch url
	    driver.get(URL);
	    //To maximize window
        wutils.maximize(driver);
        //To apply implicit wait
        wutils.implicitwait(driver);

	    
	    LoginPage lp = new LoginPage();
	    PageFactory.initElements(driver,lp);
	   lp.getUsernametf().sendKeys(USERNAME);
	   lp.getPasswordtf().sendKeys(PASSWORD);
	   lp.getSubmitbtn().click();
	   
	   HomePage hp= new HomePage();
	   PageFactory.initElements(driver,hp);
       hp.getOrganizationlink().click();
       hp.getImage().click();
        
        OrganizationPage org = new OrganizationPage();
	    PageFactory.initElements(driver,org);
        org.getOrganization().sendKeys(OrgName);
        org.getAssignedtobtn().click();
        
        wutils.handledropdown(org.getAssignedropdown(),Group);
        org.getSavebtn1().click();
        
//        wutils.mousehover(driver,org.getImagebtn());
//        org.getSignoutbtn().click();
//      	     

		// TODO Auto-generated method stub

	}

}
