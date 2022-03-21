package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Bulkuploaddashboard extends Login{
	@Test
	public void bulkupload() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/h1/span/div[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"add_account_via_csv\"]/div/form/div/div[4]/div/div/button")).click();
		WebElement bulkupload= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[5]/div/form/div/div[2]/div/div/div/input"));
		bulkupload.sendKeys("C:\\bulk/patient_temp.csv");
		Thread.sleep(5000);
		driver.findElement(By.id("bulk_upload_save_button")).click();
	}

}
