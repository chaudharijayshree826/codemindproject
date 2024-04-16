package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_POP_UP_In_Selenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://atlas-test-mobile.aroratechnologygroup.com/#/login");
		
		driver.findElement(By.xpath("//input[@class='native-input sc-ion-input-md']")).sendKeys("STPP");
		
		driver.findElement(By.xpath("//ion-row[@class='md hydrated']")).click();
		
		//driver.findElement(By.xpath("//span[@class='alert-button-inner sc-ion-alert-md']")).click();
		
		//driver.findElement(By.xpath("//button[@class='alert-button ion-focusable ion-activatable sc-ion-alert-md']")).click();
		
		////button//span[@class='alert-button-inner sc-ion-alert-md']
		
		driver.findElement(By.xpath("//button//span[@class='alert-button-inner sc-ion-alert-md']")).click();
	}

}
