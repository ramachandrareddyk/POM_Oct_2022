package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	public Properties prop;
	public BasePage base;
	public HomePage home;
	public LoginPage login;
	
	@BeforeMethod
	public void setUp() {
		base= new BasePage();
		prop= base.init_Properties();
		System.out.println("==========="+prop.getProperty("browser"));
		
		driver=base.init_Browser(prop.getProperty("browser"));
		home= new HomePage(driver);
		login=new LoginPage(driver);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
