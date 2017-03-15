package test.browser.firefox.news;

import org.junit.Test;

import test.browser.firefox.BrowserFirefoxDriver;
import test.common.news.CommonFlushNews;

/**
 * Firefoxのニュース画面テスト
 */
public class FFFlushNewsTest extends BrowserFirefoxDriver {

    private CommonFlushNews newsTest;

    @Override
    protected void setupProfile() {
        profile.setEnableNativeEvents(true);
    }

    @Override
    public void preTest() {
        super.preTest();
        newsTest = new CommonFlushNews("Firefox", getDriver(), getTestInfo());
    }

    // ニュースのテスト
    @Test
    public void flushNews() {
    	newsTest.flushNews();
    }

	@Override
	protected String getinitialURL() {
		// TODO Auto-generated method stub
		return null;
	}
}
