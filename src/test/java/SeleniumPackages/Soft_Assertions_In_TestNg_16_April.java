package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.ReadProperty;

public class Soft_Assertions_In_TestNg_16_April {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get(ReadProperty.readProperty("url"));
	}

	@Test
	public void verifyHomePageUrl() {

		SoftAssert softassert = new SoftAssert();
		String url = driver.getCurrentUrl();

		String expectedUrl = "https://omayo.blogspot.co/";

		softassert.assertEquals(url, expectedUrl);

		System.out.println("After assertion failure");

		
		softassert.assertNotEquals(url, "https://google.com");
		
		//same method with Message as argument.
		softassert.assertEquals(url, expectedUrl, "Url is not matched");

		softassert.assertNotEquals(url, "https://google.com", "URL is matched with google.com");

		WebElement orangeCheckBox = driver.findElement(By.cssSelector("input#checkbox1"));  
		// by default orange is checked .
		WebElement blueCheckBox = driver.findElement(By.cssSelector("input#checkbox2"));

		softassert.assertTrue(orangeCheckBox.isSelected());

		softassert.assertFalse(blueCheckBox.isSelected());

		//same method with Message as argument.
		softassert.assertTrue(orangeCheckBox.isSelected(), "Orange checkbox is not cheked");

		softassert.assertFalse(blueCheckBox.isSelected(), "Blue checkbox is checked");

		softassert.assertAll();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
