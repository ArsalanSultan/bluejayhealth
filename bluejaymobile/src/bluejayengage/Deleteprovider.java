package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Deleteprovider extends Login {
	@Test
	public void delpro() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
	    Thread.sleep(2000);
	 // Initialize instance
	    Actions action = new Actions(driver);

	    // Find element to focus inside iframe
	    WebElement we = driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[2]"));
	    // Perform move action
	   action.moveToElement(we).build().perform();
	   Thread.sleep(5000);
	    // xpath of provider you want to delete
		
		  driver.findElement(By.xpath(
		  "/html/body/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[8]/a[1]"
		  )).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(
		  "/html/body/div[3]/div/div[4]/div/div[3]/div[1]/div/div/div/div/div/form/div[12]/div[2]/button[1]"
		  )).click();
		  Thread.sleep(3000); 
		  // driver.switchTo().alert();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/div[15]/div[3]/div/button[1]/span")).
		  click();
		 
	}

}
