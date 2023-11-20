package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test3 {
        
	@Test
	public void Loing() {
		System.out.println("Login");
		Assert.assertEquals("pune","Deccan");// if condition is not satisfied next line will be skip
	}
	@Test(dependsOnMethods="Login")
   public void Home() {
		System.out.println("Home");
   }
	@Test(dependsOnMethods="Login")
   public void Logout() {
		System.out.println("Logout");
   }
}
