package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class MailPage extends BasePage {
    public MailPage (WebDriver driver) {super(driver);}

    public final String MAIL_PAGE_TITLE = "TUT.BY | ВАША ПОЧТА ТУТ | Вход";

    final String USER_NAME_FIELD = ".//*[@id='Username']";
    @FindBy(xpath = USER_NAME_FIELD)
    private WebElement userNameField;

    final String PASSWORD_FIELD = ".//*[@id='Password']";
    @FindBy(xpath = PASSWORD_FIELD)
    private WebElement passwordField;

    final String FORGET_PASSWORD_LINK = ".//div[@class='forgot']/a";
    @FindBy(xpath = FORGET_PASSWORD_LINK)
    private WebElement forgetPasswordLink;
}
