package SeleniumPackages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Practicle_21_March {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//xpath
		//Print text of  web element using xpath 
		WebElement title = driver.findElement(By.xpath("//h1[@class='title']"));
		String titleText = title.getText();
		System.out.println("\n Print text using xpath method : "+titleText);
				
		
		//Print table data using xpath
			List<WebElement> tableData =  driver.findElements(By.xpath("(//table[@id='table1']//tr//td)"));
			
			System.out.println("\n Print the tabel data using xpath : ");
			for(WebElement cell :tableData)
			{
				System.out.println(cell.getText());
			}
				
	}

}
