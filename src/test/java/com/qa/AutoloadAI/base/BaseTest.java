package com.qa.AutoloadAI.base;

import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.qa.AutoloadAI.factory.PlaywrightFactory;
import com.qa.AutoloadAI.listeners.ExtentReportListener;
import com.qa.AutoloadAI.listeners.ScreenshotUtil;
import com.qa.AutoloadAI.pages.DeleteScriptPage;
import com.qa.AutoloadAI.pages.ExecuteScriptPage;
import com.qa.AutoloadAI.pages.HomePage;
import com.qa.AutoloadAI.pages.LoadGeneratorPage;
import com.qa.AutoloadAI.pages.LoginPage;
import com.qa.AutoloadAI.pages.ReleaseManagementPage;
import com.qa.AutoloadAI.pages.ReportScriptPage;
import com.qa.AutoloadAI.pages.UploadResultPage;

public class BaseTest {

	PlaywrightFactory pf;
	protected Page page;
	protected Properties prop;
	private Browser browser;
 
    private Playwright playwright;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected ExecuteScriptPage executescriptpage;
	protected ReportScriptPage reportscriptpage;
	protected DeleteScriptPage deletescriptPage;
	protected LoadGeneratorPage loadgeneratorPage;
	protected ReleaseManagementPage releasemanagementPage;
	protected UploadResultPage uploadresultPage;

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
        executescriptpage = new ExecuteScriptPage(page);
        reportscriptpage = new ReportScriptPage(page);
        deletescriptPage = new DeleteScriptPage(page);
        loadgeneratorPage =new LoadGeneratorPage(page);
        releasemanagementPage = new ReleaseManagementPage(page);
        uploadresultPage = new UploadResultPage(page);
        
		 // Initialize ScreenshotUtil and set in ExtentReportListener
      ScreenshotUtil screenshotUtil = new ScreenshotUtil(page);
      ExtentReportListener.setScreenshotUtil(screenshotUtil);
	}

	@AfterTest
	public void tearDown() {
		page.context().browser().close();
		//browser.close();
       // playwright.close();
			
	}
}
