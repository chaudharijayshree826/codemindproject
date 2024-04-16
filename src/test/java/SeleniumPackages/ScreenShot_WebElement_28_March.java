package SeleniumPackages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_WebElement_28_March {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.meesho.com");
		
		driver.manage().window().maximize();
		
		
		WebElement photo = driver.findElement(By.xpath("//img[@alt='womenWear']"));
		
		File f = photo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,new File("src/test/resources/photo/"+"catlogimg.png"));
       
		
		driver.quit();

	}

}
