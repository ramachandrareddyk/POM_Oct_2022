package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;
import utilities.ElementUtilities;
import utilities.JSUtilities;

public class RegisterPage extends BasePage{

	private WebDriver driver;
	ElementUtilities utils;
	JSUtilities jsutils;
	
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		
		utils= new ElementUtilities(driver);
		jsutils= new JSUtilities(driver);
	}
	
	By FirstName= By.id("input-firstname");
	By LastName = By.id("input-lastname");
	By Email= By.id("input-email");
	By Telephone= By.xpath("//input[@id='input-telephone']");
	By Password =By.id("input-password");
	By ConformPassword=By.xpath("//input[@id='input-confirm']");
	By SubscribeYes= By.xpath("//label[normalize-space()='Yes']");
	By SubscribeNo= By.xpath("//label[normalize-space()='No']");
	By PrivacyPolacy =By.xpath("//input[@name='agree']");
	By ContinueButton=By.xpath("//input[@value='Continue']");
	
	
	
	public void registerNewUser(String fname, String LName, String email,String telephone,String password, String subscribe) throws InterruptedException {
		
		utils.doSendKeys(FirstName, fname);
		utils.doSendKeys(LastName, LName);
		utils.doSendKeys(Email, email);
		utils.doSendKeys(Telephone, telephone);
		utils.doSendKeys(Password, password);
		utils.doSendKeys(ConformPassword, password);
		if(subscribe.equalsIgnoreCase("Yes")) {
			//utils.doClick(SubscribeYes);
			jsutils.clickByJS(SubscribeYes);
		}else {
			//utils.doClick(SubscribeNo);
			jsutils.clickByJS(SubscribeNo);
		}
		//utils.doClick(PrivacyPolacy);
		jsutils.clickByJS(PrivacyPolacy);
		Thread.sleep(5000);
		//utils.doClick(ContinueButton);
		jsutils.clickByJS(ContinueButton);
	}
}
