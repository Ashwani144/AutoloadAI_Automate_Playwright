package com.qa.AutoloadAI.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.AutoloadAI.base.BaseTest;
import com.qa.AutoloadAI.pages.ReleaseManagementPage;

public class ReleaseManagementTest extends BaseTest {

	@Test(priority = 1)
	public void loginPageURLForReleaseManagement() {
		loginPage = homePage.navigateToLoginPage();
	}

	@Test(priority = 2)
	public void loginActionForReleaseManagement() {
		loginPage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
	}

	@Test(priority = 3)
	public void ToValidatetheLoadGeneratorPage() {
		loginPage.ToValidateReleasemanagement();
		{
			ReleaseManagementPage releasemanagementPage = new ReleaseManagementPage(page);
			{
			//	releasemanagementPage.clickUtilityDropdownIcon();
				page.waitForTimeout(2000); // Adjust timeout as necessary

				releasemanagementPage.clickReleaseManagementButton();
				page.waitForTimeout(2000); // Adjust timeout as necessary

				// Take screenshot
				// releasemanagementPage.takeScreenshot("release_management_page.png");

				// Validate the text "Release Management"
				Assert.assertTrue(releasemanagementPage.isReleaseManagementTextVisible(),
						"Release Management text is not visible!");
			}
		}
	}
}
