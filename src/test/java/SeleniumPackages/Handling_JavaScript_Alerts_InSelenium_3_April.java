package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadProperty;

public class Handling_JavaScript_Alerts_InSelenium_3_April {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		//driver.get("https://omayo.blogspot.com/");// written below code for getting url 

		driver.get(ReadProperty.readProperty("url"));

		driver.findElement(By.xpath("//input[@id='confirm']")).click();

		// Handling java script alerts
		Thread.sleep(2000);
		//Switches to the currently active modal dialog for this particular driver instance
		Alert a = driver.switchTo().alert(); // Alert is an Interface
		// a.accept(); // positive way OK, YES, Accept ,Allow.

		// OR

		// Alert a =driver.switchTo().alert().accept();  // using this way to we can handle alert directly call the action Accept() method , no need to store refercence.

		// Verify Error Message from alert
		System.out.println("\n Print the Error message from alert . " + a.getText());  
																						
		a.dismiss(); // Negative Way of Cancel , Discard , NO ,Close way action performed .

		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Text Post display alerts.");

		Thread.sleep(2000);
		driver.quit();
	}

}
