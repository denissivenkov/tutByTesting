package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class MainPage extends BasePage {
    public  MainPage (WebDriver driver) {super(driver);}

    public final static String MAIN_PAGE_HEADER = "Белорусский портал TUT.BY";

    public final static String UNSUCCESSFULL_SEARCH_ERROR = "Искомая комбинация слов нигде не встречается.";

    final String MAIL_LINK = "//a[contains(@href, 'http://mail.tut.by/#ua:top_menu_www.tut.by~1')]";
    @FindBy(xpath = MAIL_LINK)
    private WebElement mailLink;

    final String FINANCE_LINK = "//a[contains(@href, 'http://finance.tut.by/#ua:top_menu_www.tut.by~3')]"; //"//a[contains(@href, 'http://afisha.tut.by/#ua:top_menu_www.tut.by~5"')]"
    @FindBy(xpath = FINANCE_LINK)
    private WebElement financeLink;

    final String AFISHA_LINK = "//a[contains(@href, 'http://afisha.tut.by/#ua:top_menu_www.tut.by~5')]";
    @FindBy(xpath = AFISHA_LINK)
    private WebElement afishaLink;

    final String RABOTA = "//a[contains(@href, 'http://jobs.tut.by/#ua:top_menu_www.tut.by~7')]";
    @FindBy(xpath = RABOTA)
    private WebElement rabota;

    final String SEARCH_FIELD = ".//*[@id='search_from_str']";
    @FindBy(xpath = SEARCH_FIELD)
    private WebElement searchField;

    final String SEARCH_BUTTON = ".//*[@class='button big']";
    @FindBy(xpath = SEARCH_BUTTON)
    private WebElement searchButton;

    final String UNSUCCESSFUL_SEARCH_MESSAGE = ".//*[@class='col-i']/b";
    @FindBy(xpath = UNSUCCESSFUL_SEARCH_MESSAGE)
    private WebElement unsuccessfulSearchMessage;


    public void goToMailPage () {
        log.info("Navigate to Mail page");
        waitForElement(MAIL_LINK);
        mailLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Mail page");
    }

    public void goToFinancePage () {
        log.info("Navigate to Finance page");
        waitForElement(FINANCE_LINK);
        financeLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Finance page");
    }

    public void goToAfishaPage () {
        log.info("Navigate to Afisha page");
        waitForElement(AFISHA_LINK);
        afishaLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Afisha page");
    }

    public void goToRabotaPage () {
        log.info("Navigate to Rabota page");
        waitForElement(RABOTA);
        rabota.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Rabota page");
    }

    public void performSearch (String string) {
        log.info("Perform a search");
        waitForElement(SEARCH_FIELD);
        waitForElement(SEARCH_BUTTON);
        searchField.clear();
        searchField.sendKeys(string);
        searchButton.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

}
