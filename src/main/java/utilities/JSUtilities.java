package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtilities {

		WebDriver driver;
		
		public JSUtilities(WebDriver driver) {
			this.driver= driver;
		}
		public String getTitleByJS() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			return js.executeScript("return document.title;").toString();
		}
		
		public void refreshWebPageByJS() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("history.go(0)");
		}
		
		public void sendKeysByJS(String id, String value) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
		}
		
		public void clickByJS(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
		}
		
		public void scrollDownPage() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			//js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		public void scrollDownPage(String hight) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollTo(0,'"+hight+"')");
		}
		
		public void scrollUpToWebElement(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView(true);",element);
		}
		
		public void scrollUppage() {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		}
		
		public void drawBorder(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].style.border='5px solid red'",element);
		}
		
	
	
}
