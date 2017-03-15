package test.common.news;

import java.util.Properties;

import org.openqa.selenium.*;

import test.common.CommonManager;
import util.CaputureUtils;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class CommonFlushNews extends CommonManager {

	public CommonFlushNews(String browserName, WebDriver driver, Properties testInfo) {
		super(browserName, driver, testInfo);
		// TODO Auto-generated constructor stub
	}

  public void flushNews() {
    driver.get(baseURL + "/");
    driver.findElement(By.id("topics")).click();
    wait.until(titleContains("Yahoo!ニュース"));
    driver.findElement(By.linkText("速報")).click();
    wait.until(titleContains("速報"));
    
    String filePath = CaputureUtils.getFilePath(getClass().getName(), browserName, "flushNews");
    CaputureUtils.getScreenshot((TakesScreenshot) driver, filePath);
  }

 

}
