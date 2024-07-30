
package com.qa.AutoloadAI.pages;

import java.util.List;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class ExecuteScriptPage {

	private Page page;

	// 1. String Locators - OR
	private String executeIcon = "(//span[contains(text(),'WebLoadMPStore_')])[1]/following::td[3]//button/span[@role='img']";
	private String selectReleaseID = "//input[@aria-owns='rc_select_5_list']/following::span[1]";
	private String relo1Option = "text='Rel01' >> div";
    private String loadButton = "text='LOAD'";

    private String loadGeneratorDropdown = ".ant-select-selection-overflow";
    private String loadGeneratorOption = "text='LoadGenerator-India'";
    private String runDescriptionField = "input[placeholder='Run Description']";
    private String vUserField = "input[placeholder='VUser']";
    private String rampUpDurationField = "input[placeholder='Ramp Up Duration']";
    private String testDurationField = "input[placeholder='Test Duration']";
    private String initialDelayField = "input[placeholder='Initial Delay']";
    private String executeButton = "text='play-circle Execute'";
    private String reloadButton = "text='reload'";

	// 2. page constructor:

	public ExecuteScriptPage(Page page) {
		this.page = page;
	}

	// 3. page actions/methodsselector_for_play_button

	public void clickPlayButton() {
		page.click(executeIcon);

	}

	public void clickSelect1() {
		page.click("#rc_select_1");
	//	page.click(relo1Option);
		//page.click("//div[@class='ant-select-item-option-content']");
		//page.click("text=Relo1");
		page.keyboard().press("Enter");
	}


    public void clickLoadButton() {
       // page.click(loadButton);
    	page.click("#rc_select_2");
    	page.keyboard().press("Enter");
    }

    public void selectLoadGenerator() {
        page.click(loadGeneratorDropdown);
        page.click(loadGeneratorOption);
    }

    public void fillRunDetails(String runDescription, String vUser, String rampUpDuration, String testDuration, String initialDelay) {
        page.fill(runDescriptionField, runDescription);
        page.fill(vUserField, vUser);
        page.fill(rampUpDurationField, rampUpDuration);
        page.fill(testDurationField, testDuration);
        page.fill(initialDelayField, initialDelay);
    }

    public void clickExecuteButton() {
       // page.click(executeButton);
      //  page.click("//span[text()='Execute']");
        page.click("(//span[text()='Execute'])");
    }

 //   public void clickReloadButton() {
   //     page.click(reloadButton);
    	//page.click("//button[@class='ant-btn css-byeoj0 ant-btn-primary execute-button']//span[@aria-label='play-circle']//*[name()='svg']");
    	
    //	page.click("//span[text()='Execute']");
    }



