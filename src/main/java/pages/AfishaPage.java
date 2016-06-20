package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class AfishaPage extends BasePage {

    public static final String AFISHA_PAGE_TITLE = "Афиша Минска и Беларуси - Кино, клубы, концерты, театры, выставки и цирк | АФИША.TUT.BY";

    public AfishaPage(WebDriver driver) {super(driver);
        PageFactory.initElements(driver, this);
    }


}
