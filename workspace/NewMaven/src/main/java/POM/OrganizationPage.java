package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import CommonUtilas.ExcelUtils;
import CommonUtilas.PropertFileUtils;
import CommonUtilas.WebDriverUtils;

public class OrganizationPage {

	@FindBy(name="accountname")
	private WebElement Organizationtf;

	public WebElement getOrganization() {
		return Organizationtf;
	}
	    @FindBy(xpath="(//input[@name='assigntype'])[2]")
	    private WebElement Assignedtobtn;

		public WebElement getAssignedtobtn() {
			return Assignedtobtn;
		}
		 @FindBy(name="assigned_group_id")
		 private WebElement Assignedropdown;

		public WebElement getAssignedropdown() {
			return Assignedropdown;
		}
		@FindBy(xpath="(//input[@name='button'])[1]")
		 private WebElement Savebtn11;

		
		public WebElement getSavebtn() {
			return Savebtn11;
		}
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		 private WebElement imagebtn;

		public WebElement getImagebtn() {
			return imagebtn;
		}
		@FindBy(xpath="//a[text()='Sign Out']")
		 private WebElement Signoutbtn;

		public WebElement getSignoutbtn() {
			return Signoutbtn;
		}
		
		@FindBy(name="firstname")
		 private WebElement firstnamebtn ;

		public WebElement getFirstnamebtn1() {
			return firstnamebtn;
		}
		
		@FindBy(name="lastname")
		 private WebElement lastnamebtn ;

		public WebElement getLastnamebtn() {
			return lastnamebtn;
		}
		  @FindBy(xpath="(//input[@name='button'])[1]")
			private WebElement Savebtn1;

		   public WebElement getSavebtn1() {
			return Savebtn11;
		}
		  
		}

		
		
		
		
	


