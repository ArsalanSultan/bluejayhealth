package bluejayengage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Addpatientwithoutcaregiver extends Login {
	@Test // without a caregiver
	public void patientwithoutcare() throws InterruptedException {
		      //click add new patient 
		        @SuppressWarnings("deprecation")
				WebDriverWait wait = new WebDriverWait(driver, 60);
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add New Patient')]"))).click();
		        Thread.sleep(5000);
		        driver.findElement(By.name("checkbox2_lbl")).click();
		        driver.findElement(By.name("checkbox4_lbl")).click();
		        driver.findElement(By.name("fname")).sendKeys("kneau");
		        driver.findElement(By.id("lname")).sendKeys("nicolls");
		        WebElement genderdropDown = driver.findElement(By.id("gender"));
		        Select select = new Select(genderdropDown);
		        select.selectByVisibleText("Male");
		        WebElement monthdrop = driver.findElement(By.xpath("//select[@ng-model='dob_month']"));
		        Select select1 = new Select(monthdrop);
		        select1.selectByVisibleText("March");
		        driver.findElement(By.xpath("//*[@id=\"addpatientForm\"]/div[2]/div/div/div/div[3]/div[4]/div/div[2]/input")).sendKeys("21");
		        driver.findElement(By.xpath("//*[@id=\"addpatientForm\"]/div[2]/div/div/div/div[3]/div[4]/div/div[3]/input")).sendKeys("1988");
		        driver.findElement(By.id("email")).sendKeys("argtgd@grr.la");
		     // initialize a Random object somewhere; you should only need one
		        Random random = new Random();

		        // generate a random integer from 0 to 899, then add 100
		        int x = random.nextInt(900) + 100;
		        int y = random.nextInt(900) + 100;
		        driver.findElement(By.id("phone")).sendKeys(x+"-"+y+"-5049");
		       driver.findElement(By.id("addpatientsubmit")).click();
	}
	
}
