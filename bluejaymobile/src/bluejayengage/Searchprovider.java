package bluejayengage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Searchprovider extends Login{
@Test
public void searchpro() throws InterruptedException {
	Thread.sleep(5000);
    driver.navigate().to("https://provider.bluejayhealth.com/#/managesnfprovider");
    Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div/div[2]/div[1]/div[5]/div/input")).sendKeys("dan jams");
	Thread.sleep(3000);
}
}
