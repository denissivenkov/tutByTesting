package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by sivenkovdn on 09.06.2016.
 */
public class MainTest extends BaseTest {



    @Override
    public void initPages () {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mailPage = PageFactory.initElements(driver, MailPage.class);
    }

    @Test
    public void CheckMailPageIsOpened () {
        mainPage.goToMailPage();
        Assert.assertEquals(MailPage.MAIL_PAGE_TITLE, driver.getTitle());
    }




}
