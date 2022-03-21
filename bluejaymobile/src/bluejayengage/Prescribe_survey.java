package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Prescribe_survey extends Login{
	@Test
	public void setsurvey() throws InterruptedException {
		Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        // add new patient each time
    driver.findElement(By.xpath("//*[@id=\"patient-list\"]/tbody/tr/td[1]/div[1]/a/img")).click();
    @SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/ul/li[5]/a"))).click();	
    @SuppressWarnings("deprecation")
	WebDriverWait wait1 = new WebDriverWait(driver, 10);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tab_default_6\"]/div/div/div[1]/div[1]/div[1]/div[1]/div/a"))).click();
    Thread.sleep(2000);
    // Initialize instance
       Actions action = new Actions(driver);

       // Find element to focus inside iframe
       WebElement we = driver.findElement(By.xpath("//*[@id=\"prescribe-survey-popup\"]"));
       // Perform move action
       action.moveToElement(we).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"prescribe-survey-popup\"]/div/div/div[2]/div/div[2]/div/div[2]/button")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"prescribe-survey-popup\"]/div/div/div[2]/div/div/div/div[2]/input")).sendKeys("rayag");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"prescribe-survey-popup\"]/div/div/div[3]/div[2]/div/button")).click();
	}
}
