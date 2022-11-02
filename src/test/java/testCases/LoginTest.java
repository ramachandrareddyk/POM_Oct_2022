package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constents;

public class LoginTest extends BaseTest{

	@Test
	public void verifyLoginPageTitleTest() {
		home.navigateToLoginPage();
		String title=login.getLoginpageTitle();
		
		Assert.assertEquals(title, Constents.LOGINPAGETITLE);
	}
	@Test
	public void verifyLoginWithValidCredentialsTest() throws InterruptedException {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyLoginWithInValidCredentialsTest() throws InterruptedException {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("inusername"), prop.getProperty("inpassword"));
	Assert.assertTrue(login.warningMessageIsDisplaying());
	
	}
	
	
	
}
