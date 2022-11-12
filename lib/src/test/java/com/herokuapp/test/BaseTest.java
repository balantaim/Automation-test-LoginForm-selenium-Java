package com.herokuapp.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.herokuapp.pages.BasePage;

public class BaseTest extends BasePage{
	

	
	@BeforeSuite
	public void initStart() {
		Assert.assertTrue(goToHomepage(), "ERROR: Cannot navigate to the home page!");
	}
	
	
	@AfterSuite
	public void endTest() {
		//close the browser
		closeBrowser();
	}

}
