package SeleniumPackages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utility.ReadProperty;

public class Locators_Pratices_19_March {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://omayo.blogspot.com/");// written below code for getting url 

		driver.get(ReadProperty.readProperty("url"));
		driver.manage().window().maximize();
		
		//By.name
		WebElement userNameTxtField =  driver.findElement(By.name("userid"));
		userNameTxtField.sendKeys("CodeMind.");        //Print values at user name Text box field
		
		WebElement PassTxtField =  driver.findElement(By.name("pswrd"));
		PassTxtField.sendKeys("Reset@1234");
		
		WebElement gender= driver.findElement(By.name("gender"));
		gender.click();
		
		WebElement Checkbox = driver.findElement(By.name("color"));  //same id=checkbox2 
		Checkbox.click();
		
		Thread.sleep(4000);
		
		//By id
		WebElement colorCheckBox = driver.findElement(By.id("checkbox2"));
		colorCheckBox.click();
		
	
		WebElement femaleRadioBtn = driver.findElement(By.id("radio2"));
		femaleRadioBtn.click();
		
		// 1) same executed by using xpath selector in Xpath_Practicle_21_March class.
		  //By.className 
		  WebElement title = driver.findElement(By.className("title"));
		  String titleText = title.getText();
		  System.out.println("\nText at  web Element : "+titleText);
		 
		
		
		 //By.linkText 
		  WebElement OpenPopUpLink = driver.findElement(By.linkText("Open a popup window"));
		  OpenPopUpLink.click();
		  
		Thread.sleep(4000);
		  
		  //WebElement PostAtomLink =driver.findElement(By.linkText("Posts (Atom)"));
		  //PostAtomLink.click();
		 
		  //By.partialLinlText theautomatedtester
          WebElement seleniumTutorial = driver.findElement(By.partialLinkText("umTutorial"));
		 seleniumTutorial.click();
		 
		 // Thread.sleep(5000);
		 
		 // theautomatedtester Partiallinktext  // if am going to execute this code then tagname not executed.
		 // WebElement PartialLinktxt = driver.findElement(By.partialLinkText("automatedtester"));
		  //PartialLinktxt.click();
		 
		
		//By.tagName
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("\n Number of links prasent on home page is = " + links.size());
		
		for(WebElement link :links)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		
		Thread.sleep(6000);
		
		List<WebElement> btn = driver.findElements(By.tagName("button"));
		Iterator<WebElement> it = btn.iterator();
		
		System.out.println("\n No.of the tags :");
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
		List<WebElement> elements = driver.findElements(By.id("Codemind"));
		System.out.println("\nWeb Element list size = "+ elements.size());
		
		System.out.println(".....................................................................................................................");
		System.out.println("Code Executed After exception");
		
	
		
		
	}

}
