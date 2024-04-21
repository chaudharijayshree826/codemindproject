package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadProperty;

public class HardAssertion_In_TestNG_16_April_ {

	WebDriver driver;
	
	@BeforeMethod()
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(ReadProperty.readProperty("url"));	
	}
	
	@Test
	public void verifyHomePage()
	{
		String url = driver.getCurrentUrl();
		String expectedUrl ="https://omayo.blogspot.co/";
		
		Assert.assertEquals(url, expectedUrl);
		
		System.out.println("After assertion faliure.");
		
		Assert.assertEquals(url, "https://google.com");
		
	    Assert.assertEquals(url, expectedUrl,"Url is not matched.");
	   
	  Assert.assertNotEquals(url, "https://google.com","URL is matched with google.com");
	    
	    WebElement orangeCheckBox  = driver.findElement(By.cssSelector("input#checkbox1"));
	    WebElement blueCheckBox  = driver.findElement(By.cssSelector("input#checkbox2"));

		Assert.assertTrue(orangeCheckBox.isSelected());		
		//OR
		Assert.assertTrue(orangeCheckBox.isSelected(), "Ornage Check box is NOT checked");
		
		
		Assert.assertFalse(blueCheckBox.isSelected());
		//OR
		Assert.assertFalse(blueCheckBox.isSelected(),"blue checkbox is checked");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}
