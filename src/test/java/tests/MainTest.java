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
    public void initPages() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mailPage = PageFactory.initElements(driver, MailPage.class);
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        rabotaPage = PageFactory.initElements(driver, RabotaPage.class);
        financePage = PageFactory.initElements(driver, FinancePage.class);
        afishaPage = PageFactory.initElements(driver, AfishaPage.class);
    }

    @Test
    public void checkMailPageIsOpened() {
        mainPage.goToMailPage();
        Assert.assertEquals(driver.getTitle(), MailPage.MAIL_PAGE_TITLE);
    }

    @Test(enabled = false)
    public void checkRabotaPageIsOpened() {
        mainPage.goToRabotaPage();
        Assert.assertEquals(driver.getTitle(), RabotaPage.RABOTA_PAGE_TITLE);
    }

    @Test(enabled = false)
    public void checkFinancePageIsOpened() {
        mainPage.goToFinancePage();
        Assert.assertEquals(driver.getTitle(), FinancePage.FINANCE_PAGE_TITLE);
    }

    @Test(enabled = false)
    public void checkAfishaPageIsOpened() {
        mainPage.goToAfishaPage();
        Assert.assertEquals(driver.getTitle(), AfishaPage.AFISHA_PAGE_TITLE);
    }

    @Test(enabled = false)
    public void successfulSearch() {
        mainPage.performSearch("Минск");
        Assert.assertEquals(driver.getTitle(), "TUT.BY | ПОИСК - Интернет - Минск");
    }

    @Test(enabled = false)
    public void unseccessfullSearh() {
        mainPage.performSearch("впрвпрвпрвпрвпрвпрвпрвпрвпрвпрвпрвпр");
        String errorMessage = searchPage.getUNSUCCESSFUL_MESSAGE();
        Assert.assertEquals(errorMessage, "Искомая комбинация слов нигде не встречается.");


    }


}
