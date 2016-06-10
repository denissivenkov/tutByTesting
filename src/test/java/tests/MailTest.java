package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import pages.*;

/**
 * Created by sivenkovdn on 09.06.2016.
 */
public class MailTest extends BaseTest {
    public void initPages () {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mailPage = PageFactory.initElements(driver, MailPage.class);
        rabotaPage = PageFactory.initElements(driver, RabotaPage.class);
        financePage = PageFactory.initElements(driver, FinancePage.class);
        afishaPage = PageFactory.initElements(driver, AfishaPage.class);
    }
}
