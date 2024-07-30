package com.qa.AutoloadAI.tests;

import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.pages.DeleteScriptPage;

public class DeleteScriptTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageURLForDeleteScript() {
		loginPage = homePage.navigateToLoginPage();
	}

	@Test(priority = 2)
	public void loginActionForDeleteScript() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

	@Test(priority = 3)
	public void DeleteTheRecentScript() {
		loginPage.ToDeleteRecentScript();
		{
			DeleteScriptPage deletescriptPage = new DeleteScriptPage(page);
		//	deletescriptPage.clickAllResultsIcon();
			page.waitForTimeout(2000); // Adjust timeout as necessary

		//	deletescriptPage.chooseFirstDataEntry();
			deletescriptPage.clickDeleteIcon();
			page.waitForTimeout(2000); // Adjust timeout as necessary

			deletescriptPage.confirmAlert();
			page.waitForTimeout(2000); // Adjust timeout as necessary

			//deletescriptPage.reloadAllResults();
			//page.waitForTimeout(2000); // Adjust timeout as necessary
		}
	}
}
