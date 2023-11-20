package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test2 {

	SoftAssert s = new SoftAssert();
	@Test
	public void facebook() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle = "vtigerpune";
		s.assertEquals(actualtitle,expectedtitle);
		//Assert.assertEquals(actualtitle,expectedtitle);
		System.out.println(actualtitle);
		System.out.println("Good morning");
		//s.assertAll();//it is method which is fail the test script in the softassert
		}
	  @Test
	  public void vtigercrm() {
		  WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8888/");
			WebElement Loginbtn = driver.findElement(By.id("submitButton"));
			//Assert.assertTrue(Loginbtn.isEnabled());
			Assert.assertTrue(Loginbtn.isSelected());// f u pass true conditon output will be fail
			Assert.assertFalse(Loginbtn.isSelected());
			System.out.println("Hello");

	  }

}



















