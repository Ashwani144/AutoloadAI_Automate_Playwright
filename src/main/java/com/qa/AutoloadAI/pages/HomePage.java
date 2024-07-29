package com.qa.AutoloadAI.pages;

import com.microsoft.playwright.Page;

public class HomePage {

	private Page page;

	// 1. String Locators - OR
	private String loginLink = "//button[text()='Log In / Sign Up']";
	private String ExecuteIcon = "(//span[contains(text(),'WebLoadMPStore_')])[1]/following::td[3]//button/span[@role='img']";

	// 2. page constructor:
	public HomePage(Page page) {
		this.page = page;
	}

	// 3. page actions/methods:
	public String getHomePageTitle() {
		String title =  page.title();
		System.out.println("page title: " + title);
		return title;
	}

	public String getHomePageURL() {
		String url =  page.url();
		System.out.println("page url : " + url);
		return url;
	}

	/*
	 * public String doSearch(String productName) { page.fill(search, productName);
	 * page.click(searchIcon); String header = page.textContent(searchPageHeader);
	 * System.out.println("search header: " + header); return header; }
	 */
	
	public LoginPage navigateToLoginPage() {
	//	page.click(ExecuteIcon);
		page.click(loginLink);
		return new LoginPage(page);
	}

}
