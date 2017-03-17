package test.browser;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BrowserTestBase {

    protected static WebDriver driver;
    protected static Properties prop;
    protected static DesiredCapabilities  capabilities;

    @BeforeClass
    public static void beforeClass() {
        // load properties
        prop = new Properties();
        try {
		    prop.load(new FileInputStream("testdata.properties"));
        } catch (IOException e) {
		    e.printStackTrace();
		    return;
		}
    }

    @Before
    public void preTest() {
        if (driver != null) {
//            return;
        	driver = null;
        }
        initDriver();
    }

    @After
    public void postTest() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
    
    public static Properties getTestInfo() {
    	return prop;
    }

    abstract protected void initDriver();

    abstract protected String getinitialURL();

}
