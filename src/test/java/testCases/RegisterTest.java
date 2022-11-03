package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.Constents;
import utilities.ExcelUtilities;

public class RegisterTest extends BaseTest{
	
	@DataProvider
	public Object[][] getTestData() {
		Object data[][]=ExcelUtilities.getTestData("registration");
		
		return data;
	}
	
	
	
	@Test(dataProvider = "getTestData")
	public void registerNewUserWithAllDetails(String firstname,String lastname, String email,String teliphone, String password,String subscribe) throws InterruptedException {
		home.navaigateToRegisterPage();
		register.registerNewUser(firstname,lastname,email,teliphone,password,subscribe);
		String title=accountCreated.getAccountCreatedPageTitle();
		Thread.sleep(10000);
		Assert.assertEquals(title, Constents.ACCOUNTCREATEDPAGETITLE);
	
	}
	
	
	

}
