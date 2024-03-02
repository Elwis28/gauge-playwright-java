package factory;

import com.microsoft.playwright.Page;

public class InitializeBrowser {

    public static Page page;

    public InitializeBrowser(){
        page = DriverFactory.getBrowser();
    }
}
