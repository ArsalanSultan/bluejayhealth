package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Editprofile extends Login {
	
	@Test
	public void editprofile() throws InterruptedException {
	        //navigate to providerprofile
	        Thread.sleep(7000);
	        driver.navigate().to("https://provider.bluejayhealth.com/#/my-profile") ;
	        // clear first name
	        Thread.sleep(3000);
	       WebElement fname = driver.findElement(By.id("fname"));
	       fname.clear();
	       fname.sendKeys("naam bade");
	        //clear lastname
	       WebElement lname = driver.findElement(By.id("lname"));
	       lname.clear();
	       lname.sendKeys("darshan choty");
	      driver.findElement(By.name("pwd")).sendKeys("1234567@"); 
	      driver.findElement(By.name("cong_pwd")).sendKeys("1234567@");
	      // address
	      WebElement loca = driver.findElement(By.id("location"));
	       loca.clear();
	       loca.sendKeys("Gujranwala");
	       // phone
	       WebElement phone = driver.findElement(By.id("phone"));
	       phone.clear();
	       phone.sendKeys("659-546-6663");
	       // provider role change
	       WebElement providerdropDown = driver.findElement(By.xpath("//select[@ng-model='profile.userRoleId']"));
	        Select select = new Select(providerdropDown);
	        select.selectByVisibleText("Admin");
	        // speciality change
	        WebElement specialitydropDown = driver.findElement(By.xpath("//select[@ng-model='profile.specialtyId']"));
	        Select select1 = new Select(specialitydropDown);
	        select1.selectByVisibleText("General");
	        Thread.sleep(4000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,-250)", "");
	        Thread.sleep(4000);
	       // driver.findElement(By.xpath("//button[@ng-click='saveProfile(profile);']")).click();
	        Thread.sleep(8000);
	        // change profile picture
	     // WebElement upload =  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div[2]/div/div/div/form/div[1]/div/div/div[1]/div/a/span"));
	      //pload.click();
	        
	}
}

