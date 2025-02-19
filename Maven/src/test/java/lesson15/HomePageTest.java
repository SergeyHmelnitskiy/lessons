package lesson15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{

    @Test
    @DisplayName("Поиск блока 'Онлайн пополнение без комиссии'")
    public void testOnlineTopUpBlock() {
        Assertions.assertEquals(homePage.isOnLineTopUpBlockDisplayed(),"Онлайн пополнение\nбез комиссии", "Блок Онлайн пополнения не найден");

    }

    @Test
    @DisplayName("Поиск логотипов платежных систем")
    public void testPaymentSystemLogos() {
        Assertions.assertTrue(homePage.isVisaLogoDisplayed(), "Логотип Visa должен отображаться");
        Assertions.assertTrue(homePage.isVisaByLogoDisplayed(), "Логотип Verified By Visa должен отображаться");
        Assertions.assertTrue(homePage.isMasterCardLogoDisplayed(), "Логотип MasterCard должен отображаться");
        Assertions.assertTrue(homePage.isMasterCardSCLogoDisplayed(), "Логотип MasterCard Secure Code должен отображаться");
        Assertions.assertTrue(homePage.isBelCardLogoDisplayed(), "Логотип Белкарт должен отображаться");
    }

    @Test
    @DisplayName("Проверка перехода по ссылки 'Подробнее о сервисе")
    public void testMoreAboutServiceLink() {
        homePage.clickMoreAboutService();
        String PageURL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        Assertions.assertTrue(homePage.isMoreAboutServicePageOpened(PageURL), "Страница 'Подробнее о сервисе' должна открываться");
    }

    @Test
    @DisplayName("Проверка, что форма открывается")
    public void testFillFormAndContinue() {
        homePage.fillFormAndContinue("297777777", "5");

        Assertions.assertTrue(homePage.isModalVisible(), "Модальное окно должно быть видимо");
    }
}
