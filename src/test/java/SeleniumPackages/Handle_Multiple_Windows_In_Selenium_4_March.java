package SeleniumPackages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Multiple_Windows_In_Selenium_4_March {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://omayo.blogspot.com/");

		
		driver.findElement(By.cssSelector("#selenium143")).click(); // this code shows exception

		// Return an opaque handle to this window that uniquely identifies it within
		// this driver instance.This can be used to switch to this window at a later
		// date
		String parentWindow = driver.getWindowHandle();

		// Return a set of window handles which can be used to iterate over all open
		// windows of thisWebDriver instance by passing them to
		// switchTo().Options.window()
		Set<String> windowsHandles = driver.getWindowHandles(); // Switch to child window

		for (String handle : windowsHandles) {
			if (!(handle.equals(parentWindow))) {
				driver.switchTo().window(handle);
			}
		}

		System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText()); // work on child																								// window/
		driver.close();  //close child window

		driver.switchTo().window(parentWindow);// switch to parent window

		driver.findElement(By.cssSelector("input#alert1")).click(); // work on parent window.
		
		driver.switchTo().alert().accept();
		
		parentWindow = driver.getWindowHandle();//re-initalise the variable"parentWindow".
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		windowsHandles = driver.getWindowHandles();
		
		for(String handle: windowsHandles)
		{
			if(handle.equals(parentWindow))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(handle);
				break;
			}
		}
		
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
