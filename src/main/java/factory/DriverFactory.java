package factory;

import com.microsoft.playwright.*;

import java.util.List;

public class DriverFactory {

    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    public static Page getBrowser() {
        browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions()
                .setChannel("chrome")
                .setHeadless(Boolean.parseBoolean(System.getenv("headless")))
                .setArgs(List.of("--start-maximized", "--use-gl=egl")));
        if(System.getenv("headless").equals("true")){
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920, 1080));
        } else{
            context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
        }
        page = context.newPage();
        return page;
    }
}
