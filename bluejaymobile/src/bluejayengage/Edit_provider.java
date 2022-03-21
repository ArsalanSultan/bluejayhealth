package bluejayengage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Edit_provider extends Login{
	@Test
	public void editprov() throws InterruptedException {
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
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[8]/a[1]")).click();
        Thread.sleep(5000);
        WebElement firstname= driver.findElement(By.id("firstName"));
        firstname.clear();
        firstname.sendKeys("jones");
        WebElement lastName= driver.findElement(By.id("lastName"));
        lastName.clear();
        lastName.sendKeys("geralt");
        WebElement email= driver.findElement(By.id("email"));
        email.clear();
        // this also generate random numbers
	    Random randomGenerator = new Random();  
	    int randomInt = randomGenerator.nextInt(1000); 
	    email.sendKeys("usernamm"+randomInt+"@grr.la");
     
        WebElement dropDown = driver.findElement(By.id("userprofession"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Doctor");
        WebElement dropDow = driver.findElement(By.id("specialtyId"));
        Select select1 = new Select(dropDow);
        select1.selectByVisibleText("Oncology");
        Thread.sleep(4000);
       //driver.findElement(By.xpath("//*[@id=\"doctorAccount\"]/div[12]/div[2]/button[2]")).click();
	}

}
