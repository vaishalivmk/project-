package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	
		public class homepagecontact {

			
			@FindBy(xpath = "//a[text()='Contacts']")
			private WebElement contactbtn;

			public WebElement getContactbtn() {
				return contactbtn;
			}

			@FindBy (xpath="//img[@title='Create Contact...']")
			private WebElement image;

			public WebElement getImage() {
				return image;
			}
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
		// TODO Auto-generated method stub


