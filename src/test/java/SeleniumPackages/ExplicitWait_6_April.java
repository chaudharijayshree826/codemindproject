package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_6_April {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//how to use Explicit wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));      // this is dyancamic wait 
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://omayo.blogspot.com/");
   
	   
	    String str = driver.findElement(By.cssSelector("div#delayedText")).getAttribute("innerHTML");
	    System.out.println(str);
	    
	    driver.close();

	}

}
