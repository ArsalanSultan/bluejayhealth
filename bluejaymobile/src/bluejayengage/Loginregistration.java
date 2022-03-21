package bluejayengage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.UUID;

public class Loginregistration {
	public WebDriver driver;
	@BeforeMethod
    public void openchrome() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		  ChromeOptions chromeoptions=new ChromeOptions();
			 chromeoptions.setHeadless(true);
		        driver = new ChromeDriver(chromeoptions);    
    }
	@Test
	public void loginreg() throws InterruptedException {
		driver.get("https://provider.bluejayhealth.com/#/login");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//button[contains(text(),'Register Now')]")).click();
	     Thread.sleep(4000);
	 	// send new key each time
		//String uuid = UUID.randomUUID().toString();
	     Random randomGenerator = new Random();  
	     int randomInt = randomGenerator.nextInt(1000); 
	     driver.findElement(By.id("therapistEmail123")).sendKeys("username"+randomInt+"@grr.la");
	     Thread.sleep(5000);
	     driver.findElement(By.id("therapistPass")).sendKeys("1234567@");
	     // provider dropdown
	     WebElement providerdropDown = driver.findElement(By.xpath("//select[@ng-model='otherInfo.provider']"));
	        Select select = new Select(providerdropDown);
	        select.selectByVisibleText("Admin");
	        // speciality dropdown
	        WebElement specialitydropDown = driver.findElement(By.xpath("//select[@ng-model='otherInfo.speciality']"));
	        Select select1 = new Select(specialitydropDown);
	        select1.selectByVisibleText("General");
	        // country dropdown
	        WebElement countrydropDown = driver.findElement(By.xpath("//select[@ng-model='otherInfo.countryId']"));
	        Select select2 = new Select(countrydropDown);
	        select2.selectByVisibleText("United States");
	        // state dropdown
	        WebElement statedropDown = driver.findElement(By.xpath("//select[@ng-model='otherInfo.stateId']"));
	        Select select3 = new Select(statedropDown);
	        select3.selectByVisibleText("Kansas");
	        // register button
	        Thread.sleep(2000);
	     driver.findElement(By.name("Get Started")).click();
	     Thread.sleep(9000);
	     driver.quit();
	}
}

