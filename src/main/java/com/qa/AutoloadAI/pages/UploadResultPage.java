package com.qa.AutoloadAI.pages;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

public class UploadResultPage {
	private Page page;

	// Locators
	private String reportsDropdownIcon = "css=selector-for-reports-dropdown-icon";
	private String uploadResultButton = "css=selector-for-upload-result-button";
	private String uploadField = "input[type='file']";
	private String uploadButton = "css=selector-for-upload-button";
	private String openButton = "css=selector-for-open-button";

	// Constructor
	public UploadResultPage(Page page) {
		this.page = page;
	}

	// Actions
	/*
	 * public void clickReportsDropdownIcon() { page.click(reportsDropdownIcon); }
	 */

	public void clickUploadResultButton() {
		// page.click(uploadResultButton);
		// page.click("//li[@role='none']//span[@class='ant-menu-title-content'][normalize-space()='Upload
		// Result']");
		// page.click("(//(//li[@role='menuitem']//span[@class='ant-menu-title-content'][normalize-space()='Upload
		// Result'])[1]");
		// page.click("(//span[normalize-space()='Reports']/following::li[@role='menuitem'])[6]");
		// page.click("//span[normalize-space()='Reports']/following::li[@data-menu-id=\"rc-menu-uuid-44000-1-uploadresult\"]/following::span[text()='Upload
		// Result']");
		page.click("//span[normalize-space()='Upload Result']");
	}

	public void uploadFile(String filePath) {
		page.setInputFiles(uploadField, Paths.get(filePath));
	}

	/*
	 * public void clickOpenButton() { page.click(openButton); }
	 */

	public void clickUploadButton() {
		//page.click(uploadButton);
		page.click("//button[@class='ant-btn css-byeoj0 ant-btn-default upload-button']//span[@aria-label='upload']//*[name()='svg']");
	}
}
