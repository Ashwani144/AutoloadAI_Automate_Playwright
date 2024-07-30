
package com.qa.AutoloadAI.pages;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

public class LoadGeneratorPage {
    private Page page;

    // Locators
    private String utilityDropdownIcon = "css=selector-for-utility-dropdown-icon";
    private String loadGeneratorButton = "css=selector-for-load-generator-button";
    private String loadGeneratorText = "text='Load Generator'"; // Assuming this is a valid locator

    // Constructor
    public LoadGeneratorPage(Page page) {
        this.page = page;
    }

    // Actions
	/*
	 * public void clickUtilityDropdownIcon() { page.click(utilityDropdownIcon); }
	 */
    public void clickLoadGeneratorButton() {
      //  page.click(loadGeneratorButton);
      //  page.click("//li[@role='none']//span[@class='ant-menu-title-content'][normalize-space()='Load Generator']");
      //  page.click("(//span[text()=' Load Generator'])[1]");
        
        page.click("//span[normalize-space()='Load Generator']");
    }

    public boolean isLoadGeneratorTextVisible() {
        return page.isVisible(loadGeneratorText);
    }

	/*
	 * public void takeScreenshot(String path) { page.screenshot(new
	 * Page.ScreenshotOptions().setPath(Paths.get(path).setFullPage(true)); }
	 */
}
