package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File_In_Selenium_4_March {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://omayo.blogspot.com/");
		
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='uploadfile']"));
		
		 WebElement elm = driver.findElement(By.xpath("//input[@id='uploadfile']"));
		 JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		 javascriptExecutor.executeScript("arguments[0].scrollIntoView();",fileupload);
		
		fileupload.sendKeys("C:/Users/PLAPY-10/Desktop/ATLAS -ARORA Testing/Attachments  Folder/06_TXT.txt");
		

	}

}
