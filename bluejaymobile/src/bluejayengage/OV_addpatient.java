package bluejayengage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OV_addpatient extends Login{
	@Test
	public void addpatov() throws InterruptedException {
		Thread.sleep(6000);
		driver.navigate().to("https://provider.bluejayhealth.com/#/mycalendar");
		Thread.sleep(9000);
		
		driver.switchTo().frame(0);

	    WebElement frame1Heading = driver.findElement(By.id("buttonForOfficeVisit"));

	    frame1Heading.click();
	    @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait (driver,30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("showNewAppointmentModal")));
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"showNewAppointmentModal\"]/div/div/div[2]/div/div/div/div[8]/div[2]/div[2]/span")).click();
	    Thread.sleep(5000);
	 // Initialize instance
	    Actions action1 = new Actions(driver);

	    // Find element to focus inside iframe
	    WebElement wee = driver.findElement(By.xpath("//*[@id=\"modalPopupWrapper\"]/div[5]/div/div/div[2]/div"));
	    // Perform move action
	   action1.moveToElement(wee).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.id("newPatientFirstName")).sendKeys("boyka");
	    driver.findElement(By.id("newPatientLastName")).sendKeys("unidis");
	 // initialize a Random object somewhere; you should only need one
	    Random random = new Random();

	    // generate a random integer from 0 to 899, then add 100
	    int x = random.nextInt(900) + 100;
	    int y = random.nextInt(900) + 100;
	    driver.findElement(By.id("newPatientPhoneNo")).sendKeys(x+"-"+y+"-3232");
	 // this also generate random numbers
	    Random randomGenerator = new Random();  
	    int randomInt = randomGenerator.nextInt(1000); 
	    driver.findElement(By.id("newPatientEmail")).sendKeys("patients"+randomInt+"@grr.la");
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
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div[2]/div[5]/div/div/div[2]/div/div/form/div[3]/span[1]")).click();
        Thread.sleep(3000);
	}

}
