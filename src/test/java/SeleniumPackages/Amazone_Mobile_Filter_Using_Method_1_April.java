package SeleniumPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazone_Mobile_Filter_Using_Method_1_April {
	static WebDriver driver = new ChromeDriver(); // take this at class level

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=11579131835564795227&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9146372&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		// Thread.sleep(2000);
		search.sendKeys("mobile under 10000 5g android ");

		// Thread.sleep(2000);

		WebElement searchIcon = driver.findElement(By.xpath("//input[@type='submit']"));
		searchIcon.click();

		driver.findElement(By.cssSelector("i.a-icon")).click();
		Amazone_Mobile_Filter_Using_Method_1_April.SelectPrizeWise("Price: Low to High");

	}

	public static void SelectPrizeWise(String SelectPrize) {  // NOT Able to do using this way , I have to follow Select by tag way .
		//// li//a[@class='a-dropdown-link']
		List<WebElement> prise = driver.findElements(By.xpath("//a[@class='a-dropdown-link']"));

		for (WebElement kimat : prise) {
			if (kimat.getText().equalsIgnoreCase(SelectPrize)) {
				kimat.click();
				break;
			}
		}

	}

}
