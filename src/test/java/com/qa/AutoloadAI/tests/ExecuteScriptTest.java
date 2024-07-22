/*
package com.qa.AutoloadAI.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.constants.AppConstants;
import com.qa.AutoloadAI.pages.ExecuteScriptPage;

public class ExecuteScriptTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageNavigationTest() {
	    loginPage = homePage.navigateToLoginPage();
		//loginPage.navigateToLoginPage();
		String actLoginPageTitle = loginPage.getLoginPageTitle();
		System.out.println("page act title: " + actLoginPageTitle);
		Assert.assertEquals(actLoginPageTitle, AppConstants.LOGIN_PAGE_TITLE);
		
		ExecuteScriptPage demoPage = new ExecuteScriptPage(page);

        demoPage.clickPlayButton();
        demoPage.clickSelect1();
        demoPage.selectLoadOption();
        demoPage.clickSelect2();
        demoPage.clickLoadText();
        demoPage.clickSelectionOverflow();
        demoPage.selectLoadGeneratorText();
        demoPage.enterRunDescription("Test Demo");
        demoPage.enterVUser("2");
        demoPage.enterRampUpDuration("10");
        demoPage.enterTestDuration("30");
        demoPage.enterInitialDelay("0");
        demoPage.clickExecuteButton();
        demoPage.clickReloadButton();
        demoPage.waitForTimeout(10000);
        demoPage.clickReloadButton();
		
		
		
	}
*/