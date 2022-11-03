package pages;

import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class AccountCreatedPage extends BasePage{
	
	private WebDriver driver;
	ElementUtilities utils;
	
	public AccountCreatedPage(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtilities(driver);
	}
	
	
	public String getAccountCreatedPageTitle() {
		return utils.getTitle();
	}

}
