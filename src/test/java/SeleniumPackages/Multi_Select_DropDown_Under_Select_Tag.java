package SeleniumPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multi_Select_DropDown_Under_Select_Tag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://omayo.blogspot.com/");

		WebElement MultiSelectDropDown = driver.findElement(By.xpath("//select[@id='multiselect1']"));

		Select select = new Select(MultiSelectDropDown);

		List<WebElement> allselectedoption = select.getAllSelectedOptions();

		System.out.println("\n nothing is selected :");
		for (WebElement option : allselectedoption) {
			System.out.println(option.getText());
		}

		System.out.println("\n.............getAllSelectedOptions()....................................");
		select.selectByIndex(0);
		select.selectByVisibleText("Hyundai");

		allselectedoption = select.getAllSelectedOptions();
		for (WebElement option : allselectedoption) {
			System.out.println(option.getText());
		}

		System.out.println("\n.............................................................................................");
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("\n First selected option : " + firstSelectedOption.getText());

		System.out.println(
				"\n............ getOptions()......................................................................................");
		// All options belonging to this select tag

		List<WebElement> allOptionsfromDropDown = select.getOptions();

		System.out.println("\n Size of the DropDown element : " + allOptionsfromDropDown.size());
		;

		System.out.println("\n List of All Options in  DropDown . ");

		for (WebElement options : allOptionsfromDropDown) {
			System.out.println(options.getText());
		}

		System.out.println(
				"\n............isMultiple()......................................................................................");
		System.out.println("\n Is the drop down Multiple value selected:  " + select.isMultiple());

		Thread.sleep(3000);

		select.deselectAll();
		
		
		select.selectByIndex(3);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Volvo");
		
		Thread.sleep(3000);
		
		select.deselectByVisibleText("Audi");
		Thread.sleep(3000);
		select.deselectByIndex(1);
		Thread.sleep(3000);
		select.deselectByValue("volvox");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
