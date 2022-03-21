package bluejayengage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assign_educationmaterial extends Login {

	@Test
	public void assignedu() throws InterruptedException {
		Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
      
        Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/patient-list-component/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/div[1]/a/img")).click();
    @SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/ul/li[5]/a"))).click();
    @SuppressWarnings("deprecation")
	WebDriverWait wait1 = new WebDriverWait(driver, 20);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[6]/div/div/div[1]/div[1]/div[2]/div[1]/div/a"))).click();
    Thread.sleep(9000);
 // Initialize instance
   // Actions action = new Actions(driver);

    // Find element to focus inside iframe
  //  WebElement we = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[6]/div/div/div[2]/div/div/div[2]/div[2]"));
    // Perform move action
  //  action.moveToElement(we).build().perform();
   
    
   Thread.sleep(6000);
 //WebElement on which drag and drop operation needs to be performed
    WebElement fromElement = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/div"));

    //WebElement to which the above object is dropped
    WebElement toElement = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]"));
  /* //Creating object of Actions class to build composite actions
    Actions builder = new Actions(driver);

    //Building a drag and drop action
     ((Actions) builder.clickAndHold(fromElement)
    // .pause(Duration.ofSeconds(2))
    .moveToElement(toElement)
   // .pause(Duration.ofSeconds(2))
    .release()
  //  .pause(Duration.ofSeconds(2))
    .build())
   // .pause(Duration.ofSeconds(2))
    draganddrop.perform();
     
     Action dragAndDrop = builder.clickAndHold(fromElement)
    		 .moveToElement(toElement)
    		 .release(toElement)
    		 .build();

    		 //Performing the drag and drop action
    		 dragAndDrop.perform();*/
     
     Actions action = new Actions(driver);
    action.dragAndDrop(fromElement, toElement).build().perform();

     
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[6]/div/div/div[2]/div/div/div[3]/div[2]/div[2]/button")).click();
    driver.findElement(By.xpath("//*[@id=\"prescribe-material-popup\"]/div/div/div[2]/div[2]/div/div/div[1]/input")).sendKeys("sdaj");
    driver.findElement(By.xpath("//*[@id=\"prescribe-material-popup\"]/div/div/div[3]/div[2]/div/button")).click();
	}

}
