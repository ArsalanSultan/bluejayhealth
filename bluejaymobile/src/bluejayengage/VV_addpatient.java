package bluejayengage;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VV_addpatient extends Login{
	@SuppressWarnings("deprecation")
	@Test
	public void vvaddpat() throws InterruptedException {
	Thread.sleep(7000);
	driver.navigate().to("https://provider.bluejayhealth.com/#/mycalendar");
	
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	Thread.sleep(9000);
	driver.switchTo().frame(0);

    WebElement frame1Heading = driver.findElement(By.id("buttonForVideoConference"));

    frame1Heading.click();
    WebDriverWait wait = new WebDriverWait (driver,30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showNewAppointmentModal")));
 
 		
    Thread.sleep(7000);
    // snf
  driver.findElement(By.xpath("//*[@id=\"ui-select-facility\"]/div[1]/span")).click();
  WebDriverWait wait1 = new WebDriverWait(driver, 30);
  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-select-choices-row-2-0\"]/span"))).click();
    
    //facilitator
     driver.findElement(By.xpath("//*[@id=\"ui-select-facilitymanager\"]/div[1]/span")).click();
     WebDriverWait wait11 = new WebDriverWait(driver, 30);
     wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-select-choices-row-3-0\"]/span"))).click();
        //add new patient from vv 
      
       Thread.sleep(7000);
       driver.findElement(By.xpath("//*[@id=\"showNewAppointmentModal\"]/div/div/div[2]/div/div/div/div[9]/div[2]/div[2]/span")).click();
		/*
		 *  driver.switchTo().frame(0);
		 * 
		 *  WebElement frame2Heading = driver.findElement(By.xpath(
		 * "/html/body/div[1]/section/div/div/div/div[2]/div[5]/div/div/div[2]/div"));
		 * 
		 *  frame2Heading.click(); // Initialize instance // Actions action1 = new
		 * Actions(driver);
		 * 
		 *  Find element to focus inside iframe // WebElement wee =
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/section/div/div/div/div[2]/div[5]/div/div/div[2]/div"));
		 *  Perform move action // action1.moveToElement(wee).build().perform();
		 */	
       
       Thread.sleep(7000);
	    driver.findElement(By.id("newPatientFirstName")).sendKeys("bioka");
	    driver.findElement(By.id("newPatientLastName")).sendKeys("borska");
	 // initialize a Random object somewhere; you should only need one
	    Random random = new Random();

	    // generate a random integer from 0 to 899, then add 100
	    int x = random.nextInt(900) + 100;
	    int y = random.nextInt(900) + 100;
	    driver.findElement(By.id("newPatientPhoneNo")).sendKeys(x+"-"+y+"-3432");
	 // this also generate random numbers
	    Random randomGenerator = new Random();  
	    int randomInt = randomGenerator.nextInt(1000); 
	    driver.findElement(By.id("newPatientEmail")).sendKeys("patientt"+randomInt+"@grr.la");
	    WebElement countrydropDown = driver.findElement(By.id("newPatientCountry"));
        Select select5 = new Select(countrydropDown);
        select5.selectByVisibleText("United States");
        WebElement statedropDown = driver.findElement(By.id("newPatientState"));
        Select select6 = new Select(statedropDown);
        select6.selectByVisibleText("Alaska");
	    driver.findElement(By.id("newPatientZip")).sendKeys("83432");
	    WebElement monthdropDown = driver.findElement(By.xpath("//*[@id=\"frmAddNewPatient\"]/div[2]/div[8]/div/div[1]/select"));
        Select select7 = new Select(monthdropDown);
        select7.selectByVisibleText("April");
        driver.findElement(By.xpath("//*[@id=\"frmAddNewPatient\"]/div[2]/div[8]/div/div[2]/input")).sendKeys("21");
        driver.findElement(By.xpath("//*[@id=\"frmAddNewPatient\"]/div[2]/div[8]/div/div[3]/input")).sendKeys("1994");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div[5]/div/div/div[2]/div/div/form/div[3]/span[1]")).click();
        
        Thread.sleep(7000);

        driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button")).click();
        Thread.sleep(4000);
       // driver.switchTo().frame(0);

     //   WebElement frame3Heading = driver.findElement(By.id("buttonForVideoConference"));

      //  frame3Heading.click();
        
//        WebElement startdropDown = driver.findElement(By.id("startTime"));
//        Select select3 = new Select(startdropDown);
//        select3.selectByVisibleText("09:00 PM");
        
        
      //Get the list of dropdown options
        List<WebElement> itemsInDropdown = driver.findElements(By.id("startTime"));

        // Get the size of dropdown list
        int size = itemsInDropdown.size();

        // Generate the random number
        int randomNumber = ThreadLocalRandom.current().nextInt(0, size);

        // Clicking on random value
        itemsInDropdown.get(randomNumber).click();  
        
        
        WebElement durationdropDown = driver.findElement(By.id("interval_min"));
        Select select4 = new Select(durationdropDown);
        select4.selectByVisibleText("10 Mins");	
        Thread.sleep(3000);
        driver.findElement(By.id("savingAppointmentBtn")).click();
	}

}
