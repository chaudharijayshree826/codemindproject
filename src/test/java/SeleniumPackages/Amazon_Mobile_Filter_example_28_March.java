package SeleniumPackages;

import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Mobile_Filter_example_28_March {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=11579131835564795227&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146372&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		search.sendKeys("mobile under 10000 5g android ");

		Thread.sleep(2000);

		WebElement searchIcon = driver.findElement(By.xpath("//input[@type='submit']"));
		searchIcon.click();

		//
		WebElement Filter = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));

		Select DropDownValue = new Select(Filter);// WebElement passed to Select Constructor as an argument.

		Thread.sleep(3000);
		DropDownValue.selectByVisibleText("Price: Low to High ");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
