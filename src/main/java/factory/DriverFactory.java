package factory;

import com.microsoft.playwright.*;

import java.util.List;

public class DriverFactory {

    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    public static Page getBrowser() {
        BrowserType browserType = Playwright.create().chromium();
        browser = browserType.launch(new BrowserType.LaunchOptions()
                .setChannel("chrome")
                .setHeadless(false)
                .setArgs(List.of("--start-maximized")));
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        page = context.newPage();
        return page;
    }
}
