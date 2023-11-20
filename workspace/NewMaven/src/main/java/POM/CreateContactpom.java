package POM;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonUtilas.ExcelUtils;
import CommonUtilas.PropertFileUtils;
import CommonUtilas.WebDriverUtils;

public class CreateContactpom {

	@Test
	
	public  void Contactpom() throws InterruptedException, IOException
	{
		final WebDriver driver;
		
		  PropertFileUtils futils = new PropertFileUtils();
		  WebDriverUtils wutils = new WebDriverUtils();
		  ExcelUtils eutils = new ExcelUtils();
		  
		  // TO READ DATA FORM PROPERTY FILE
		  
		 String BROWSER = futils.getDataFromPropertyFile("browser");
		 String URL = futils.getDataFromPropertyFile("url");
		 String USERNAME = futils.getDataFromPropertyFile("username");
		  String PASSWORD = futils.getDataFromPropertyFile("password");
		  
		  // TO READ DATA FROM EXEL FILE
		   String firstname = eutils.getDataFromExcelFile("Sheet1", 1, 3);   
		   String lastname = eutils.getDataFromExcelFile("Sheet1", 1, 4);   
		   String Drop = eutils.getDataFromExcelFile("Sheet1",1,2);
		  // String OrgName = eutils.getDataFromExcelFile("Sheet1",1,2);
		   String PARENTURL = eutils.getDataFromExcelFile("Sheet1", 1, 5);
			String CHILDURL = eutils.getDataFromExcelFile("Sheet1", 4, 5);
		   
		   if(BROWSER.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}else if(BROWSER.equalsIgnoreCase("Edge")) {
				driver=new EdgeDriver();
			}else {
			      driver=new FirefoxDriver();
			}
		   
		  
		    wutils.maximize(driver);
		    wutils.implicitwait(driver);
		    driver.get(URL);
		    
		    LoginPage lp = new LoginPage();
			PageFactory.initElements(driver, lp);
			lp.getUsernametf().sendKeys(USERNAME);
			lp.getPasswordtf().sendKeys(PASSWORD);
			Thread.sleep(2000);
			lp.getSubmitbtn().click();
			
			//homepagecontact hp = new homepagecontact();
			HomePage hp= new HomePage();
			PageFactory.initElements(driver, hp);
			hp.getContactlink().click();
	        hp.getCreateContactlink().click();
	        
	        ContactPage cont = new ContactPage();
	        PageFactory.initElements(driver, cont);
	     	cont.getFirstname().sendKeys(firstname);
	     	cont.getLastnametf().sendKeys(lastname);
			cont.getAssignnedtobtn().click();
			cont.getContactPlusbtn().click();
			
	        wutils.switchtowindow(driver,CHILDURL);
           // cont.getSearchbtn().sendKeys(OrgName);
           // cont.getSearchbtn().click();
	        wutils.switchtowindow(driver,PARENTURL);
	        cont.getAssignnedtobtn().click();
       	   // wutils.handledropdown(cont.getAssignedtodropdowm(),Drop );
       	    Thread.sleep(2000);

//			Set<String> ids = driver .getWindowHandles();
//			System.out.println(ids);
//			
//			for(String allid:ids) {
//				
//				driver.switchTo().window(allid).getTitle();
//			}
			//cont.getContactSearchtf().sendKeys(OrgName);
			//cont.getSearchbtn().click();
			//Thread.sleep(2000);
//			cont.getContacttext().click();
//			 for(String allids:ids) {
//					String allur = driver.switchTo().window(allids).getCurrentUrl();
//					System.out.println(allur);
//					String parenturl="http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing\r\n"
//							+ "";
		        //  if(allur.contains(parenturl)) {
		        	  //cont.getAssignnedtobtn().click();
		        	 // wutils.handledropdown(cont.getAssignedtodropdowm(),Drop );
		        	  Thread.sleep(2000);
		        	  cont.getSavebtn().click(); 
		        	  wutils.mousehover(driver,cont.getImagebtn());
		        	  cont.getContactSignoutbtn().click();
		        	  
		          }
			

		// TODO Auto-generated method stub

	

}
