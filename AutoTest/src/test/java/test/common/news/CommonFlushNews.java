/**
*
* クラス名
*   CommonFlushNews.java
*
* 概要
*   Yahooのニュースキャプチャ取得を実行するブラウザ共通クラス
*/
package test.common.news;

import java.util.Properties;

import org.openqa.selenium.*;

import test.common.CommonManager;
import util.CaputureUtils;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class CommonFlushNews extends CommonManager {

    public CommonFlushNews( String browserName, WebDriver driver, String testInfoPath ) {
        super( browserName, driver, testInfoPath );
    }

    /**
     * 速報ニュースキャプチャ取得
     */
    public void flushNews() {
        driver.get( baseURL + "/" );
        driver.findElement( By.id( "topics" ) ).click();
        waitUntil( titleContains( "Yahoo!ニュース" ) );
        driver.findElement( By.linkText( "速報" ) ).click();
        waitUntil( titleContains( "速報" ) );

        String filePath = CaputureUtils.getFilePath( getClass().getName(), browserName, "flushNews" );
        CaputureUtils.getScreenshot( ( TakesScreenshot ) driver, filePath );
    }

}
