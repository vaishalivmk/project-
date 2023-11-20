package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	
	
		// login page username text 
		@FindBy(name = "firstname")
		private WebElement firstname;

	    public WebElement getFirstname() {
			return firstname;
		}

		@FindBy(name = "lastname")
	     private WebElement lastnametf;

	    public WebElement getLastnametf() {
		return lastnametf;
	    }

	    @FindBy(xpath = "(//input[@name='assigntype'])[2]")
	    private WebElement Assignnedtobtn;

	    public WebElement getAssignnedtobtn() {
		return Assignnedtobtn;
	    }

	    @FindBy(name = "assigned_group_id")
	    private WebElement Assignedtodropdowm;

	    public WebElement getAssignedtodropdowm() {
		return Assignedtodropdowm;
	    }

	    @FindBy(xpath = "(//input[@name='button'])[1]")
	    private WebElement Savebtn;

	   public WebElement getSavebtn() {
		return Savebtn;
	   }

        //contact page
	    @FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	    private WebElement Imagebtn;

	   public WebElement getImagebtn() {
		return Imagebtn;
	   }
       // contact sign out
    	@FindBy(xpath = "//a[text()='Sign Out']")
	    private WebElement ContactSignoutbtn;

		public WebElement getContactSignoutbtn() {
			return ContactSignoutbtn;
		}
        // contact plus button
		@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	    private WebElement ContactPlusbtn;

		   public WebElement getContactPlusbtn() {
			return ContactPlusbtn;
		}
        //contact search text box
		 @FindBy(id ="search_txt")
	     private WebElement ContactSearchtf;
		 
	       public WebElement getContactSearchtf() {
			return ContactSearchtf;
		}
	       //contact serach button
	         @FindBy(name ="search")
		     private WebElement Searchbtn;

			public WebElement getSearchbtn() {
				return Searchbtn;
			}
	       
			@FindBy(name ="//a[text()='TCS']")
		     private WebElement Contacttext;

			public WebElement getContacttext() {
				return Contacttext;
			}
			@FindBy(name ="//input[@name='firstname']")
		     private WebElement getFirstnametf;
             
			
			public WebElement getGetFirstnametf() {
				return getFirstnametf;
			}


			public WebElement getGetLastnametf() {
				return getLastnametf;
			}

			@FindBy(name ="//input[@name='lastname']")
		     private WebElement getLastnametf;

			

			
			}
			
			
			
			
	       

	
       
