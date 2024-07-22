package com.qa.AutoloadAI.pages;
import com.microsoft.playwright.Page;

public class ExecuteScriptPage {
	private Page page;

	// Locators
	private String playButton = "button[aria-label='play-circle']:nth-of-type(2)";
	private String reloadButton = "button[aria-label='reload']";
	private String select1 = "#rc_select_1";
	private String select2 = "#rc_select_2";
	private String loadOption = "div[title='Rel01']";
	private String loadText = "text=LOAD";
	private String loadGeneratorText = "text=LoadGenerator-India";
	private String runDescription = "input[placeholder='Run Description']";
	private String vUser = "input[placeholder='VUser']";
	private String rampUpDuration = "input[placeholder='Ramp Up Duration']";
	private String testDuration = "input[placeholder='Test Duration']";
	private String initialDelay = "input[placeholder='Initial Delay']";
	private String executeButton = "button[aria-label='play-circle Execute']";
	private String selectionOverflow = ".ant-select-selection-overflow";

	// Constructor
	public ExecuteScriptPage(Page page) {
	        this.page = page;
	    }

	// Actions/Methods
	public void clickPlayButton() {
		page.locator(playButton).click();
	}

	public void clickSelect1() {
		page.locator(select1).click();
	}

	public void clickSelect2() {
		page.locator(select2).click();
	}

	public void selectLoadOption() {
		page.locator(loadOption).click();
	}

	public void clickLoadText() {
		page.locator(loadText).click();
	}

	public void clickSelectionOverflow() {
		page.locator(selectionOverflow).click();
	}

	public void selectLoadGeneratorText() {
		page.locator(loadGeneratorText).click();
	}

	public void enterRunDescription(String description) {
		page.locator(runDescription).click();
		page.locator(runDescription).fill(description);
	}

	public void enterVUser(String users) {
		page.locator(vUser).click();
		page.locator(vUser).fill(users);
	}

	public void enterRampUpDuration(String duration) {
		page.locator(rampUpDuration).click();
		page.locator(rampUpDuration).fill(duration);
	}

	public void enterTestDuration(String duration) {
		page.locator(testDuration).click();
		page.locator(testDuration).fill(duration);
	}

	public void enterInitialDelay(String delay) {
		page.locator(initialDelay).click();
		page.locator(initialDelay).fill(delay);
	}

	public void clickExecuteButton() {
		page.locator(executeButton).click();
	}

	public void clickReloadButton() {
		page.locator(reloadButton).click();
	}

	public void waitForTimeout(int timeout) {
		page.waitForTimeout(timeout);
	}
}
