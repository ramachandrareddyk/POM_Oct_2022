package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import base.BaseTest;
import utilities.Constents;

public class HomeTest extends BaseTest{
	
	
	@Test
	public void verifyHomePageTitleTest() {
		String title=home.getHomePageTitle();
		
		Assert.assertEquals(title, Constents.HOMEPAGETITLE);
	}
	
	@Test
	public void verifyNavigationBarTest() {
		Assert.assertTrue(home.isNavigationBarExist());
	}
	
	@Test
	public void verifySearchBoxExistTest() {
		Assert.assertTrue(home.isSearchBoxExist());
	}
	
	@Test
	public void verifySearchButtonExistTest() {
		Assert.assertTrue(home.isSerachButtonExist());
	}

}
