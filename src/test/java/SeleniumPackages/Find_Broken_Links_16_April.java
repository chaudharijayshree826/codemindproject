package SeleniumPackages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.ReadProperty;

public class Find_Broken_Links_16_April {

WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//driver.get(ReadProperty.readProperty("url"));   //this one also valid 

		driver.get("https://www.google.com");
	}
	
	@Test
	public void verifyBrokenLinks() throws IOException
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    
		//ArrayList<String> linkasString = new ArrayList<String>();
		
		HashSet<String> linkasString = new HashSet<String>(); //for duplicate element we use set
		
		for(WebElement link:links)
		{
			linkasString.add(link.getAttribute("href"));	
		}
		
		for(String link : linkasString)
		{
			if(link!=null)
			{
			//System.out.println(link);
				{
					if(link.startsWith("https"));
					TestLink(link);
				}
		    }
		}
		
	}	
	
		public void TestLink(String ulr) throws IOException
		{
			
			URL url = new URL(ulr);
			HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
			
			httpURLConnection.setConnectTimeout(3000);
			
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode()==200)	
			{
				Assert.assertEquals(httpURLConnection.getResponseCode()== 200, false);
				System.out.println(url+" is working fine and status msg is "+httpURLConnection.getResponseMessage());
			}
			
			if(httpURLConnection.getResponseCode()!=200)	
			{
				System.out.println(url+" is NOT working fine and status msg is "+httpURLConnection.getResponseMessage());
			}
		}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
