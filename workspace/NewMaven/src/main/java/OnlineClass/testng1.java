package OnlineClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng1 {
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("BS");
	}
	
	@AfterSuite
		public void AS() {
		System.out.println("AS");  
		}
	
	@AfterClass
	public void AC() {
		System.out.println("close the browser");
		
	}
	@BeforeClass
	public void BC() {
		System.out.println("LANUCH the browser");
	
	}
}

