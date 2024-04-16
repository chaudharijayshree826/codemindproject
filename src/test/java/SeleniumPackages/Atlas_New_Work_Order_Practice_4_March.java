package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Atlas_New_Work_Order_Practice_4_March {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://atlas-test-mobile.aroratechnologygroup.com/#/login");
		
        driver.findElement(By.xpath("//input[@class='native-input sc-ion-input-md']")).sendKeys("STP");
		
		driver.findElement(By.xpath("//ion-row[@class='md hydrated']")).click();
		
		//ion-selopt-40
  
		

	}

}
