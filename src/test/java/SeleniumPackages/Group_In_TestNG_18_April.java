package SeleniumPackages;

import utility.ReadProperty;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadProperty;

public class Group_In_TestNG_18_April {

	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get(ReadProperty.readProperty("newtourhomepageurl"));
	}
	
	@Test(description="Verify valid login ", groups={"smoke"})
	public void verifyValidLogin()
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("administrator");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='Login Successfully']"))));
		
		Assert.assertEquals(driver.findElement(By.xpath("//h3[text()='Login Successfully']")).getText(),"Login Successfully","User not logged in sucessfully");
	}	
	
	
	@Test(description="Verify Invalid login ", groups={"sanity"})
	public void verifyInValidLogin()
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("@#$#$");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@@#$#$");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		int size = driver.findElements(By.xpath("//h3[text()='Login Successfully']")).size();
	    Assert.assertEquals(size, 0,"User logged in  sucessfully");
	}	
	
	
	@Test(description="Verify Home page url ", groups={"regression","sanity"})
	public void verifyHomePageUrl()
	{
		Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.guru99.com/test/newtours/index.php"),"Home page url is incorrect");
	}	
	
	//after writing above three methods go to textng.xml file and add there group for text case execution.
	
	@AfterMethod(alwaysRun=true)
	public void teardown()
	{
		driver.quit();
	}
	
}
