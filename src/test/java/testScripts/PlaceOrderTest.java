package testScripts;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;

public class PlaceOrderTest extends TestBase {
	public PlaceOrderTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	HomePage homePage;
	SearchResultPage resultPage;
	@BeforeTest
	public void setUp() {
		initialize();
	}
	
  @Test
  public void searchItem() throws IOException {
	  homePage = new HomePage();
	  homePage.searchItem("Parry Hotter");
	  resultPage = new SearchResultPage();
	  resultPage.viewItemDetail();
  }
  @Test
  public void addItemTest() {
  }
  @Test
  public void checkoutItemTest() {
  }
}
