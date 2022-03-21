package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Login {
public WebDriver driver;
	@BeforeMethod
    public void openchrome() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		  
		//ChromeOptions chromeoptions=new ChromeOptions();
	 //  chromeoptions.setHeadless(true);
	        driver = new ChromeDriver();//chromeoptions);
	        driver.manage().window().maximize();
	        DesiredCapabilities caps=new DesiredCapabilities();
	        caps.setCapability("resolution", "1680*1050");
	        String webUrl="https://provider.bluejayhealth.com/#/login";
			  driver.get(webUrl);
		     Thread.sleep(4000);
				  driver.findElement(By.id("exampleInputEmail2")).sendKeys("boykaredemp@gmail.com");
			        driver.findElement(By.id("exampleInputPassword2")).sendKeys("1234567@");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//button[@ng-click='openChooseRegionPopUp(user)']")).click();
			        Thread.sleep(5000);
    }
	@AfterMethod
	public void shut() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.quit();
	}
}
