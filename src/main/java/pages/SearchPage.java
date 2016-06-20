package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

/**
 * Created by sivenkovdn on 20.06.2016.
 */
public class SearchPage extends BasePage {
    public SearchPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    final String UNSUCCESSFUL_MESSAGE = ".//div/b[contains(text(), 'Искомая комбинация слов нигде не встречается')]";
    @FindBy(xpath = UNSUCCESSFUL_MESSAGE)
    private WebElement unseccessfulMessage;

    public String getUNSUCCESSFUL_MESSAGE () {
        log.info("Checking error message presence");
        waitForElement(UNSUCCESSFUL_MESSAGE);
        String result = unseccessfulMessage.getText();
        return result;
    }


}
