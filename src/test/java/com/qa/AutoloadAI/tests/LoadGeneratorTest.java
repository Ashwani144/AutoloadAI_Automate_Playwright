package com.qa.AutoloadAI.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.pages.LoadGeneratorPage;

public class LoadGeneratorTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageURLForLoadGenerator() {
		loginPage = homePage.navigateToLoginPage();
	}

	@Test(priority = 2)
	public void loginActionForLoadGenerator() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

	@Test(priority = 3)
	public void ToValidatetheLoadGeneratorPage() {
		loginPage.ToValidatetheLoadGenerator();
		{ 
			LoadGeneratorPage loadgeneratorPage = new LoadGeneratorPage(page);
		//	loadgeneratorPage.clickUtilityDropdownIcon();
	        page.waitForTimeout(2000);  // Adjust timeout as necessary

	        loadgeneratorPage.clickLoadGeneratorButton();
	        page.waitForTimeout(2000);  // Adjust timeout as necessary

	        // Take screenshot
	      //  loadgeneratorPage.takeScreenshot("load_generator_page.png");

	        // Validate the text "Load Generator"
	        Assert.assertTrue(loadgeneratorPage.isLoadGeneratorTextVisible(), "Load Generator text is not visible!");	
			

}
}
}
