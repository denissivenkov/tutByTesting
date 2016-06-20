package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivenkovdn on 30.05.2016.
 */
public class FinancePage extends BasePage {
    public FinancePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public static final String FINANCE_PAGE_TITLE = "FINANCE.TUT.BY - Курсы валют, кредиты и вклады, депозиты, курсы обмена валют, форекс";


}
