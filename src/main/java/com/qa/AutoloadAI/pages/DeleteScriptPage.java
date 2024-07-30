package com.qa.AutoloadAI.pages;
import com.microsoft.playwright.Page;

public class DeleteScriptPage {
    private Page page;

    // Locators
    private String allResultsIcon = "css=selector-for-all-results-icon";
    private String firstDataEntry = "css=selector-for-first-data-entry";
    private String deleteIcon = "css=selector-for-delete-icon";
    private String alertYesButton = "css=selector-for-alert-yes-button";
    private String reloadButton = "css=selector-for-reload-button";

    // Constructor
    public DeleteScriptPage(Page page) {
        this.page = page;
    }

    // Actions
	/*
	 * public void clickAllResultsIcon() { page.click(allResultsIcon); page.
	 * click("//li[@class='ant-menu-item ant-menu-item-active ant-menu-item-selected ant-tooltip-open']//span[@aria-label='container']//*[name()='svg']"
	 * ); }
	 */

	/*
	 * public void chooseFirstDataEntry() { page.click(firstDataEntry); }
	 */

    public void clickDeleteIcon() {
     //   page.click(deleteIcon);
       // page.click("//td[@class='ant-table-cell allresult-action ant-table-cell-row-hover']//span[@aria-label='delete']//*[name()='svg']//*[name()='path' and contains(@d,'M360 184h-')]");
      page.click("((//span[contains(text(),'WebLoadMPStore_')])[1][1]/following::td[5]//button/span[@role='img'])[2]");
    }

    public void confirmAlert() {
       // page.click(alertYesButton);
        page.click("//span[normalize-space()='OK']");
    }

	/*
	 * public void reloadAllResults() { page.click(reloadButton); }
	 */
}
