package com.qa.AutoloadAI.pages;
import com.microsoft.playwright.Page;

public class ReportScriptPage {
    private Page page;

    // Locators
    private String reportIcon = "css=selector-for-report-icon";
    private String summaryReport = "css=selector-for-summary-report";
    private String idField = "input[placeholder='ID']";
    private String searchButton = "button:has-text('Search')";
    private String responseTimeVsVUserTab = "css=selector-for-ResponseTimeVsVUser";
    private String responseTimeByTransactionTab = "css=selector-for-ResponseTimeByTransaction";
    private String responseTimeUnderLoadTab = "css=selector-for-ResponseTimeUnderLoad";
    private String responseTimeByLocationTab = "css=selector-for-ResponseTimeByLocation";
    private String responseTimeByLocationVsVusersTab = "css=selector-for-ResponseTimeByLocationVsVusers";

    // Constructor
    public ReportScriptPage(Page page) {
        this.page = page;
    }

    // Actions
	/*
	 * public void clickReportIcon() { page.click(reportIcon); }
	 */

    public void goToSummaryReport() {
        page.click(summaryReport);
        page.click("//span[normalize-space()='Summary']");
       // page.click("//span[normalize-space()='Summary']");
    }

    public void enterID(String id) {
        page.fill(idField, id);
    }

    public void clickSearchButton() {
        page.click(searchButton);
    }

    public void clickResponseTimeVsVUserTab() {
        page.click(responseTimeVsVUserTab);
    }

    public void clickResponseTimeByTransactionTab() {
        page.click(responseTimeByTransactionTab);
    }

    public void clickResponseTimeUnderLoadTab() {
        page.click(responseTimeUnderLoadTab);
    }

    public void clickResponseTimeByLocationTab() {
        page.click(responseTimeByLocationTab);
    }

    public void clickResponseTimeByLocationVsVusersTab() {
        page.click(responseTimeByLocationVsVusersTab);
    }
}
