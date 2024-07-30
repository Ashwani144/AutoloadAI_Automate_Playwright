package com.qa.AutoloadAI.pages;

import com.microsoft.playwright.Page;

public class ReleaseManagementPage {
	private Page page;

	// Locators
	private String utilityDropdownIcon = "css=selector-for-utility-dropdown-icon";
	private String releaseManagementButton = "css=selector-for-release-management-button";
	private String releaseManagementText = "text='Release Management'"; // Assuming this is a valid locator

	// Constructor
	public ReleaseManagementPage(Page page) {
		this.page = page;
	}

	// Actions
	/*
	 * public void clickUtilityDropdownIcon() { page.click(utilityDropdownIcon); }
	 */
	public void clickReleaseManagementButton() {
		//page.click(releaseManagementButton);
		page.click("//span[normalize-space()='Release Management']");
	}

	public boolean isReleaseManagementTextVisible() {
		return page.isVisible(releaseManagementText);
	}

	/*
	 * public void takeScreenshot(String path) { page.screenshot(new
	 * Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true)); }
	 */
}
