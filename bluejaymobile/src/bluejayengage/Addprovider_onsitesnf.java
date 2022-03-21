package bluejayengage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Addprovider_onsitesnf extends Login{
	@Test
	public void enterdataprovidr() throws InterruptedException {
		Thread.sleep(5000);
        driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click='openAddSnfProvider()']")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("firstName")).sendKeys("nan");
        driver.findElement(By.id("lastName")).sendKeys("mijs");
        Random randomGenerator = new Random();  
	     int randomInt = randomGenerator.nextInt(13000);
        driver.findElement(By.id("email")).sendKeys("provider"+randomInt+"@grr.la");
        Thread.sleep(2000);
        driver.findElement(By.id("onsitesnf")).click();
        driver.findElement(By.id("selectclinic_snf")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ul/li[1]/a")).click();
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
