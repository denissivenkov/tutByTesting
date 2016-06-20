package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class RabotaPage extends BasePage {

    public static final String RABOTA_PAGE_TITLE = "Работа в Минске, поиск работы в Беларуси. Вакансии и резюме на jobs.tut.by | РАБОТА.TUT.BY";

    public RabotaPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
