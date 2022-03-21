package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Filters_dashboard {
	public WebDriver driver;
	@BeforeClass
    public void openchrome() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		  
		//ChromeOptions chromeoptions=new ChromeOptions();
		// chromeoptions.setHeadless(true);
	        driver = new ChromeDriver();//chromeoptions);
	        driver.manage().window().maximize();
	        String webUrl="https://provider.bluejayhealth.com/#/login";
			  driver.get(webUrl);
		     Thread.sleep(4000);
				  driver.findElement(By.id("exampleInputEmail2")).sendKeys("demo@bluejayhealth.com");
			        driver.findElement(By.id("exampleInputPassword2")).sendKeys("123456");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//button[@ng-click='openChooseRegionPopUp(user)']")).click();
			        Thread.sleep(5000);
    }
	@Test
	public void filters() throws InterruptedException {
		Thread.sleep(5000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,350)", "");
		//compliance
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[1]/select")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[1]/select/option[4]")).click();
		  Thread.sleep(3000);
		  //outcome
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[2]/select")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[2]/select/option[4]")).click();
		  Thread.sleep(3000);
		  // Exercise
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[3]/select")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[3]/select/option[4]")).click();
		  Thread.sleep(3000);
		  //status
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[4]/select")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"view-patient-list\"]/div[2]/div[1]/div[1]/ul/li[2]/ul/li[4]/select/option[4]")).click();
		  Thread.sleep(3000);
		  
		  
	}
	@AfterClass
	public void shut() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
