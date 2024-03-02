package factory;

import com.microsoft.playwright.Page;
import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;

public class ScreenshotGrabber implements ICustomScreenshotGrabber {
    private Page page;

    public ScreenshotGrabber(Page page) {
        this.page = page;
    }

    @Override
    public byte[] takeScreenshot() {
        return page.screenshot();
    }
}
