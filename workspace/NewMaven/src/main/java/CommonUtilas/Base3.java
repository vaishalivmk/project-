package CommonUtilas;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginPage;

public class Base3 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
//		LoginPage lp= new LoginPage(driver);
//		lp.Login("admin","admin");
//		PageFactory.initElements(driver,lp);
//		lp.getUsernametf().sendKeys("admin");
//		lp.getPasswordtf().sendKeys("admin");
//		lp.getLoginbtn().click();
		// TODO Auto-generated method stub

	}

}
