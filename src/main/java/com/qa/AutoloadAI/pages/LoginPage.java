package com.qa.AutoloadAI.pages;
import com.microsoft.playwright.Page;

public class LoginPage {

	private Page page;

	// 1. String Locators - OR
	private String emailId = "//input[@placeholder='Enter Email']";
	private String password = "//input[@placeholder='Enter Password']";
	private String loginBtn = "//button[text()='Log in ']";
	private String loginLink = "//button[text()='Log In / Sign Up']";
	private String ExecuteIcon = "(//span[contains(text(),'WebLoadMPStore_')])[1]/following::td[3]//button/span[@aria-label='play-circle']";
	private String ReportIcon = "//span[@aria-label='dot-chart']//*[name()='svg']";
	private String allResult = "//li[@class='ant-menu-item ant-menu-item-active ant-tooltip-open']//span[@aria-label='container']//*[name()='svg']";
	private String ClickUtility = "//span[normalize-space()='Utility']";
	private String ReportAllResult= "//span[normalize-space()='Reports']";
	
	
	// private String allResult = "//li[@class='ant-menu-item ant-menu-item-active ant-menu-item-selected ant-tooltip-open']//span[text()='All Results']";
//	private String forgotPwdLink = "//a[text()='Forgot Password?']";
	//private String logoutLink = "//a[@class='list-group-item'][normalize-space()='Logout']";

	// 2. page constructor:
	public LoginPage(Page page) {
		this.page = page;
	}
	
	// 3. page actions/methods:
	public String getLoginPageTitle() {
		return page.title();
	}
	
	/*
	 * public boolean isForgotPwdLinkExist() { return page.isVisible(forgotPwdLink);
	 * }
	 */
	
	public void doLogin(String appUserName, String appPassword) 
	{
		System.out.println("App creds: " + appUserName + ":" + appPassword);
		page.fill(emailId, appUserName);
		page.fill(password, appPassword);
		page.click(loginBtn);
		//page.locator(logoutLink).waitFor();
		//if(page.locator(logoutLink).isVisible()) 
	//	{
		//	System.out.println("user is logged in successfully....");
		//	return true;
	//	}else 
		//{
		//	System.out.println("user is not logged in successfully....");
		//	return false;
	}
	
	public ExecuteScriptPage NavigateToExecuteIcon() {
		page.click(ExecuteIcon);
		return new ExecuteScriptPage(page);
		
	}
	
	public ReportScriptPage NavigateToReportIcon() {
		page.click(ReportIcon);
		return new ReportScriptPage(page);
		
	}
	
	public DeleteScriptPage ToDeleteRecentScript() {
		page.click(allResult);
		return new DeleteScriptPage(page);
		
	}
	
	public LoadGeneratorPage ToValidatetheLoadGenerator() {
		page.click(ClickUtility);
		return new LoadGeneratorPage(page);
		
	}
	
	public ReleaseManagementPage ToValidateReleasemanagement() {
		page.click(ClickUtility);
		return new ReleaseManagementPage(page);
		
	}
	
	public UploadResultPage ToTestTheUploadResultData() {
		page.click(ReportAllResult);
		return new UploadResultPage(page);
		
	}
}

