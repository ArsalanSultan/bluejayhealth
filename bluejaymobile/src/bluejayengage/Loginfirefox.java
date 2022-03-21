package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Loginfirefox {
	public WebDriver driver;
	@BeforeClass
    public void openfirefox() throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.30.0-win64/geckodriver.exe");
		  
		//ChromeOptions chromeoptions=new ChromeOptions();
	//	 chromeoptions.setHeadless(true);
	        driver = new FirefoxDriver();//chromeoptions);
	        driver.manage().window().maximize();
	        String webUrl="https://provider.bluejayhealth.com/#/login";
			  driver.get(webUrl);
		     Thread.sleep(4000);
				  driver.findElement(By.id("exampleInputEmail2")).sendKeys("boykaredemp@gmail.com");
			        driver.findElement(By.id("exampleInputPassword2")).sendKeys("1234567@");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//button[@ng-click='openChooseRegionPopUp(user)']")).click();
			        Thread.sleep(5000);
    }
	@AfterClass
	public void shut() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
