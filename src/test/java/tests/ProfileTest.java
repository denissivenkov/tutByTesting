package tests;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MailPage;
import pages.MainPage;
import pages.ProfilePage;

/**
 * Created by sivenkovdn on 23.06.2016.
 */
public class ProfileTest extends BaseTest {

    @Override
    public void initPages() {
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mailPage = PageFactory.initElements(driver, MailPage.class);
        profilePage = PageFactory.initElements(driver, ProfilePage.class);

    }

    @DataProvider (name = "registrationValidation")
    public Object[][] RegistrationValidation () {
        return new Object [][] {
                {"", "asd", "abrabrak", "qweasd11", "qweasd11","true", "male", "Минск", "Иванова", "+375441234567","Не введено имя"},
                {"asd", "", "abrabrak", "qweasd11", "qweasd11","true", "male", "Минск", "Иванова", "+375441234567","Не введена фамилия"},
                {"asd", "asd", "", "qweasd11", "qweasd11","true", "male", "Минск", "Иванова", "+375441234567","Не введен логин"},
                {"asd", "asd", "abrabrak", "", "qweasd11","true", "male", "Минск", "Иванова", "+375441234567", "Пароль должен состоять минимум из 8 символов"},
                {"asd", "asd", "abrabrak", "qweasd11", "","true", "male", "Минск", "Иванова", "+375441234567","Пароль и проверочный пароль не совпадают"},
                {"asd", "asd", "abrabrak", "qweasd11", "qweasd11","true", "", "Минск", "Иванова", "+375441234567","Не выбран пол"},
                {"asd", "asd", "abrabrak", "qweasd11", "qweasd11","true", "male", "", "Иванова", "+375441234567","Не выбран город"},
                {"asd", "asd", "abrabrak", "qweasd11", "qweasd11","true", "male", "Минск", "", "+375441234567","Не введен ответ на секретный вопрос"},
                {"asd", "asd", "abrabrak", "qweasd11", "qweasd11","true", "male", "Минск", "Иванова","", "Не введён номер телефона"},
        };
    }

    @Test(dataProvider = "registrationValidation")
    public void RegistrationValidationTest (String firstName, String secondName, String login, String password1, String password2, String date, String gender, String city, String answer, String telNum, String expected ) {
        mainPage.goToMailPage();
        mailPage.goToRegistrationPage();
        profilePage.performRegistration(firstName, secondName, login, password1, password2, date, gender, city, answer, telNum);
        Assert.assertEquals(expected, profilePage.getErrorText(firstName, secondName, login, password1, password2, date, gender, city, answer, telNum));
    }
}
