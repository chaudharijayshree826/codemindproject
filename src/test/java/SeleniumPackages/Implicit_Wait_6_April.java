package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Wait_6_April {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//how to use implicit wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));   // is called global wait applicable throgh the application.    // this is dyancamic wait 
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://omayo.blogspot.com/");
	   
	   driver.get("https://www.flipkart.com");
	   
	   driver.findElement(By.xpath("//a[href='fdffd']"));
	
	
	
	}

}
