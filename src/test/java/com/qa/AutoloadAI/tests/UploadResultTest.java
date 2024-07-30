package com.qa.AutoloadAI.tests;

import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.pages.UploadResultPage;

public class UploadResultTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageURLForUploadResult() {
		loginPage = homePage.navigateToLoginPage();
	}

	@Test(priority = 2)
	public void loginActionForUploadResult() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

	@Test(priority = 3)
	public void ToValidatetheUploadResultFeature() {
		loginPage.ToTestTheUploadResultData();
		{
			// Navigate to Upload Result and perform actions

			UploadResultPage uploadresultPage = new UploadResultPage(page);
			{
				// Navigate to Upload Result and perform actions

			//	uploadresultPage.clickReportsDropdownIcon();
				page.waitForTimeout(2000); // Adjust timeout as necessary

				uploadresultPage.clickUploadResultButton();
				page.waitForTimeout(2000); // Adjust timeout as necessary

				// Upload file
				uploadresultPage.uploadFile(
						"F:\\Vinove\\Chebelo\\Final_Report\\Application\\UAT\\04052023\\summary\\Load_Report_With50_UAT_Student_Application_Portal.csv");
			//	uploadresultPage.clickOpenButton();
				page.waitForTimeout(5000); // Adjust timeout as necessary
				uploadresultPage.clickUploadButton();
				page.waitForTimeout(5000); // Adjust timeout as necessary
			}
		}
	}
}