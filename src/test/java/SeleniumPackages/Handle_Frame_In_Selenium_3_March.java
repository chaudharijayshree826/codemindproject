package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadProperty;

public class Handle_Frame_In_Selenium_3_March {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		//driver.get("https://omayo.blogspot.com/");// written below code for getting url 

		driver.get(ReadProperty.readProperty("url"));
		// 1st way
		// driver.switchTo().frame(0); // 1st ways to switch frame using index no .s 0,
		// 1,2

		// 2nd way
		/// Select a frame by its name or ID. Frames located by matching name attributes
		// are always given precedence over those matched by ID.
		// driver.switchTo().frame("navbar-iframe"); // but this is not recommended way

		// 3rd way.
		// Select a frame using its previously located WebElement
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@id='b-query']")).sendKeys("Hello World!");

		// Switch back to main page from frame .for again doing work we have to switch
		// to frame again.

		Thread.sleep(3000);
		// Selects either the first frame on the page, or the main document when a page
		// contains iframes.
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='q'and @title='search']")).sendKeys("Testing Post handling Frame . ");

		Thread.sleep(2000);
		driver.quit();
	}

}
