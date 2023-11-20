package CommonUtilas;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {

	//To maximize the screen
          public void maximize(WebDriver driver) {
         driver.manage().window().maximize();

	}
     // To minimize the screen
     public void minimize(WebDriver driver) {
 		driver.manage().window().minimize();

     }
     public void implicitwait(WebDriver driver) {
 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     }
     //To handledropdown
     public void handledropdown(WebElement elementname,String Data) {
    	Select s = new Select (elementname);
 		s.selectByVisibleText(Data);

     }
     public void handledropdown(WebElement elementname,int indexnumber) {
    	Select s = new Select (elementname);
 		s.selectByIndex(indexnumber);

     
     }
     public void action(WebDriver driver,WebElement element) {
    	 Actions a= new Actions(driver);
    	 a.click(element);
    	 a.perform();
     }
     
     // To mousehover on webpage
       public void mousehover (WebDriver driver,WebElement webelement) {
  	   
         Actions a= new Actions(driver);
         a.moveToElement(webelement);
         a.perform();
       }
       //TO scrolling on webpage
        public void scrolling(WebDriver driver) {
        	JavascriptExecutor jse = (JavascriptExecutor) driver;
        	jse.executeScript("window.scrollBy(0,900)");
        	
        	
        }
       // To take screenshot on webpage
       public void screenshot(WebDriver driver) throws IOException {
    	 TakesScreenshot ts = (TakesScreenshot) driver;
         File tempfile =ts.getScreenshotAs(OutputType.FILE);
         File destinationfile = new File("./images/vtiger.jpg");
 	     FileUtils.copyFile(tempfile,destinationfile);
    	 
     }
       public void switchtowindow(WebDriver driver ,String childurl ) throws InterruptedException {
    	   Set<String>ids = driver.getWindowHandles();
			System.out.println(ids);
			for(String allids:ids) {
				String allurl = driver.switchTo().window(allids).getCurrentUrl();
	        Thread.sleep(2000);
              System.out.println(allurl);
              String childurl1="";
              if(allurl.contains(childurl1)) {
            	  break;
              }
			}
       }
	}
