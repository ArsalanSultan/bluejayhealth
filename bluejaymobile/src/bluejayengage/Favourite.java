package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Favourite extends Login {
	@Test
	public void addvideo() throws InterruptedException {
		driver.navigate().to("https://provider.bluejayhealth.com/#/favourite");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div/div/a/img")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"create-new-fav-name-dialog\"]/div/div/div[2]/form/div/div/input")).sendKeys("autom");
		driver.findElement(By.xpath("//*[@id=\"create-new-fav-name-dialog\"]/div/div/div[3]/input")).click();
		// Initialize instance
	    Actions action = new Actions(driver);

	    // Find element to focus inside iframe
	    WebElement we = driver.findElement(By.xpath("//*[@id=\"lungflute\"]"));
	    // Perform move action
	    action.moveToElement(we).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/a")).click();
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/ul/li[3]/a"))).click();
        Thread.sleep(4000);
     // Initialize instance
	    Actions action1 = new Actions(driver);

	    // Find element to focus inside iframe
	    WebElement wee = driver.findElement(By.xpath("//*[@id=\"advanced-filter\"]"));
	    // Perform move action
	    action1.moveToElement(wee).build().perform();
	    Thread.sleep(5000);
	    WebElement specialitydropDown = driver.findElement(By.id("specialitySelectedCatIDVal"));
        Select select = new Select(specialitydropDown);
        select.selectByVisibleText("Pregnancy");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"step1\"]/fieldset/div/div/div/div/div[8]/label/input")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("chk_8282")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"modalFooterBtnSection\"]/span/a[3]")).click();
	}

}
