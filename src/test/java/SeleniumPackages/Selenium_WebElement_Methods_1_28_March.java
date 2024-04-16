package SeleniumPackages;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_WebElement_Methods_1_28_March {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		// driver.manage().timeouts().pageLoadTimeout(Duration.ofNanos(1L));//throw
		// "TimeoutExcpetion "

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10L));

		// driver.get("https://www.w3schools.com");
		driver.get("https://omayo.blogspot.com");
		// Thread.sleep(2000);
		// driver.switchTo().newWindow(WindowType.TAB).get("https://www.meesho.com");
		// driver.get("https://www.meesho.com");

		driver.manage().window().maximize();

		// search web element using img.

		WebElement usertextbox = driver.findElement(By.xpath("//input[@name='userid']"));

		Thread.sleep(2000);
		// Use this method to simulate typing into an element, which may set its value.
		usertextbox.sendKeys("CodeMind");

		// Thread.sleep(2000);

		WebElement passwordText = driver.findElement(By.xpath("//input[@type='password' and @name='pswrd']"));
		passwordText.sendKeys("Reset@1234");

		/*
		 * WebElement LoginButton =
		 * driver.findElement(By.xpath("//input[@value='Login']")); LoginButton.click();
		 */

		Thread.sleep(2000);
		// If this element is a form entry element, this will reset its value.
		usertextbox.clear();
		passwordText.clear();

		// Gets result of a Accessible Name and Description Computation for the
		// Accessible Name of theelement.
		System.out.println(usertextbox.getAccessibleName());

		// Gets result of computing the WAI-ARIA role of element.
		System.out.println(usertextbox.getAriaRole());

		// Get the value of the given attribute of the element. Will return the current
		// value, even ifthis has been modified after the page has been loaded.
		System.out.println(usertextbox.getAttribute("title"));

		System.out.println(usertextbox.getAttribute("size"));

		// "//a[text()='Page One']"
		WebElement pagelink = driver.findElement(By.xpath("//a[text()='Page One']"));

		// Get the value of a given CSS property. Color values could be returned as rgba
		// or rgb strings.This depends on whether the browser omits the implicit opacity
		// value or not.
		System.out.println(pagelink.getCssValue("color"));

		// Where on the page is the top left-hand corner of the rendered element
		Point p = pagelink.getLocation();
		System.out.println("\n X Axis value :  " + p.getX());
		System.out.println("\n Y Axis value :  " + p.getY());

		// Capture the screenshot and store it in the specified location.
		File file = pagelink.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src/test/resources/codemindscreenshots/" + "test.png"));

		// What is the width and height of the rendered element
		Dimension dim = pagelink.getSize();
		System.out.println("\nWidth of the web element : " + dim.getWidth());
		System.out.println("\nHeight of the web element : " + dim.height); // getWidth():--we can use method and static
																			// variable too.
        System.out.println("\n........................................................................................................................................................");
		Dimension d = driver.findElement(By.xpath("//img[contains(@src,'college.blogspot.com')]")).getSize();
				
	    System.out.println("\nWidth of the Image web element : " +d.getHeight());
	    System.out.println("\nHeight of the Image web element : " +d.getWidth());
	    System.out.println("\n........................................................................................................................................................");

	    //Get the tag name of this element. Not the value of the name attribute: will return "input" for the element <input name="foo" />. 
	    System.out.println("\n Tag name of User name Testbox:  "+usertextbox.getTagName());
	    System.out.println("\n Tag name of link : "+pagelink.getTagName());
	    System.out.println("\n Tag name of Image : "+driver.findElement(By.xpath("//img[contains(@src,'college.blogspot.com')]")).getTagName());
		
	    System.out.println("\n........................................................................................................................................................");
	    //get text from button using the getAttribute value method same as like getText()method 
	    //getText() method return inner HTML text.
	    System.out.println("\n get text value from button using getAttribute() method : "+driver.findElement(By.xpath("//input[@id='textbox1']")).getAttribute("value"));
	    System.out.println("\n get text value of checkbox using getAttribute() method : "+driver.findElement(By.xpath("//input[@id='checkbox1']")).getAttribute("value"));
	    System.out.println("\n get text value of checkbox using getAttribute() method : "+driver.findElement(By.cssSelector("#checkbox1")).getAttribute("value"));
	    
	    System.out.println("\n get text value from button using getText() method : "+driver.findElement(By.xpath("//button[@id='but2']")).getText());
	   
	    
	    System.out.println("\n........is displayed ()................................................................................................................................................");
        //Is this element displayed or not? This method avoids the problem of having to parse anelement's "style" attribute.
	    WebElement mrOptionCheckBox = driver.findElement(By.cssSelector("#dte"));
	    System.out.println("\nReturn the True value if element is displayed:  "+mrOptionCheckBox.isDisplayed());
  
	    System.out.println("\nReturn the false value if element is not displayed"+driver.findElement(By.cssSelector("#hbutton")).isDisplayed()); 
	    ////input[@id='radio1']
	   
	    System.out.println("\nReturn the True value if element is displayed "+driver.findElement(By.xpath("//input[@id='radio1']")).isDisplayed()); 
	 
	    System.out.println("\n....is Enabled method....................................................................................................................................................");
	      
	    WebElement male= driver.findElement(By.xpath("//input[@id='radio1']")); 
	    System.out.println("\n male radio  button is enabled : "+male.isEnabled());
	    
	    System.out.println("\n....is Selected  method....................................................................................................................................................");
	    
	    System.out.println("\n before male radio button is selectd : "+male.isSelected());
	    male.click();
	    
	    System.out.println("\n after male radio button is selectd : "+male.isSelected());
	    
	   
	   driver.quit();
	}

}
