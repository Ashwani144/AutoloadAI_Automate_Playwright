package com.qa.AutoloadAI.tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.pages.ExecuteScriptPage;

public class ExecuteScriptTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageURLForExecuteScript() {
		loginPage = homePage.navigateToLoginPage();
	}

	@Test(priority = 2)
	public void loginActionForExecuteScript() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

	@Test(priority = 3)
	public void executeScriptFlow() {
	       loginPage.NavigateToExecuteIcon();
		//executescriptpage.clickPlayButton();

	    ExecuteScriptPage executescriptpage = new ExecuteScriptPage(page);
		executescriptpage.clickSelect1();

		executescriptpage.clickLoadButton();
		executescriptpage.selectLoadGenerator();
		 page.waitForTimeout(5000);
		//executescriptpage.fillRunDetails();
		executescriptpage.fillRunDetails("Test Demo", "2", "10", "30", "0");
		
		 page.waitForTimeout(5000);
		executescriptpage.clickExecuteButton();
	//	 executescriptpage).waitForTimeout(10000);
	//	executescriptpage.clickReloadButton();
		
		 
	//	executescriptpage.clickExecuteButton();
	//	executescriptpage.enterRunDescription("Test Demo");
		/*
		 * fillRunDetails.enterVUser("2"); executescriptpage.enterRampUpDuration("10");
		 * executescriptpage.enterTestDuration("30");
		 * executescriptpage.enterInitialDelay("0");
		 * executescriptpage.clickExecuteButton();
		 * executescriptpage.clickReloadButton();
		 * executescriptpage.waitForTimeout(10000);
		 * executescriptpage.clickReloadButton();
		 */

	}
}
