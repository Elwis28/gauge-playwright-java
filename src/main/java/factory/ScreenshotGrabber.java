package factory;

import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;

import static factory.DriverFactory.page;

public class ScreenshotGrabber implements ICustomScreenshotGrabber {
    @Override
    public byte[] takeScreenshot() {
        return page.screenshot();
    }
}
