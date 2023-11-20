package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtilas.JavaUtils;

public class test1 {

	@Test (priority=3)
	public void facebook() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}
	@Test(invocationCount=2,priority=1)
	
	public void zomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		
		
	}
	@Test (priority=2)
	public void instagrm(){
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
}
}