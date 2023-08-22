package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class HomePage extends TestBase {
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(name="searchbar")
	WebElement srcBox;
	
	@FindBy(id="button-search")
	WebElement srcBtn;
	
	@FindBy(id="cart")
	WebElement btnCart;
	
	public void searchItem(String string) {
		srcBox.sendKeys("Parry Hoter");
		srcBtn.click();
	}
	
	
	

}
