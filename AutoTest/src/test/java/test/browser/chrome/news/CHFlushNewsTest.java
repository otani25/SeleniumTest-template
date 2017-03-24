/**
*
* クラス名
*   CHFlushNewsTest.java
*
* 概要
*   Yahooニュースキャプチャ取得をChromeブラウザで実行するクラス
*/
package test.browser.chrome.news;

import org.junit.Test;

import browser.chrome.BrowserChromeDriver;
import test.common.news.CommonFlushNews;

public class CHFlushNewsTest extends BrowserChromeDriver {

    private CommonFlushNews newsTest;

    @Override
    protected void setupProfile() {
    }

    /**
     * Chromeブラウザで動作するテストインスタンス生成
     */
    @Override
    public void preTest() {
        super.preTest();
        newsTest = new CommonFlushNews("Chrome", getDriver(), "testInfo/news.properties");
    }

    /**
     * 速報ニュースキャプチャ取得
     */
    @Test
    public void flushNews() {
    	newsTest.flushNews();
    }

}
