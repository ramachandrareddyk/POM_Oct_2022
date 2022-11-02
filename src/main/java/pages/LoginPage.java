package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class LoginPage extends BasePage {

	private WebDriver driver;
	ElementUtilities utils;

	By Username = By.xpath("//input[@id='input-email']");
	By Password = By.xpath("//input[@id='input-password']");
	By LoginButton = By.xpath("//button[@type='submit']");
	By WarningMessageForInvalidCredtials=By.xpath("//div[@class='alert alert-danger alert-dismissible']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		utils = new ElementUtilities(driver);
	}

	public String getLoginpageTitle() {
		return utils.getTitle();
	}

	public void doLogin(String username, String password) throws InterruptedException {
		utils.doSendKeys(Username, username);
		utils.doSendKeys(Password, password);
		utils.doClick(LoginButton);
		Thread.sleep(4000);
	}
	
	public boolean warningMessageIsDisplaying() {
		return utils.doIsDisplayed(WarningMessageForInvalidCredtials);
	}
}
