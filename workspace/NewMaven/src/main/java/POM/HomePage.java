package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	   //organization link
		@FindBy(xpath="(//a[text()='Organizations'])[1]")
		private WebElement Organizationlink;
		

		public WebElement getOrganizationlink() {
			return Organizationlink;		
			
		}
		
		@FindBy (xpath="//img[@title='Create Organization...']")
		private WebElement image;

		public WebElement getImage() {
			return image;
		}
         //contact link
		@FindBy(xpath="//a[text()='Contacts']")
		private WebElement Contactlink;


		public WebElement getContactlink() {
			return Contactlink;
		}
		
		@FindBy(xpath="//img[@title='Create Contact...']")
		private WebElement CreateContactlink;


		public WebElement getCreateContactlink() {
			return CreateContactlink;
		}
		@FindBy(xpath="//img[@title='Create Contact...']")
		private WebElement Contactimage;


		public WebElement getContactimage() {
			return Contactimage;
		}
		

         
		
		
        
		
		}

		

		
		
		
		
		

		
				
	


