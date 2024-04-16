package SeleniumPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_In_Selenium_2_April {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		
		driver.get("https://omayo.blogspot.com/");

		//driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Testing");
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
	
	    //Vertical scroll
	    javascriptExecutor.executeScript("window.scrollBy(0,700)", ""); //scroll in down word direction 
	
	    Thread.sleep(3000);
	    
	    javascriptExecutor.executeScript("window.scrollBy(0,-1700)", ""); //scroll in Upword direction.
	
         Thread.sleep(3000);
	    
         //Horizontal direction towards x-axis
	     //move to words right side.
         javascriptExecutor.executeScript("window.scrollBy(100,0)", ""); //scroll in right direction.
	
         Thread.sleep(3000);
	
         javascriptExecutor.executeScript("window.scrollBy(-50,0)", ""); //scroll in left direction.
     
         
         Thread.sleep(3000);
     	
         javascriptExecutor.executeScript("window.scrollBy(-50,-500)", ""); //scroll in right and left direction.
    
         Thread.sleep(3000);
	     //scroll till end of the page.
         javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
         
         //scroll into view
         WebElement elm = driver.findElement(By.xpath("//input[@value='Bike']"));
         javascriptExecutor.executeScript("arguments[0].scrollIntoView();",elm);
         
         Thread.sleep(3000);
         //click on web element 
         javascriptExecutor.executeScript("arguments[0].click();",elm);  //some how if web element click is not working then we can use this method.
         
         
	}

}
