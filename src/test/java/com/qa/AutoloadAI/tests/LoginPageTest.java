package com.qa.AutoloadAI.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.constants.AppConstants;
import com.qa.AutoloadAI.pages.ExecuteScriptPage;
import com.qa.AutoloadAI.pages.LoginPage;

public class LoginPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageNavigationTest() {
	    loginPage = homePage.navigateToLoginPage();
		//loginPage.navigateToLoginPage();
		String actLoginPageTitle = loginPage.getLoginPageTitle();
		System.out.println("page act title: " + actLoginPageTitle);
		Assert.assertEquals(actLoginPageTitle, AppConstants.LOGIN_PAGE_TITLE);
	}

	/*
	 * @Test(priority = 2) public void forgotPwdLinkExistTest() {
	 * Assert.assertTrue(loginPage.isForgotPwdLinkExist()); }
	 */

	@Test(priority = 2)
	public void appLoginTest() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
}
