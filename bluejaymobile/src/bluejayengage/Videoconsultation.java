package bluejayengage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Videoconsultation {
	public WebDriver driver;
	@BeforeClass
    public void openchrome() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32/chromedriver.exe");
		  
		//ChromeOptions chromeoptions=new ChromeOptions();
		// chromeoptions.setHeadless(true);
	        driver = new ChromeDriver();//chromeoptions);
	        driver.manage().window().maximize();
	        String webUrl="https://provider.bluejayhealth.com/#/login";
			  driver.get(webUrl);
		     Thread.sleep(4000);
				  driver.findElement(By.id("exampleInputEmail2")).sendKeys("far_clinic_org_provider@grr.la");
			        driver.findElement(By.id("exampleInputPassword2")).sendKeys("1234567@");
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("//button[@ng-click='openChooseRegionPopUp(user)']")).click();
			        Thread.sleep(5000);
	}
	@SuppressWarnings({ "unlikely-arg-type", "deprecation" })
	@Test
	public void videoconsultation() throws InterruptedException {
		 Thread.sleep(7000);
	        driver.navigate().to("https://provider.bluejayhealth.com/#/my-profile");
	        Thread.sleep(3000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(4000);
	       driver.findElement(By.partialLinkText("Video Consultation")).click();
	       // shift control to other tab
	        Set<String> handles = driver.getWindowHandles();
	        driver.getWindowHandle();
	        for (String handle : handles) {

	         if (!handle .equals(handles))
	         {
	             driver.switchTo().window(handle);
	         }
	       }
	        Thread.sleep(9000);

	       //fill your form in the other tab
	      //  driver.findElement(By.id("vc_firstName")).sendKeys("Reggie");
	       // driver.findElement(By.id("vc_lastName")).sendKeys("kray");
	       // driver.findElement(By.id("vc_email")).sendKeys("regkray@grr.la");
	        driver.findElement(By.id("phoneNo")).sendKeys("508-272-9487");
	        driver.findElement(By.xpath("//*[@id=\"VideoVistConsultation\"]/div[3]/div[1]/div[2]/input")).click();
	        Thread.sleep(9000);
	        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	       driver.switchTo().window(tabs.get(1)); //switches to new tab
	       // open link in new tab
	        ((JavascriptExecutor)driver).executeScript("window.open('https://www.receivesms.co/us-phone-number/3457/','_blank');");
	        Thread.sleep(3000);
		    //   driver.get("https://www.receivesms.co/us-phone-number/3433/");
	     // shift control to other tab
	        Set<String> handles1 = driver.getWindowHandles();
	        driver.getWindowHandle();
	        for (String handle : handles1) {

	         if (!handle .equals(handles1))
	         {
	             driver.switchTo().window(handle);
	         }
	       }
	        Thread.sleep(9000);
	        JavascriptExecutor jis = (JavascriptExecutor) driver;
	        jis.executeScript("window.scrollBy(0,250)", "");
	        
	        Set<String> handless = driver.getWindowHandles();
	        driver.getWindowHandle();
	        for (String handle : handless) {

	         if (!handle .equals(handless))
	         {
	             driver.switchTo().window(handle);
	         }
	       }
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        Thread.sleep(9000);
	        driver.navigate().refresh();
	        Thread.sleep(9000);
	        JavascriptExecutor jiis = (JavascriptExecutor) driver;
	        jiis.executeScript("window.scrollBy(0,250)", "");
	        // Initialize instance
		    Actions action1 = new Actions(driver);

		    // Find element to focus inside iframe
		    WebElement wee = driver.findElement(By.xpath("//*[contains(text(),'BlueJay Msg')]"));
		    // Perform move action
		   action1.moveToElement(wee).build().perform();
		   
	      //  driver.findElement(By.xpath("//*[contains(text(),'BlueJay Msg')]"));
		   
	        WebElement code = driver.findElement(By.xpath("//span[@class='btn1']"));
	        code.getText();
	        // switch to video consult tab
	       driver.switchTo().window(tabs.get(1)); // switch back to main screen        
	    
	        
	      //  driver.get("https://provider.bluejayhealth.com/videoconsultation/#/request-vv/T3BoVnlPL0tVd1oyaGxySC9nMDFZN0JmZmJuc1B4b09sNGcvdTMxTmQ5WT0");
	         
	         Thread.sleep(5000);
	         driver.findElement(By.xpath("//*[@id=\"opt_verification_popup\"]/div/div/div[2]/div[2]/div[2]/input")).sendKeys(""+code);
	         driver.findElement(By.xpath("//*[@id=\"opt_verification_popup\"]/div/div/div[3]/div[2]/input")).click();
	         Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"VideoVistConsultation\"]/div[3]/div[1]/div[2]/input")).sendKeys("Boston");
            driver.findElement(By.xpath("//*[@id=\"VideoVistConsultation\"]/div[4]/div[1]/div[2]/input")).sendKeys("2344");
	       //go back to first tab if you want
	       // driver.switchTo().window(currentHandle);
	}
	@AfterClass
	public void shutdown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
