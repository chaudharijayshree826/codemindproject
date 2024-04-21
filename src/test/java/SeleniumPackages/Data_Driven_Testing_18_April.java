package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadProperty;

public class Data_Driven_Testing_18_April {
WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("newtourhomepageurl"));
	}
	
	@Test(description="Verify valid login ", groups={"smoke"} ,dataProvider="users")
	public void verifyValidLogin(String userName, String password)
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("userName");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='Login Successfully']"))));
		
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText(),"Login Successfully","User not logged in sucessfully");
	}	
	
	@DataProvider(name="users")
	public Object[][] dataProvider()
	{
		Object usersData[][]= {{"admin","apassward"},{"user","upassward"},{"jc","jcpassword"}};
		return usersData;
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void teardown()
	{
		driver.quit();
	}
	
}
