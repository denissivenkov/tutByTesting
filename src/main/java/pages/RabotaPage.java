package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class RabotaPage extends BasePage {
    public RabotaPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitleText () {
        String title = driver.getTitle();
        return title;
    }

    public final String RABOTA_PAGE_TITLE = "TUT.BY | ВАША ПОЧТА ТУТ | Вход";

}
