package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Schedule_ov extends Login {
	@Test
	public void scheduleov() throws InterruptedException {
	Thread.sleep(4000);
	driver.navigate().to("https://provider.bluejayhealth.com/#/mycalendar");
	Thread.sleep(9000);
	
	driver.switchTo().frame(0);

    WebElement frame1Heading = driver.findElement(By.id("buttonForOfficeVisit"));

    frame1Heading.click();
    @SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait (driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showNewAppointmentModal")));
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"ui-select-patient\"]/div[1]/input")).click();
    @SuppressWarnings("deprecation")
	WebDriverWait wait1 = new WebDriverWait(driver, 30);
  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-select-choices-row-2-0\"]/span"))).click();
  WebElement startdropDown = driver.findElement(By.id("startTime"));
  Select select3 = new Select(startdropDown);
  select3.selectByVisibleText("10:00 PM");
  Thread.sleep(3000);
  driver.findElement(By.id("savingAppointmentBtn")).click();
  
}
	
}

