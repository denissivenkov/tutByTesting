package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
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

    @DataProvider (name = "mailFormValidation")
    public Object[][] mailFormValidation () {
        return new Object [][] {
                {"Denis_Sivenkov", "asd", "Неверное имя пользователя или пароль"},
                {"Denis_Sivenaaasss", "qweasd", "Неверное имя пользователя или пароль"},
        };
    }


    @Test (dataProvider = "mailFormValidation", enabled = false)
    public void mailFieldsValidation (String name, String email, String expected) {
        mainPage.goToMailPage();
        mailPage.invalidCredentials(name, email);
        Assert.assertEquals(expected, mailPage.getMailValidationText());
    }


}
