package bluejayengage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Addpatientwithcaregiver extends Login {
	@Test // with a caregiver
	public void addpatwithcare() throws InterruptedException {
		 //click add new patient 
        @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add New Patient')]"))).click();
        Thread.sleep(5000);
        driver.findElement(By.name("checkbox1_lbl")).click();
        driver.findElement(By.name("fname")).sendKeys("jaam");
        driver.findElement(By.id("lname")).sendKeys("laazeez");
        WebElement genderdropDown = driver.findElement(By.id("gender"));
        Select select = new Select(genderdropDown);
        select.selectByVisibleText("Male");
        WebElement monthdrop = driver.findElement(By.xpath("//select[@ng-model='dob_month']"));
        Select select1 = new Select(monthdrop);
        select1.selectByVisibleText("April");
        driver.findElement(By.xpath("//*[@id=\"addpatientForm\"]/div[2]/div/div/div/div[3]/div[4]/div/div[2]/input")).sendKeys("21");
        driver.findElement(By.xpath("//*[@id=\"addpatientForm\"]/div[2]/div/div/div/div[3]/div[4]/div/div[3]/input")).sendKeys("2005");
        driver.findElement(By.id("weight_lbs")).sendKeys("122");
        driver.findElement(By.id("address")).sendKeys("lahore");
        driver.findElement(By.id("gfirstName")).sendKeys("maikael");
        driver.findElement(By.id("glastName")).sendKeys("braide");
        WebElement relationdropDown = driver.findElement(By.id("relationship"));
        Select select2 = new Select(relationdropDown);
        select2.selectByVisibleText("Son");
        driver.findElement(By.id("gemail")).sendKeys("sgaatyi@grr.la");
     // initialize a Random object somewhere; you should only need one
        Random random = new Random();

        // generate a random integer from 0 to 899, then add 100
        int x = random.nextInt(900) + 100;
        int y = random.nextInt(900) + 100;

        driver.findElement(By.name("gphone")).sendKeys(y+"-"+x+"-3218");
        driver.findElement(By.id("addpatientsubmit")).click();
	}

}
