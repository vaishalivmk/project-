package mavenproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtigerconta2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement (By.name("user_name")).sendKeys("admin");
		driver.findElement (By.name("user_password")).sendKeys("admin");
		driver.findElement (By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//driver.findElement(By.xpath("//img[@title=\"Create Contact...]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Contact...\"]")).click();
//		//driver.findElement(By.id("firstname")).click();
//		Select firstname = new Select(driver.findElement(By.xpath("(//td[@class='dvtCellLabel'])[1]")));
//		firstname.selectByVisibleText("Ms.");
//		firstname.selectByIndex(1);
//		
     driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
        //driver.findElement(By.xpath("(//td[@class='small'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

        
        driver.findElement(By.xpath("//a[text()='Sign Out']")).click();



		
		// TODO Auto-generated method stub

	}

}
