package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class MainPage extends BasePage {
    public  MainPage (WebDriver driver) {super(driver);}

    public final static String MAIN_PAGE_HEADER = "Белорусский портал TUT.BY";

    final String MAIL_LINK = ".//*[@id='mainmenu']/ul/li/a[contains(text(), 'Почта') ]";
    @FindBy(xpath = MAIL_LINK)
    private WebElement mailLink;

    final String FINANCE_LINK = ".//*[@id='mainmenu']/ul/li/a[contains(text(), 'Финансы') ]";
    @FindBy(xpath = FINANCE_LINK)
    private WebElement financeLink;

    final String AFISHA = ".//*[@id='mainmenu']/ul/li/a[contains(text(), 'Афиша') ]";
    @FindBy(xpath = AFISHA)
    private WebElement afisha;

    final String RABOTA = ".//*[@id='mainmenu']/ul/li/a[contains(text(), 'Работа') ]";
    @FindBy(xpath = RABOTA)
    private WebElement rabota;






}
