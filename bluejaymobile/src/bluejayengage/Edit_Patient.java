package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Edit_Patient extends Login{
	@Test
	public void editpat() throws InterruptedException {
		Thread.sleep(5000);
	    driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
	    Thread.sleep(5000);
	    driver.findElement(By.id("actvPatients")).click();
	    Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ui-select-snf\"]/div[1]/span/span[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div[4]/div/ul/li/div[4]/span/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[5]/img")).click();
	    Thread.sleep(3000);
	    WebElement firstname= driver.findElement(By.id("newPatientFirstName"));
        firstname.clear();
        firstname.sendKeys("joe");
        WebElement lastName= driver.findElement(By.id("newPatientLastName"));
        lastName.clear();
        lastName.sendKeys("ernie");
        WebElement email= driver.findElement(By.id("newPatientEmail"));
        email.clear();
        email.sendKeys("jiron@grr.la");
        WebElement countrydropDown = driver.findElement(By.id("newPatientCountry"));
        Select select = new Select(countrydropDown);
        select.selectByVisibleText("United States");
        WebElement statedropDown = driver.findElement(By.id("newPatientState"));
        Select select1 = new Select(statedropDown);
        select1.selectByVisibleText("Arizona");
        WebElement zip= driver.findElement(By.id("newPatientZip"));
        zip.clear();
        zip.sendKeys("765387");
        WebElement monthdropDown = driver.findElement(By.id("dob_month"));
        Select select2 = new Select(monthdropDown);
        select2.selectByVisibleText("April");
        WebElement dob_day= driver.findElement(By.id("dob_day"));
        dob_day.clear();
        dob_day.sendKeys("26");
        WebElement year= driver.findElement(By.id("dob_year"));
        year.clear();
        year.sendKeys("1998");
        Thread.sleep(3000);
      driver.findElement(By.id("add_patient_save_button")).click();
	}

}
