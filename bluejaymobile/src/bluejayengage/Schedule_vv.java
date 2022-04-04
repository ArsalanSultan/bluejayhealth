package bluejayengage;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Schedule_vv extends Login{
	@SuppressWarnings("deprecation")
	@Test
	public void vv() throws InterruptedException {
		Thread.sleep(7000);
		driver.navigate().to("https://provider.bluejayhealth.com/#/mycalendar");
		Thread.sleep(8000);
		
		driver.switchTo().frame(0);

        WebElement frame1Heading = driver.findElement(By.id("buttonForVideoConference"));

        frame1Heading.click();
        WebDriverWait wait = new WebDriverWait (driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showNewAppointmentModal")));
     
     		
	    Thread.sleep(7000);
	 // snf
		  driver.findElement(By.xpath("//*[@id=\"ui-select-facility\"]/div[1]/span")).click();
		  WebDriverWait wait11 = new WebDriverWait(driver, 30);
	      wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-select-choices-row-2-0\"]/span"))).click();
	        
	        //facilitator
	         driver.findElement(By.xpath("//*[@id=\"ui-select-facilitymanager\"]/div[1]/span")).click();
	         WebDriverWait wait111 = new WebDriverWait(driver, 30);
	         wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-select-choices-row-3-0\"]/span"))).click();
	           
	        
	        // patient
	        driver.findElement(By.xpath("//*[@id=\"ui-select-patient\"]/div[1]/span")).click();
	        WebDriverWait wait1111 = new WebDriverWait(driver, 30);
	         wait1111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-select-choices-row-4-0\"]/span"))).click();
	           
	        
	        

	         //Get the list of dropdown options
	         List<WebElement> itemsInDropdown = driver.findElements(By.id("startTime"));

	         // Get the size of dropdown list
	         int size = itemsInDropdown.size();

	         // Generate the random number
	         int randomNumber = ThreadLocalRandom.current().nextInt(0, size);

	         // Clicking on random value
	         itemsInDropdown.get(randomNumber).click();
	         
	            
	         
//	        WebElement startdropDown = driver.findElement(By.id("startTime"));
//	        Select select3 = new Select(startdropDown);
//	        select3.selectByVisibleText("11:00 AM");
	        
	        WebElement durationdropDown = driver.findElement(By.id("interval_min"));
	        Select select4 = new Select(durationdropDown);
	        select4.selectByVisibleText("10 Mins");
	        
	        driver.findElement(By.xpath("//*[@id=\"savingAppointmentBtn\"]")).click();
	        Thread.sleep(3000);
	     // Initialize instance 
			   Actions action = new Actions(driver);

			    // Find element to focus inside iframe
			    WebElement we = driver.findElement(By.xpath("//*[@id=\"modalPopupWrapper\"]/div[4]"));
			    // Perform move action
			action.moveToElement(we).build().perform();
			
			driver.findElement(By.xpath("//*[@id=\"modalPopupWrapper\"]/div[4]/div/div/div[2]/div/div/div[1]/div[2]")).click();
			 Thread.sleep(3000);
		        driver.navigate().refresh();
		        Thread.sleep(4000);
		        driver.navigate().to("https://provider.bluejayhealth.com/#/upcoming-schedules");
		        Thread.sleep(2000);
		        driver.navigate().refresh();
		        Thread.sleep(5000);
		 
	}

	
}
