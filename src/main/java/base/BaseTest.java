package base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;


/**
 * Created by sivenkovdn on 09.06.2016.
 */
public abstract class BaseTest {
    protected WebDriver driver;
    protected Logger log = Logger.getLogger(this.getClass().getName());
    protected final String BASE_URL = "http://tut.by/";
    public static String browser = "chrome";

    public AfishaPage afishaPage;
    public FinancePage financePage;
    public MailPage mailPage;
    public MainPage mainPage;
    public RabotaPage rabotaPage;
    public SearchPage searchPage;

    public abstract void initPages();

//    @BeforeTest
//    public void beforeTest() {
//        launch()
//    }
//
//    private static void launch() {
//        webDriver.set(DriverManageUtils.launchBrowser())
//        (webDriver.get() as WebDriver).manage().window().maximize();
//        (webDriver.get() as WebDriver).manage().window().setSize(targetSize);
//    }
//
//    def static WebDriver launchBrowser() {
//        def driver = null
//        (1..MAX_RETRY).find {
//            try {
//                driver = runBrowser()
//                true
//            } catch (Exception e) {
//                sleep(SLEEP_ON_FAIL)
//                FrameworkCore.log.warn("${e.class.simpleName} on - launchBrowser", e)
//                FrameworkCore.log.stackTrace(e)
//            }
//        }
//        return driver
//    }
//
//    private static WebDriver runBrowser() {
//        def browserToRun = FrameworkCore.browser
//        if (browserToRun == browsers.FIREFOX)
//            return runFirefox()
//        else if (browserToRun == browsers.CHROME)
//            return runChrome()
//        else if (browserToRun == browsers.IE)
//            return runIexplorer()
//        else throw new RuntimeException("Browser $browserToRun not in $browsers")
//    }
//
//    @AfterTest(alwaysRun = true)
//    public void afterTest() {
//        tearDown()
//    }

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            throw new IllegalArgumentException("The Browser Type is Undefined");
        }

        initPages();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        log.info("Set timeout fro 20 seconds");
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void shutDown() {
        driver.quit();
        log.info("Driver shut down");
    }
}
