package bluejayengage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Addpatmanangesnf extends Login {
@Test
public void addpatsnf() throws InterruptedException{
	Thread.sleep(5000);
    driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
    Thread.sleep(5000);
    driver.findElement(By.id("actvPatients")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@ng-click='addPatient()']")).click();
    Thread.sleep(2000);
 // Initialize instance
    Actions action = new Actions(driver);

    // Find element to focus inside iframe
    WebElement we = driver.findElement(By.id("add_patient"));
    // Perform move action
    action.moveToElement(we).build().perform();
    driver.findElement(By.id("newPatientFirstName")).sendKeys("maark");
    driver.findElement(By.id("newPatientLastName")).sendKeys("mension");
 // initialize a Random object somewhere; you should only need one
    Random random = new Random();

    // generate a random integer from 0 to 899, then add 100
    int x = random.nextInt(900) + 100;
    int y = random.nextInt(900) + 100;
    driver.findElement(By.id("newPatientPhoneNo")).sendKeys(x+"-"+y+"-1858");
    // this also generate random numbers
    Random randomGenerator = new Random();  
    int randomInt = randomGenerator.nextInt(1000); 
    driver.findElement(By.id("newPatientEmail")).sendKeys("patient"+randomInt+"@grr.la");
    WebElement countrydropDown = driver.findElement(By.id("newPatientCountry"));
    Select select = new Select(countrydropDown);
    select.selectByVisibleText("United States");
    WebElement statedropDown = driver.findElement(By.id("newPatientState"));
    Select select1 = new Select(statedropDown);
    select1.selectByVisibleText("Alaska");
    driver.findElement(By.id("newPatientZip")).sendKeys("765387");
    WebElement monthdropDown = driver.findElement(By.id("dob_month"));
    Select select2 = new Select(monthdropDown);
    select2.selectByVisibleText("March");
    driver.findElement(By.id("dob_day")).sendKeys("23");
    driver.findElement(By.id("dob_year")).sendKeys("1988");
    Thread.sleep(3000);
    driver.findElement(By.id("add_patient_save_button")).click();
}
}
