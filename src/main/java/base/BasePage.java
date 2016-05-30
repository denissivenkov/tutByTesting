package base;

import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by sivenkovdn on 24.05.2016.
 */
public class BasePage {
    protected WebDriver driver;
    public BasePage (WebDriver driver) {this.driver=driver;}
    protected final String BASE_URL = "http://tut.by";

    public boolean isElementPresent(String by) {
        try {
            log.info("Find element with locator: " + by);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            List<WebElement> list = driver.findElements(By.xpath(by));
            if (list.size() == 0) {
                log.info("Can't find an element with locator: " + by);
                return false;
            } else {
                log.info("Element with locator: " + by + " was found");
                return true;
            }
        }catch(UnhandledAlertException e){
            alertHandler();
            return isElementPresent(by);
        }
        finally {
            driver.manage().timeouts().implicitlyWait(PAUSE_LENGTH.AJAX.value(), TimeUnit.SECONDS);
        }
    }

    public void waitForElement(String xpath) {
        for (int second = 0; ; second++) {
            if (second >= 60)
                throw new NoSuchElementException("timeout");
            if (isElementPresent(xpath))
                break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void alertHandler() {
        if (isAlertDisplayed()) {
            Alert alert = driver.switchTo().alert();
            log.warn("Alert present! " + alert.getText());
            alert.accept();
        }
    }

    private boolean isAlertDisplayed() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }



}
