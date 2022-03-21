package bluejayengage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
public class Addprovider_withoutadminsnf extends Login {
	@Test
	public void enterproviderdata() throws InterruptedException {
		 Thread.sleep(5000);
	        driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[@ng-click='openAddSnfProvider()']")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.id("firstName")).sendKeys("nan");
	        driver.findElement(By.id("lastName")).sendKeys("mijs");
	        Random randomGenerator = new Random();  
		     int randomInt = randomGenerator.nextInt(1000);
	        driver.findElement(By.id("email")).sendKeys("provider"+randomInt+"@grr.la");
	        WebElement dropDown = driver.findElement(By.id("userprofession"));
	        Select select = new Select(dropDown);
	        select.selectByVisibleText("Director Of Rehab");
	        WebElement dropDow = driver.findElement(By.id("specialtyId"));
	        Select select1 = new Select(dropDow);
	        select1.selectByVisibleText("General");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//button[@ng-click='addToDoctorTempListAndSubmit(true);']")).click();
	}
}

