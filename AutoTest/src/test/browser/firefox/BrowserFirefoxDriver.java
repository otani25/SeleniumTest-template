package test.browser.firefox;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import test.browser.BrowserTestBase;


public abstract class BrowserFirefoxDriver extends BrowserTestBase {

    protected static FirefoxProfile profile;

    @Override
    protected void initDriver() {
        profile = new FirefoxProfile();
        setupProfile();

    	System.setProperty("webdriver.gecko.driver", getTestInfo().getProperty("geckodriver"));
        // 作成したプロファイルでFirefox(のドライバー)を起動する
        driver = new FirefoxDriver(profile);
    }

    abstract protected void setupProfile();
}
