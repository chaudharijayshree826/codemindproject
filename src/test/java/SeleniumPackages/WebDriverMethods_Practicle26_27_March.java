package SeleniumPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods_Practicle26_27_March {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		//Load a new web page in the current browser window. 
		driver.get("https://www.google.com");
	    //driver.get("https://omayo.blogspot.com");
		
		driver.manage().window().maximize();
		
		
		//driver.switchTo().newWindow(WindowType.TAB).get("https://www.flipkart.com");
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in");	
	   // driver.switchTo().newWindow(WindowType.TAB).get("https://www.meesho.com");
	   // driver.switchTo().newWindow(WindowType.TAB).get("https://omayo.blogspot.com");
		
		//Close the current focused window, quitting the browser if it's the last window currently open. 
		//driver.close();
		
	    /*    //please uncomment this code 
		//Find the first WebElement using the given method. 
		WebElement input = driver.findElement(By.xpath("//input[@id ='radio1']"));
		input.click();  //using click action that perticular web element get clicked .
		
		WebElement maleradiobut = driver.findElement(By.cssSelector("#radio1"));
		maleradiobut.click();
		
		//Find all elements within the current page using the given mechanism. 
		List<WebElement> elements =  driver.findElements(By.cssSelector("input[id*='radio']"));
		*/
		//Get a string representing the current URL that the browser is looking at. 
		 System.out.println("Current page url :  "+driver.getCurrentUrl());
		
		//Get the source of the last loaded page.
		 System.out.println("\n-------------------------------------------------------------------");
		System.out.println(driver.getPageSource());
		 
		 
		//Get the title of the current page.
		System.out.println("\n-------------------------------------------------------------------");
		System.out.println("Title of current page:  "+driver.getTitle());
		
		//Quits this driver, closing every associated window./ close instances of  browsers
		driver.quit();
	}

}
