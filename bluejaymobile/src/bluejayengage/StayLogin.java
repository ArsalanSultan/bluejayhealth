package bluejayengage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class StayLogin {
	public WebDriver driver;
	@BeforeClass
	public void es() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)/chromedriver.exe");
		  ChromeOptions option=new ChromeOptions();
		  option.setExperimentalOption("debuggerAddress","localhost:9232");
		
	        driver = new ChromeDriver(option);
	}
}
