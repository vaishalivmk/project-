package mavenproject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerorg1 {

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
			driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Qsp");
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();

	       driver.findElement(By.xpath("//a[text()='Sign Out']")).click();





		// TODO Auto-generated method stub

	}

}
