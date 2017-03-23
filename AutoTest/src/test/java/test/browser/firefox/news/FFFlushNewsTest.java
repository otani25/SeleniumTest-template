package test.browser.firefox.news;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import test.browser.firefox.BrowserFirefoxDriver;
import test.common.news.CommonFlushNews;

/**
 * FireFoxのニュース画面テスト
 */
public class FFFlushNewsTest extends BrowserFirefoxDriver {

    private CommonFlushNews newsTest;
    private static Logger LOG = Logger.getLogger(FFFlushNewsTest.class.getName()); 

    @Override
    protected void setupProfile() {
        profile.setEnableNativeEvents(true);
    }

    @Override
    public void preTest() {
        super.preTest();
        newsTest = new CommonFlushNews("Firefox", getDriver(), "testInfo/news.properties");
    }

    // ニュースのテスト
    @Test
    public void flushNews() {
    	LOG.log(Level.INFO, "【Firefox】test");
    	newsTest.flushNews();
    }
}
