package SeleniumPackages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadProperty;

public class Take_Screenshot_InSelenium_17_April {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get(ReadProperty.readProperty("url"));
	}
	@Test
	public void ScreenShot() throws IOException
	{
		//take screen code is written in CommonUtils class 
		utility.CommonUtils.takesScreenshot(driver,"ScreenShot");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
