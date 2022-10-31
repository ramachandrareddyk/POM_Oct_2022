package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	public BasePage base;
	
	@BeforeMethod
	public void setUp() {
		base= new BasePage();
		prop= new Properties();
		driver=base.init_Browser(prop.getProperty("browser"));
		
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
