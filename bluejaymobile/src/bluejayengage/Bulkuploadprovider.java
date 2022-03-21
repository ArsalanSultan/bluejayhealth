package bluejayengage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Bulkuploadprovider extends Login{
	@Test
	public void bulkpro() throws InterruptedException {
		Thread.sleep(5000);
	    driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[1]/div[5]/button[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"add_account_via_csv\"]/div/form/div/div[4]/div/div/a")).click();
	    Thread.sleep(3000);
	    WebElement bulkupload= driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div[5]/div/form/div/div[2]/div/div/div/input"));
		bulkupload.sendKeys("C:\\bulk/therapist_temp.csv");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"bulk_upload_save_button\"]")).click();

	}

}
