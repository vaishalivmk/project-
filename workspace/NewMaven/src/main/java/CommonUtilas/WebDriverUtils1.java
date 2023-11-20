package CommonUtilas;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils1 {

	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
    
	public void implicitwait(WebDriver driver)
	{
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		

	}
	
	public void handleDropDown(WebElement elementname, String Data)
	{       
		Select s = new Select(elementname);
        s.selectByVisibleText(Data);
     }
	
	public void handleDropDown(WebElement elementname, int indexnumber)
	{	       
		Select s = new Select(elementname);
        s.selectByIndex(indexnumber);
     }
	
	public void action(WebDriver driver , WebElement elementname)
	{	       
		Actions a = new Actions(driver);
		a.click(elementname);
		a.perform();
		


	}

}
