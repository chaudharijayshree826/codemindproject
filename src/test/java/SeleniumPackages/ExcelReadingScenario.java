package SeleniumPackages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.CommonUtils;
import utility.ReadExcel;
import utility.ReadProperty;

public class ExcelReadingScenario {

	public static void main(String args[]) throws NullPointerException, InvalidFormatException, IOException
	{
		//ReadExcel.readExcel();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		//driver.get("https://omayo.blogspot.com/");// written below code for getting url 
		
		driver.get(ReadProperty.readProperty("newtour"));
	
		List<String> userData = ReadExcel.readExcel("src/test/resources/registrationdetail.xlsx","registrationdata");
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys(userData.get(0));
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys(userData.get(1));
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys(userData.get(2));
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(userData.get(3));
		
		WebElement countryDropdown = driver.findElement(By.cssSelector("select[name='country']"));
		//CommonUtils.selectValuefromDropDopwn(countryDropdown,"INDIA");
		
		CommonUtils.selectValuefromDropDopwn(countryDropdown,ReadProperty.readProperty("country"));
	}
}
