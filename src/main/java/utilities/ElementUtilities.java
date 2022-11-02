package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class ElementUtilities extends BasePage{
	WebDriver driver;

	public ElementUtilities(WebDriver driver) {
		this.driver= driver;
	}
	
	//Method to get WebElement
	
	public WebElement getWebElement(By Locater) {
		WebElement element= driver.findElement(Locater);
		
		return element;
	}
	
	//Method to get list of webElements
	public List<WebElement> getWebElements(By Locater) {
		List<WebElement>elements= driver.findElements(Locater);
		
		return elements;
	}
	//Method to perform cick action
	public void doClick(By Locater) {
		getWebElement(Locater).click();
	}
	
	//method to perform click with actions class
	public void doClickWithActions(By Locater) {
		Actions act= new Actions(driver);
		act.click(getWebElement(Locater)).perform();
	}
	
	//method to clear text in textbox
	public void doClear(By Locater) {
		getWebElement(Locater).clear();
	}
	
	//method to enter text into text box
	public void doSendKeys(By Locater, String text) {
		getWebElement(Locater).sendKeys(text);
	}
	//method to enter text into textbox using actions class
	public void doSendKeysWithActions(By Locater, String Text) {
		Actions act= new Actions(driver);
		act.sendKeys(getWebElement(Locater),Text).perform();
	}
	
	public void selectOptionFromDropdownUsingSelectByVisableText(By Locater, String Text) {
		
		Select sel= new Select(getWebElement(Locater));
		sel.selectByVisibleText(Text);
		
	}
	
	public void selectOptionFromDropdownUsingSelectByIndex(By Locater, int index) {
		
		Select sel= new Select(getWebElement(Locater));
		sel.selectByIndex(index);
		
	}
	
	public void mouseOverMoveToElement(By Locater) {
		Actions act= new Actions(driver);
		act.moveToElement(getWebElement(Locater)).perform();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String doGetText(By Locater) {
		return getWebElement(Locater).getText();
	}
	
	public boolean doIsDisplayed(By Locater) {
		return getWebElement(Locater).isDisplayed();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextFromAlert() {
		return driver.switchTo().alert().getText();
	}
	
	public void switchToFrameUsingId(String id) {
		driver.switchTo().frame(id);
	}
	
	public void switchToFrameUsingName(String name) {
		driver.switchTo().frame(name);
	}
	
	public void switchToFrameUsingWebElement(By Locater) {
		driver.switchTo().frame(getWebElement(Locater));
	}
	
	public void switchToDefualtContent() {
		driver.switchTo().defaultContent();
	}
	
	
}
