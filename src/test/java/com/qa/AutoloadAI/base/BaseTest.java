package com.qa.AutoloadAI.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Page;
import com.qa.AutoloadAI.factory.PlaywrightFactory;
import com.qa.AutoloadAI.listeners.ExtentReportListener;
import com.qa.AutoloadAI.listeners.ScreenshotUtil;
import com.qa.AutoloadAI.pages.HomePage;
import com.qa.AutoloadAI.pages.LoginPage;

public class BaseTest {

	PlaywrightFactory pf;
	protected Page page;
	protected Properties prop;

	protected HomePage homePage;
	protected LoginPage loginPage;
	//protected ExecuteScriptPage executescriptpage;

	@Parameters({ "browser" })
	@BeforeTest
	public void setup(String browserName) {
		pf = new PlaywrightFactory();

		prop = pf.init_prop();

		if (browserName != null) {
			prop.setProperty("browser", browserName);
		}

		page = pf.initBrowser(prop);
		homePage = new HomePage(page);
		loginPage = new LoginPage(page);
	//	executescriptpage = new ExecuteScriptPage(page);
		 // Initialize ScreenshotUtil and set in ExtentReportListener
      ScreenshotUtil screenshotUtil = new ScreenshotUtil(page);
      ExtentReportListener.setScreenshotUtil(screenshotUtil);
	}

	@AfterTest
	public void tearDown() {
		page.context().browser().close();
			
	}
}
