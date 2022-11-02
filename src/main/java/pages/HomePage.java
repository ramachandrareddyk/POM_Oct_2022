package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;

public class HomePage extends BasePage{
	
	private WebDriver driver;
	ElementUtilities utils;
	//1.Page objects/By Locaters
	
	private By SearchBox=By.xpath("//input[@name='search']");
	private By searchButton=By.xpath("//i[@class='fas fa-search']");
	private By MyAccount=By.xpath("//span[normalize-space()='My Account']");
	private By Register = By.xpath("//a[normalize-space()='Register']");
	private By Login = By.xpath("//a[normalize-space()='Login']");
	private By NavigationBar =By.xpath("//div[@id='narbar-menu']");
			
	//Page class constructor
	public HomePage(WebDriver driiver) {
		this.driver=driiver;
		utils= new ElementUtilities(driiver);
	}
	//page Action methods
	public String getHomePageTitle() {
		return utils.getTitle();
	}
	
	public boolean isSearchBoxExist() {
		return utils.doIsDisplayed(SearchBox);
	}
	
	public boolean isSerachButtonExist() {
		return utils.doIsDisplayed(searchButton);
	}
	
	public boolean isNavigationBarExist() {
		return utils.doIsDisplayed(NavigationBar);
	}
	
	public RegisterPage navaigateToRegisterPage() {
		utils.doClick(MyAccount);
		utils.doClick(Register);
		
		return new RegisterPage(driver);
	}
	
	public LoginPage navigateToLoginPage() {
		utils.doClick(MyAccount);
		utils.doClick(Login);
		
		return new LoginPage(driver);
	}
	
	

}
