package SeleniumPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleDropDownNotComingUnderSelectTab_1_April {

	static WebDriver driver = new ChromeDriver(); // take this at class level
	public static void main(String[] args) throws InterruptedException { 
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.get("https://www.airvistara.com/");
		
		//driver.findElement(By.xpath("//img[contains(@src,'arrow-purple')]")).click();                                                                             //3 here we find the web element and and directly click on it .	
		
		HowToHandleDropDownNotComingUnderSelectTab_1_April.SelectCountry("singapore");                                                                                       //4 calling the static method using class name with static method and pass input for selection.
		HowToHandleDropDownNotComingUnderSelectTab_1_April.SelectCountry("qatar");
		HowToHandleDropDownNotComingUnderSelectTab_1_April.SelectCountry("uk");
	}

	public static void SelectCountry(String CountryName) throws InterruptedException 
	{
		driver.findElement(By.xpath("//img[contains(@src,'arrow-purple')]")).click();                                                                                  //3 here we find the web element and and directly click on it .	
       
		 Thread.sleep(2000);
		/*  //1st way to find and call web element .
		 * WebElement country=
		 * driver.findElement(By.xpath("//ul[@id='country-scroll']//li//span[text()='"+
		 * CountryName +"']")); //1 Parameterized x-path //in above code we are taking
		 * value from user stored in CountyName variable and pass it to the Method
		 * 
		 * country.click(); //2
		 */     
		
		
		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='country-scroll']//li//span"));
		
		for(WebElement country:countries)
		{  
			if(country.getText().equalsIgnoreCase(CountryName))
			{
				country.click();
				 break;
			}
		}
   
	}
}
