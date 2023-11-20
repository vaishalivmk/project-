package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	   @FindBy(name="user_name")
	   private WebElement usernametf;
	
	    @FindBy(name="user_password")
	    private	WebElement  passwordtf;
	    
	    @FindBy(xpath="//input[@type='submit']")
	    private	WebElement submitbtn ;

		public WebElement getUsernametf() {
			return usernametf;
		}

		public WebElement getPasswordtf() {
			return passwordtf;
		}

		public WebElement getSubmitbtn() {
			return submitbtn;
		}
        
	
		}

