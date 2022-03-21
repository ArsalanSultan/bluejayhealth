package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Setnewgoal extends Login{
	@Test
	public void addgoal() throws InterruptedException {
		Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        // add new patient each time
    driver.findElement(By.xpath("//*[@id=\"patient-list\"]/tbody/tr/td[1]/div[1]/a/img")).click();
    @SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[1]/ul/li[3]/a"))).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"outcomeBlock\"]/div[1]/div[2]/a")).click();
    Thread.sleep(2000);
    // Initialize instance
       Actions action = new Actions(driver);

       // Find element to focus inside iframe
       WebElement we = driver.findElement(By.xpath("//*[@id=\"setAGoal\"]"));
       // Perform move action
       action.moveToElement(we).build().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"setGoalFrm\"]/div[2]/div/div/div[1]/div[2]/input")).sendKeys("sir play snooker with left hand");
       driver.findElement(By.xpath("//*[@id=\"setGoalFrm\"]/div[2]/div/div/div[2]/div[2]/div[1]/input")).sendKeys("3");
       WebElement unitdropDown = driver.findElement(By.xpath("//*[@id=\"setGoalFrm\"]/div[2]/div/div/div[2]/div[2]/div[2]/select"));
       Select select = new Select(unitdropDown);
       select.selectByVisibleText("hours");
       driver.findElement(By.xpath("//*[@id=\"setGoalFrm\"]/div[2]/div/div/div[3]/div[2]/div[1]/div[2]/input")).sendKeys("2");
       WebElement unit1dropDown = driver.findElement(By.xpath("//*[@id=\"setGoalFrm\"]/div[2]/div/div/div[3]/div[2]/div[2]/select"));
       Select select1 = new Select(unit1dropDown);
       select1.selectByVisibleText("hours");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"setGoalFrm\"]/div[3]/input[3]")).click();
	}
}
