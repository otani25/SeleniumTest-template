package test.common;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class CommonManager {

    protected String browserName;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Properties testInfo;
    protected String baseURL;

    public CommonManager(String browserName, WebDriver driver, Properties testInfo) {
        this.browserName = browserName;
        this.driver = driver;
        this.testInfo = testInfo;
        this.baseURL = testInfo.getProperty("baseURL");
        this.wait = new WebDriverWait(driver, 10);
    }

    public void beforeTestClass() {
    }

    public void afterTestClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
