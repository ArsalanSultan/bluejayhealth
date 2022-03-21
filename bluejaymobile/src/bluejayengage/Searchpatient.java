package bluejayengage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Searchpatient extends Login{
	@Test
	public void searchpat() throws InterruptedException {
		Thread.sleep(5000);
	    driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
	    Thread.sleep(5000);
	    driver.findElement(By.id("actvPatients")).click();
	    Thread.sleep(3000);
	    //WebElement snfdropDown = driver.findElement(By.xpath("//*[@id=\"ui-select-snf\"]/div[1]/span/span[2]"));
        //Select select = new Select(snfdropDown);
        //select.selectByVisibleText("SNF A1");
        driver.findElement(By.xpath("//*[@id=\"ui-select-snf\"]/div[1]/span/span[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div[4]/div/ul/li/div[4]/span/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[1]/div[5]/div/input")).sendKeys("narm shaw");
        Thread.sleep(5000);
	}

}
