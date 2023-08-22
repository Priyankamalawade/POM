package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase {
	
	@FindBy(css = "ul > li.preview")
	WebElement itemIcon;
	WebDriver driver;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	
	
	}

	
	
}
