package bluejayengage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forgotpassword {
	public WebDriver driver;
	@BeforeClass
    public void openchrome() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		  ChromeOptions chromeoptions=new ChromeOptions();
			 chromeoptions.setHeadless(true);
		        driver = new ChromeDriver(chromeoptions);    
    }
@Test 
public void forgotpass() throws InterruptedException {
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://provider.bluejayhealth.com/#/login");
    driver.findElement(By.id("forgatepassMadal")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"lungflute\"]/body/div[3]/div[2]/div[1]/div[2]/div/form/div[1]/div/input")).sendKeys("boykaredemp@gmail.com");
    Thread.sleep(6000);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div/form/div[2]/button")).click();
    Thread.sleep(2000);
 // Initialize instance
    Actions action = new Actions(driver);

    // Find element to focus inside iframe
    WebElement we = driver.findElement(By.id("verificationCodeEnterModal"));
    // Perform move action
    action.moveToElement(we).build().perform();
    driver.findElement(By.id("emailAddress")).sendKeys("boykaredemp@gmail.com");
    driver.findElement(By.id("verificatonCode")).sendKeys("2345");
    driver.findElement(By.id("newPass")).sendKeys("12345677@");
    driver.findElement(By.id("confirmPass")).sendKeys("124325366");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@ng-click='resetNewPass()']")).click();
}
@AfterClass
public void shut() throws InterruptedException {
	Thread.sleep(7000);
	driver.quit();
}
}

