package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class login {

	 @FindBy(name="user_name")
	   private WebElement usernametf;
	
	    @FindBy(name="user_password")
	    private	WebElement  passwordtf;
	    
	    @FindBy(id="submitButton")
	    private	WebElement Loginbtn ;

		public WebElement getUsernametf() {
			return usernametf;
		}

		public WebElement getPasswordtf() {
			return passwordtf;
		}
         
		 public void Login() {
			 Loginbtn.click();
		    }
		public WebElement getLoginbtn() {
			return Loginbtn;
		}
		
		

}
