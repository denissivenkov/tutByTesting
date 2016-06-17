package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class MailPage extends BasePage {
    public MailPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public static final String MAIL_PAGE_TITLE = "TUT.BY | ВАША ПОЧТА ТУТ | Вход";

    final String USER_NAME_FIELD = ".//*[@id='Username']";
    @FindBy(xpath = USER_NAME_FIELD)
    private WebElement userNameField;

    final String PASSWORD_FIELD = ".//*[@id='Password']";
    @FindBy(xpath = PASSWORD_FIELD)
    private WebElement passwordField;

    final String FORGET_PASSWORD_LINK = ".//div[@class='forgot']/a";
    @FindBy(xpath = FORGET_PASSWORD_LINK)
    private WebElement forgetPasswordLink;

    final String ENTER_BUTTON = ".//input[@class ='button loginButton gradientforbutton']";
    @FindBy(xpath = ENTER_BUTTON)
    private WebElement enterButton;

    final String REGISTRATION_BUTTON = ".//span[@class ='button linkRegButton gradientforbutton']";
    @FindBy(xpath = REGISTRATION_BUTTON)
    private WebElement registrationButton;

    final String AUTO_LINK = ".//a[contains(@title, 'Авто')]";
    @FindBy(xpath = AUTO_LINK)
    private WebElement autoLink;

    final String LADY_LINK = ".//a[contains(@title, 'Леди')]";
    @FindBy(xpath = LADY_LINK)
    private WebElement ladyLink;

    final String RABOTA_LINK = ".//a[contains(@title, 'Поиск вакансий и резюме')]";
    @FindBy(xpath = RABOTA_LINK)
    private WebElement rabotaLink;

    final String AVIATICKETS_LINK = ".//a[contains(@title, 'Авиабилеты')]";
    @FindBy(xpath = AVIATICKETS_LINK)
    private WebElement aviaticketsLink;

    final String SHOPS_LINK = ".//a[contains(@title, 'Магазины')]";
    @FindBy(xpath = SHOPS_LINK)
    private WebElement shopsLink;

    final String SPORT_LINK = ".//a[contains(@title, 'Спорт')]";
    @FindBy(xpath = SPORT_LINK)
    private WebElement sportLink;

    final String AUKCION_LINK = ".//a[contains(@title, 'Аукционы')]";
    @FindBy(xpath = AUKCION_LINK)
    private WebElement aukcionLink;

    final String NEDVIZ_LINK = ".//a[contains(@title, 'Недвижимость')]";
    @FindBy(xpath = NEDVIZ_LINK)
    private WebElement nedvizLink;

    public String getTitleText () {
        String title = driver.getTitle();
        return title;
    }

    public void goToRabotaPage () {
        log.info("Navigate to Rabota page");
        waitForElement(RABOTA_LINK);
        rabotaLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Rabota page");
    }

    public void goToAutoPage () {
        log.info("Navigate to Auto page");
        waitForElement(AUTO_LINK);
        autoLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Auto page");
    }

    public void goToAukcionPage () {
        log.info("Navigate to Aukcion page");
        waitForElement(AUKCION_LINK);
        aukcionLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Aukcion page");
    }

    public void goToLadyPage () {
        log.info("Navigate to Lady page");
        waitForElement(LADY_LINK);
        ladyLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Lady page");
    }

    public void goToAviaTicketsPage () {
        log.info("Navigate to Avia Tickets page");
        waitForElement(AVIATICKETS_LINK);
        aviaticketsLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Avia Tickets page");
    }

    public void goToShopsPage () {
        log.info("Navigate to Shops page");
        waitForElement(SHOPS_LINK);
        shopsLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Shops page");
    }

    public void goToSportPage () {
        log.info("Navigate to Shops page");
        waitForElement(SPORT_LINK);
        sportLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Sport page");
    }

    public void goToNedvizPage () {
        log.info("Navigate to Nedviz page");
        waitForElement(NEDVIZ_LINK);
        nedvizLink.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Nedviz page");
    }

    public void goToRegistrationPage () {
        log.info("Navigate to Registration page");
        waitForElement(REGISTRATION_BUTTON);
        registrationButton.click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        log.info("User is on Registration page");
    }



}
