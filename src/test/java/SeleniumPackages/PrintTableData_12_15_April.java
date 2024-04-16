package SeleniumPackages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadProperty;

public class PrintTableData_12_15_April {
																																													// public static void main(String[] args) { //Remove main method because we have
	// TestNG instead of main() method write the test case name.

	WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get(ReadProperty.readProperty("url"));

	}
	
	@Test(enabled = true, priority=2)      //@Test(enabled =false and pass wrong data at List String //priority=-4
	public void  verifyTableData() //d()   // now this is not the simple method its method of a TestGN
	{
		
		List<String> expectedStudentsData = Arrays.asList("Kishore", "22", "Delhi", "Manish", "25", "Pune", "Praveen",
				"29", "Bangalore", "Dheepthi", "31", "Mumbai"); 																														// expected data  we can read data from DB and call it here if we want more data to test.

		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody//tr//td"));
		List<String> actualStudentData = new LinkedList<>(); 																																		// data coming from site at run time

		for (WebElement tdata : tableData) {
	        // System.out.print("\t"+tdata.getText());
			actualStudentData.add(tdata.getText());
		}

		Assert.assertEquals(actualStudentData, expectedStudentsData); 																													//cross check here is the actual and expected data are same.
		
	}
	
	@Test(priority=3)//priority=2
	public void verifyUrl()  //z()
	{
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://omayo.blogspot.com/");
	}
	
	@Test(priority=1) //priority=3
	public void verifyTitle()//c()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "omayo (QAFox.com)");
	}
	
	
	//browser session close called teardown

	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
