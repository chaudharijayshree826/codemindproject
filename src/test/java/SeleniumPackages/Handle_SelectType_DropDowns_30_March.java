package SeleniumPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadProperty;

public class Handle_SelectType_DropDowns_30_March {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		//driver.get("https://omayo.blogspot.com/");// written below code for getting url 

		driver.get(ReadProperty.readProperty("url"));

		WebElement SingleSelectDropdown = driver.findElement(By.xpath("//select[@id='drop1']"));

		// Select:-Constructor. A check is made that the given element is, indeed, a
		// SELECT tag. If it is not,then an UnexpectedTagNameException is thrown.

		Select s = new Select(SingleSelectDropdown);//WebElement passed to Select Constructor as an argument.
		
		System.out.println("\n............ selectByIndex(index no.);......................................................................................");
		//The first selected option in this select tag (or the currently selected option in a normal select)
		s.selectByIndex(2);
		
		
		System.out.println("\n............ getAllSelectedOptions()......................................................................................");
		//Returns:• All selected options belonging to this select tag

		List<WebElement> allSelectedOption = s.getAllSelectedOptions();
        
		for(WebElement option :allSelectedOption)
		{
			System.out.println("\n Value selected in dropdown: "+option.getText());
		}
		
		System.out.println("\n............ getFirstSelectedOption()......................................................................................");
		
		//getFirstSelectedOption();:--The first selected option in this select tag (or the currently selected option in anormal select)
		WebElement FirstSelectedOption = s.getFirstSelectedOption();		
		System.out.println("\n Value selected in dropdown at First click : "+FirstSelectedOption.getText());
		
		System.out.println("\n............ getOptions()......................................................................................");
		//All options belonging to this select tag
		
		List<WebElement> allOptionsfromDropDown = s.getOptions();
		
		System.out.println("\n Size of the DropDown element : "+allOptionsfromDropDown.size());;
		
		System.out.println("\n List of All Options in  DropDown . ");
		
		for(WebElement options :allOptionsfromDropDown)
		{
			System.out.println(options.getText());
		}
		
		System.out.println("\n............isMultiple()......................................................................................");
		//Returns:• Whether this select element support selecting multiple options at the same time? This is done by checking the value of the "multiple" attribute.
		System.out.println("\n Is the drop down Multiple selected:  "+s.isMultiple());
		
		Thread.sleep(3000);
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		s.selectByValue("ghi");
		
		Thread.sleep(3000);
		s.selectByVisibleText("doc 3");
		
		driver.quit();
		
	}

}
