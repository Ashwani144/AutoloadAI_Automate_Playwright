package com.qa.AutoloadAI.listeners;
import java.nio.file.Paths;
import java.util.Base64;
import com.microsoft.playwright.Page;

public class ScreenshotUtil {
    private Page page;

    public ScreenshotUtil(Page page) {
        this.page = page;
    }

    public String takeScreenshot() { 
        String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
        
        byte[] buffer = page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
        String base64Path = Base64.getEncoder().encodeToString(buffer);
        
        return base64Path; 
    }
}




