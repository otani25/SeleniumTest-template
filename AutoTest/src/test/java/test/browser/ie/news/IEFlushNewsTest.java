/**
*
* クラス名
*   IEFlushNewsTest.java
*
* 概要
*   Yahooニュースキャプチャ取得をIEブラウザで実行するクラス
*/
package test.browser.ie.news;

import org.junit.Test;

import browser.ie.BrowserIEDriver;
import test.common.news.CommonFlushNews;

public class IEFlushNewsTest extends BrowserIEDriver {

    private CommonFlushNews newsTest;

    /**
     * ブラウザオプション設定
     */
    @Override
    protected void setupProfile() {
    }

    /**
     * IEブラウザで動作するテストインスタンス生成
     */
    @Override
    public void preTest() {
        super.preTest();
        newsTest = new CommonFlushNews( "IE", getDriver(), "testInfo/news.properties" );
    }

    /**
     * 速報ニュースキャプチャ取得
     */
    @Test
    public void flushNews() {
        newsTest.flushNews();
    }

}
