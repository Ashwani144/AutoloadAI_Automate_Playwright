/*
package com.qa.AutoloadAI.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.constants.AppConstants;
import com.qa.AutoloadAI.pages.ExecuteScriptPage;
import com.qa.AutoloadAI.pages.LoginPage;

public class ExecuteScriptTest extends BaseTest {

    private ExecuteScriptPage executescriptpage;
    private LoginPage loginPage;

    @Test(priority = 1)
    public void loginPageNavigationTest() {
        loginPage = new LoginPage(page);
     //   loginPage.navigateToLoginPage();
        String actLoginPageTitle = loginPage.getLoginPageTitle();
        System.out.println("page act title: " + actLoginPageTitle);
        Assert.assertEquals(actLoginPageTitle, AppConstants.LOGIN_PAGE_TITLE);
    }

    @Test(priority = 2)
    public void appLoginTest() {
        loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
        executescriptpage = new ExecuteScriptPage(page);

        executescriptpage.clickPlayButton();
        executescriptpage.clickSelect1();
        executescriptpage.selectLoadOption();
        executescriptpage.clickSelect2();
        executescriptpage.clickLoadText();
        executescriptpage.clickSelectionOverflow();
        executescriptpage.selectLoadGeneratorText();
        executescriptpage.enterRunDescription("Test Demo");
        executescriptpage.enterVUser("2");
        executescriptpage.enterRampUpDuration("10");
        executescriptpage.enterTestDuration("30");
        executescriptpage.enterInitialDelay("0");
        executescriptpage.clickExecuteButton();
        executescriptpage.clickReloadButton();
        executescriptpage.waitForTimeout(10000);
        executescriptpage.clickReloadButton();
    }
}

*/
