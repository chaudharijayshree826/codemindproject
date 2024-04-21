package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {

	public static void selectValuefromDropDopwn(WebElement dropdownLocator, String optionToBeSelected)
	{
		Select select = new Select(dropdownLocator);
		select.selectByVisibleText(optionToBeSelected);
	}
	
	public static void takesScreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;                                                                               //type cast the driver
		File file  = takesScreenshot.getScreenshotAs(OutputType.FILE);																					//takesScreenshot is the reference of the interface 
	                                                                                                                                                    //getScreenshotAs :: this is the method , this method want arg as in which format we want screenshot.
																																											// its like OutputType is  the interface 
		
		FileUtils.copyFile(file,new File("src/test/resources/codemindscreenshots/ "+name+System.currentTimeMillis()+".png"));
	}
}
