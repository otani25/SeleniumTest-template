/**
*
* クラス名
*   FFFlushNewsTest.java
*
* 概要
*   Yahooニュースキャプチャ取得をFireFoxブラウザで実行するクラス
*/
package test.browser.firefox.news;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

import browser.firefox.BrowserFirefoxDriver;
import test.common.news.CommonFlushNews;

/**
 * FireFoxのニュース画面テスト
 */
public class FFFlushNewsTest extends BrowserFirefoxDriver {

    private CommonFlushNews newsTest;
    private static Logger LOG = Logger.getLogger( FFFlushNewsTest.class.getName() );

    /**
     * ブラウザオプション設定
     */
    @Override
    protected void setupProfile() {
        profile.setEnableNativeEvents( true );
    }

    /**
     * FireFoxブラウザで動作するテストインスタンス生成
     */
    @Override
    public void preTest() {
        super.preTest();
        newsTest = new CommonFlushNews( "Firefox", getDriver(), "testInfo/news.properties" );
    }

    /**
     * 速報ニュースキャプチャ取得
     */
    @Test
    public void flushNews() {
        LOG.log( Level.INFO, "【Firefox】test" );
        newsTest.flushNews();
    }
}
