package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sivenkovdn on 23.06.2016.
 */
public class ProfilePage extends BasePage {
    public ProfilePage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    final String FIRST_NAME_FIELD = ".//*[@id='FirstName']";
    @FindBy(xpath = FIRST_NAME_FIELD)
    private WebElement nameField;

    final String SECOND_NAME_FIELD = ".//*[@id='SecondName']";
    @FindBy(xpath = SECOND_NAME_FIELD)
    private WebElement secondNameField;

    final String LOGIN_FIELD = ".//*[@id='Username']";
    @FindBy(xpath = LOGIN_FIELD)
    private WebElement loginField;

    final String PASSWORD_FIELD = ".//*[@id='Password1']";
    @FindBy(xpath = PASSWORD_FIELD )
    private WebElement passwordField;

    final String PASSWORD_CONFIRM_FIELD = ".//*[@id='Password2']";
    @FindBy(xpath = PASSWORD_CONFIRM_FIELD )
    private WebElement passwordConfirmField;

    final String DAY_SELECTOR = ".//select[@id = '_3_1']";
    @FindBy(xpath = DAY_SELECTOR)
    private WebElement daySelector;

    final String MONTH_SELECTOR = ".//select[@id = '_3_2']";
    @FindBy(xpath = MONTH_SELECTOR)
    private WebElement monthSelector;

    final String YEAR_SELECTOR = ".//select[@id = '_3_3']";
    @FindBy(xpath = YEAR_SELECTOR)
    private WebElement yearSelector;

    final String MALE_SEX_CHECKBOX =".//*[@id='msex']";
    @FindBy(xpath = MALE_SEX_CHECKBOX)
    private WebElement maleSexCheckbox;

    final String FEM_SEX_CHECKBOX =".//*[@id='fsex']";
    @FindBy(xpath = FEM_SEX_CHECKBOX)
    private WebElement femSexCheckbox;

    final String CITY_FIELD =".//*[@id='city_div0']";
    @FindBy(xpath = CITY_FIELD)
    private WebElement cityField;

    final String CITY_SELECT_CONFIRMATION =".//*[@id='city_select']";
    @FindBy(xpath = CITY_SELECT_CONFIRMATION)
    private WebElement cityConfirmation;

    final String SECRET_ANSWER_FIELD =".//*[@id='Answer']";
    @FindBy(xpath = SECRET_ANSWER_FIELD)
    private WebElement answerField;

    final String TELEPHONE_NUMBER_FIELD =".//*[@id='ForgotPasswordPhone']";
    @FindBy(xpath = TELEPHONE_NUMBER_FIELD)
    private WebElement telNumberField;

    final String CATCHUP_TEXT_FIELD =".//*[@id='ap_word']";
    @FindBy(xpath = CATCHUP_TEXT_FIELD)
    private WebElement catchupField;

    final String REGISTRATION_SUBMIT_BURRON =".//*[@id='reg_btn']";
    @FindBy(xpath = REGISTRATION_SUBMIT_BURRON)
    private WebElement registrationSubmitButton;

    final String FIRST_NAME_EMPTY_ERROR_MESSAGE =".//*[@id='idFirstNameMessage']";
    @FindBy(xpath = FIRST_NAME_EMPTY_ERROR_MESSAGE)
    private WebElement firstNameEmptyError;

    final String SECOND_NAME_EMPTY_ERROR_MESSAGE =".//*[@id='idSecondNameMessage']";
    @FindBy(xpath = SECOND_NAME_EMPTY_ERROR_MESSAGE)
    private WebElement secondNameEmptyError;

    final String LOGIN_EMPTY_ERROR_MESSAGE =".//*[@id='idCheckFreeMessage']";
    @FindBy(xpath = LOGIN_EMPTY_ERROR_MESSAGE)
    private WebElement loginEmptyError;

    final String PASSWORD1_EMPTY_ERROR_MESSAGE =".//*[@id='idPasswordMessage']";
    @FindBy(xpath = PASSWORD1_EMPTY_ERROR_MESSAGE)
    private WebElement password1EmptyError;

    final String PASSWORD2_EMPTY_ERROR_MESSAGE =".//*[@id='idPasswordMessage']";
    @FindBy(xpath = PASSWORD2_EMPTY_ERROR_MESSAGE)
    private WebElement password2EmptyError;

    final String DATE_EMPTY_ERROR_MESSAGE =".//*[@id='idBirthMessage']";
    @FindBy(xpath = DATE_EMPTY_ERROR_MESSAGE)
    private WebElement dateEmptyError;

    final String GENDER_EMPTY_ERROR_MESSAGE =".//*[@id='idGenderMessage']";
    @FindBy(xpath = GENDER_EMPTY_ERROR_MESSAGE)
    private WebElement genderEmptyError;

    final String CITY_EMPTY_ERROR_MESSAGE =".//*[@id='idLocationMessage']";
    @FindBy(xpath = CITY_EMPTY_ERROR_MESSAGE)
    private WebElement cityEmptyError;

    final String ANSWER_EMPTY_ERROR_MESSAGE =".//*[@id='idAnswerMessage']";
    @FindBy(xpath = ANSWER_EMPTY_ERROR_MESSAGE)
    private WebElement answerEmptyError;

    final String TELNUM_EMPTY_ERROR_MESSAGE =".//*[@id='idPhoneMessage']";
    @FindBy(xpath = TELNUM_EMPTY_ERROR_MESSAGE)
    private WebElement telNumEmptyError;







    public void performRegistration (String firstName, String secondName, String login, String password1, String password2, String date, String gender, String city, String anser, String telNum ) {
        waitForElement(FIRST_NAME_FIELD);
        if (!firstName.equals("")) {
            nameField.clear();
            nameField.sendKeys(firstName);
        }

        waitForElement(SECOND_NAME_FIELD);
        if (!secondName.equals("")) {
            secondNameField.clear();
            secondNameField.sendKeys(secondName);
        }

        waitForElement(LOGIN_FIELD);
        if (!login.equals("")) {
            loginField.clear();
            loginField.sendKeys(login);
        }

        waitForElement(PASSWORD_FIELD);
        if (!password1.equals("")) {
            passwordField.clear();
            passwordField.sendKeys(password1);
        }

        waitForElement(PASSWORD_FIELD);
        if (!password2.equals("")) {
            passwordConfirmField.clear();
            passwordConfirmField.sendKeys(password2);
        }

        waitForElement(DAY_SELECTOR);
        waitForElement(MONTH_SELECTOR);
        waitForElement(YEAR_SELECTOR);
        if (!date.equals("")) {
            Select drpDay = new Select(daySelector);
            drpDay.selectByValue("14");
            Select drpMonth = new Select(monthSelector);
            drpMonth.selectByValue("2");
            Select drpYear = new Select (yearSelector);
            drpYear.selectByValue("1989");
        }

        waitForElement(MALE_SEX_CHECKBOX);
        if (!gender.equals("") & !maleSexCheckbox.isSelected()) {
            maleSexCheckbox.click();
        }

        waitForElement(CITY_FIELD);
        if (!city.equals("")) {
            cityField.clear();
            cityField.sendKeys(city);
        }

        waitForElement(SECRET_ANSWER_FIELD);
        if (!anser.equals("")) {
            answerField.clear();
            answerField.sendKeys(anser);
        }

        waitForElement(TELEPHONE_NUMBER_FIELD);
        if (!telNum.equals("")) {
            telNumberField.clear();
            telNumberField.sendKeys(telNum);
        }

        waitForElement(REGISTRATION_SUBMIT_BURRON);
        registrationSubmitButton.click();
    }


    public String getErrorText(String firstName, String secondName, String login, String password1, String password2, String date, String gender, String city, String answer, String telNum ) {
        if ("".equals(firstName)) {
            waitForElement(FIRST_NAME_EMPTY_ERROR_MESSAGE);
            log.info("check for 'FIRST NAME ERROR MESSAGE'");
            return firstNameEmptyError.getText();
        } else if ("".equals(secondName)) {
            waitForElement(SECOND_NAME_EMPTY_ERROR_MESSAGE);
            log.info("check for 'SECOND NAME ERROR MESSAGE'");
            return secondNameEmptyError.getText();
        } else if ("".equals(login)) {
            waitForElement(LOGIN_EMPTY_ERROR_MESSAGE);
            log.info("check for 'LOGIN ERROR MESSAGE'");
            return loginEmptyError.getText();
        } else if ("".equals(password1)) {
            waitForElement(PASSWORD1_EMPTY_ERROR_MESSAGE);
            log.info("check for 'PASSWORD1 ERROR MESSAGE'");
            return password1EmptyError.getText();
        } else if ("".equals(password2)) {
            waitForElement(PASSWORD2_EMPTY_ERROR_MESSAGE);
            log.info("check for 'PASSWORD2 ERROR MESSAGE'");
            return password2EmptyError.getText();
        } else if ("".equals(date)) {
            waitForElement(DATE_EMPTY_ERROR_MESSAGE);
            log.info("check for 'DATE ERROR MESSAGE'");
            return dateEmptyError.getText();
        } else if ("".equals(gender)) {
            waitForElement(GENDER_EMPTY_ERROR_MESSAGE);
            log.info("check for 'GENDER ERROR MESSAGE'");
            return genderEmptyError.getText();}
        else if ("".equals(city)) {
            waitForElement(CITY_EMPTY_ERROR_MESSAGE);
            log.info("check for 'CITY ERROR MESSAGE'");
            return cityEmptyError.getText();
        } else if ("".equals(answer)) {
            waitForElement(ANSWER_EMPTY_ERROR_MESSAGE);
            log.info("check for 'ANSWER ERROR MESSAGE'");
            return answerEmptyError.getText();
        } else {
            waitForElement(telNum);
            log.info("check for 'TELEPHONE NUMBER ERROR MESSAGE'");
            return telNumEmptyError.getText();

        }
    }






}
