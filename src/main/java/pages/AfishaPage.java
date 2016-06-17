package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class AfishaPage extends BasePage {
    public AfishaPage(WebDriver driver) {super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitleText () {
        String title = driver.getTitle();
        return title;
    }
}
