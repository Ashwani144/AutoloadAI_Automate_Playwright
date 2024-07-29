package com.qa.AutoloadAI.tests;

import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.pages.ReportScriptPage;

public class ReportPageTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageNavigationTest() {
		loginPage = homePage.navigateToLoginPage();
	}

	@Test(priority = 2)
	public void appLoginTest() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}
	
	@Test(priority = 3)
	public void reportScriptFlow() {
	       loginPage.NavigateToReportIcon();
	       ReportScriptPage reportscriptpage = new ReportScriptPage(page);
	      
	   //    reportscriptpage.clickReportIcon();
	       reportscriptpage.goToSummaryReport();

	        // Search by ID
	       reportscriptpage.enterID("P-1722159726484");
	       reportscriptpage.clickSearchButton();

	        // Validate responsiveness of each tab
	       reportscriptpage.clickResponseTimeVsVUserTab();
	        page.waitForTimeout(2000);

	        reportscriptpage.clickResponseTimeByTransactionTab();
	        
	        page.waitForTimeout(2000);

	        reportscriptpage.clickResponseTimeUnderLoadTab();
	        page.waitForTimeout(2000);

	        reportscriptpage.clickResponseTimeByLocationTab();
	        page.waitForTimeout(2000);

	        reportscriptpage.clickResponseTimeByLocationVsVusersTab();
	        page.waitForTimeout(2000);
	       
}
}