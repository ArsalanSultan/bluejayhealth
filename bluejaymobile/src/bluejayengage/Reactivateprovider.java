package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Reactivateprovider extends Login {
	@Test
	public void reacpro() throws InterruptedException {
		Thread.sleep(5000);
	    driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[1]/div[6]/label/span")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[8]/a")).click();
	    Thread.sleep(3000);
	 // Initialize instance
//	    Actions action = new Actions(driver);

	    // Find element to focus inside iframe
	//  WebElement we = driver.findElement(By.xpath("/html/body/div[13]/div[3]"));
	    // Perform move action
	  //  action.moveToElement(we).build().perform();
	    Thread.sleep(5000);
//	   driver.switchTo().alert().accept();
	    @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[13]/div[3]/div/button[1]"))).click();
        Thread.sleep(5000);
	}

}
