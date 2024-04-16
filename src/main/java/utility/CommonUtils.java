package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {

	public static void selectValuefromDropDopwn(WebElement dropdownLocator, String optionToBeSelected)
	{
		Select select = new Select(dropdownLocator);
		select.selectByVisibleText(optionToBeSelected);
	}
}
