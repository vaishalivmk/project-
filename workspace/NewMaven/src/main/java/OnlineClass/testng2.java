package OnlineClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng2 {
	
	@BeforeClass
	public void BC() {
		System.out.println("BC");
	
	}
	
	
       @Test
       public void facebook() {
   		System.out.println("facebook");

    	   
       }
       @AfterClass
   	public void AC() {
   		System.out.println("AC");
   		
   	}

}
