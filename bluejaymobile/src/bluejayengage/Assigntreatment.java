package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assigntreatment extends Login{
	@Test
	public void assigntreat() throws InterruptedException {
		 Thread.sleep(4000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
	        // add new patient each time
	        Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/patient-list-component/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/div[1]/a/img")).click();
	    @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"currentTreatmentVids\"]/div/div[2]"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"addNewTreatmentName\"]")).sendKeys("khamaj");
      driver.findElement(By.xpath("//*[@id=\"newTreatmentModal\"]/div/div/div[3]/button")).click();	
      driver.findElement(By.xpath("//*[@id=\"patient-dash-header1\"]/tbody/tr/td[2]/table/tbody/tr[2]/td/div[1]/a")).click();
      @SuppressWarnings("deprecation")
		WebDriverWait waiet = new WebDriverWait(driver, 10);
      waiet.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"patient-dash-header1\"]/tbody/tr/td[2]/table/tbody/tr[2]/td/div[1]/ul/li[2]/a"))).click();
      Thread.sleep(7000);
      // Initialize instance
         Actions action = new Actions(driver);

         // Find element to focus inside iframe
         WebElement we = driver.findElement(By.xpath("//*[@id=\"advanced-filter\"]"));
         // Perform move action
         action.moveToElement(we).build().perform();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"modalHeaderRightPanel\"]/label[2]")).click();
       Thread.sleep(5000);
       @SuppressWarnings("deprecation")
		WebDriverWait waiit = new WebDriverWait(driver, 10);
     waiit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"chk_10546\"]"))).click();
     
      driver.findElement(By.xpath("//*[@id=\"modalFooterBtnSection\"]/span/a[2]")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/a[2]")).click();
      Thread.sleep(5000);
      // Initialize instance
         Actions action1 = new Actions(driver);

         // Find element to focus inside iframe
         WebElement wee = driver.findElement(By.xpath("//*[@id=\"inner-schedule\"]"));
         // Perform move action
         action1.moveToElement(wee).build().perform();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"inner-schedule\"]/div/div/div[2]/form/div/div[5]/div[2]/table/tbody/tr[3]/td/input")).sendKeys("1");
         driver.findElement(By.xpath("//*[@id=\"inner-schedule\"]/div/div/div[3]/button")).click();
         
	}

}
