package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddandAssignSnf extends Login{
	@Test
	public void addsnf() throws InterruptedException {
		Thread.sleep(5000);
        driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"actvSNF\"]")).click();
        Thread.sleep(2000);
               driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[1]/div[5]/button")).click();
     // Initialize instance
       // Actions action = new Actions(driver);

        // Find element to focus inside iframe
       // WebElement we = driver.findElement(By.xpath("//*[@id=\"addEditSnf\"]/div/div/div"));
        // Perform move action
       // action.moveToElement(we).build().perform();
        Thread.sleep(3000);
        // Add snf details
		
		  driver.findElement(By.id("snfName")).sendKeys("adwer");
		  driver.findElement(By.id("regionAddress")).sendKeys("kmk");
		  driver.findElement(By.xpath(
		  "//*[@id=\"addEditSnf\"]/div/div/div/div/div[4]/div/button")).click();
		 

	}
@Test
public void assignsnf() throws InterruptedException {
	Thread.sleep(5000);
    driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
    Thread.sleep(5000);
	
	  driver.findElement(By.xpath(
	  "//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[8]/a[2]"
	  )).click(); Thread.sleep(6000); driver.findElement(By.xpath(
	  "//*[@id=\"assignSNFModal\"]/div/div/div[2]/div[6]/label/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"assign_snf_save_button\"]")).click();
	 

}
}
