package SeleniumPackages;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Webdriver_Methods_2_27_March {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=  new ChromeDriver();
		driver.get("https://google.com");
		driver.get("https://omayo.blogspot.com");
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		System.out.println("\n-------------------------------------------------------------------");
		System.out.println("Title of current page:  "+driver.getTitle());
	    
		//Return an opaque handle to this window that uniquely identifies it within this driver instance.This can be used to switch to this window at a later date
		//and generate random Unique string to identify the window.  
		
		String windowHandle = driver.getWindowHandle();
        System.out.println("\n Current Window AlphaNumeric Random String ."+windowHandle);
		
        
        Set<String> windowshandles = driver.getWindowHandles();    
        System.out.println("\n Current  Multiple  Windows AlphaNumeric Random String .");
        
        for(String handles:windowshandles)
        {
        	System.out.println(handles);
            
        }
        
        Thread.sleep(2000);
        //Full screen the current window if it is not already full screen 
        driver.manage().window().fullscreen();
        
        Thread.sleep(3000);
        //Minimizes the current window if it is not already minimized 
        driver.manage().window().minimize();
        
        Thread.sleep(3000);
        
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        //Gets the amount of time to wait for a page load to complete before throwing an error.
        //If the timeout is negative, not null, or greater than 2e16 - 1, an error code with invalid argument will be returned
        //driver.manage().timeouts().getPageLoadTimeout(); // this used at framework level.
        
        //Obtains a Duration representing a number of seconds
        //we use this at framework level at ones .
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
      
        //An abstraction allowing the driver to access the browser's history and to navigate to a givenURL.
        driver.navigate().to("https://www.W3schools.com");
        driver.navigate().back();  
        Thread.sleep(3000);
        driver.navigate().forward();  
        Thread.sleep(3000);
        driver.navigate().refresh();
        
       // Thread.sleep(3000);
        //driver.switchTo();
        
		//Quits this driver, closing every associated window./ close instances of  browsers
		driver.quit();
	}

}
