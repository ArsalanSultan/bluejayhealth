package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Schedulevv_outpatient extends Login{
	@Test
	public void vvoutpat() throws InterruptedException {
		Thread.sleep(6000);
		driver.navigate().to("https://provider.bluejayhealth.com/#/mycalendar");
		Thread.sleep(9000);
		
		driver.switchTo().frame(0);

        WebElement frame1Heading = driver.findElement(By.id("buttonForVideoConference"));

        frame1Heading.click();
        @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait (driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showNewAppointmentModal")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"showNewAppointmentModal\"]/div/div/div[2]/div/div/div/div[4]/div[2]/label[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-select-patient\"]/div[1]/span")).click();
        @SuppressWarnings("deprecation")
		WebDriverWait wait111 = new WebDriverWait(driver, 30);
         wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-select-choices-row-4-0\"]/span"))).click();
         
         WebElement startdropDown = driver.findElement(By.id("startTime"));
         Select select3 = new Select(startdropDown);
         select3.selectByVisibleText("12:00 PM");
         
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
 		Thread.sleep(4000);
        driver.navigate().to("https://provider.bluejayhealth.com/#/upcoming-schedules");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(5000);
 
		 
	}

}
