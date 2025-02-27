package lesson15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest{

    @Test
    @DisplayName("Поиск блока 'Онлайн пополнение без комиссии'")
    public void testOnlineTopUpBlock() {
        assertEquals(homePage.isOnLineTopUpBlockDisplayed(),"Онлайн пополнение\nбез комиссии", "Блок Онлайн пополнения не найден");

    }

    @Test
    @DisplayName("Поиск логотипов платежных систем")
    public void testPaymentSystemLogos() {
        assertTrue(homePage.isVisaLogoDisplayed(), "Логотип Visa должен отображаться");
        assertTrue(homePage.isVisaByLogoDisplayed(), "Логотип Verified By Visa должен отображаться");
        assertTrue(homePage.isMasterCardLogoDisplayed(), "Логотип MasterCard должен отображаться");
        assertTrue(homePage.isMasterCardSCLogoDisplayed(), "Логотип MasterCard Secure Code должен отображаться");
        assertTrue(homePage.isBelCardLogoDisplayed(), "Логотип Белкарт должен отображаться");
    }

    @Test
    @DisplayName("Проверка перехода по ссылки 'Подробнее о сервисе")
    public void testMoreAboutServiceLink() {
        homePage.clickMoreAboutService();
        String PageURL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertTrue(homePage.isMoreAboutServicePageOpened(PageURL), "Страница 'Подробнее о сервисе' должна открываться");
    }

    @Test
    @DisplayName("Проверка, что форма открывается")
    public void testFillFormAndContinue() {
        homePage.fillFormAndContinue("297777777", "5");

        assertTrue(homePage.isModalVisible(), "Модальное окно должно быть видимо");
    }

    @Test
    @DisplayName("Проверка плейсхолдеров формы онлайн оплаты без комиссии")
    public void testPlaceholders() {
        HomePage page = new HomePage(driver);
        page.getSelectPayOptionButton().click();
        page.getPayOptions().get(1).click();

        String phonePlaceholder = page.getPhoneNumberField().getDomAttribute("placeholder");
        assertEquals("Номер телефона", phonePlaceholder);

        String amountPlaceholder = page.getAmountField().getDomAttribute("placeholder");
        assertEquals("Сумма", amountPlaceholder);

        String emailPlaceholder = page.getEmailField().getDomAttribute("placeholder");
        assertEquals("E-mail для отправки чека", emailPlaceholder);

        String internetPhonePlaceholder = page.getInternetPhoneField().getDomAttribute("placeholder");
        assertEquals("Номер абонента", internetPhonePlaceholder);

        String internetAmountPlaceholder = page.getInternetAmountField().getDomAttribute("placeholder");
        assertEquals("Сумма", internetAmountPlaceholder);

        String internetEmailPlaceholder = page.getInternetEmailField().getDomAttribute("placeholder");
        assertEquals("E-mail для отправки чека", internetEmailPlaceholder);

        page.getSelectPayOptionButton().click();
        page.getPayOptions().get(2).click();

        String accountNumber44Placeholder = page.getAccountNumber44Field().getDomAttribute("placeholder");
        assertEquals("Номер счета на 44", accountNumber44Placeholder);

        String amount44Placeholder = page.getAmount44Field().getDomAttribute("placeholder");
        assertEquals("Сумма", amount44Placeholder);

        String instalmentEmailPlaceholder = page.getInstalmentEmailField().getDomAttribute("placeholder");
        assertEquals("E-mail для отправки чека", instalmentEmailPlaceholder);

        page.getSelectPayOptionButton().click();
        page.getPayOptions().get(3).click();

        String accountNumber2073Placeholder = page.getAccountNumber2073Field().getDomAttribute("placeholder");
        assertEquals("Номер счета на 2073", accountNumber2073Placeholder);

        String amountArrearsPlaceholder = page.getAmountArrearsField().getDomAttribute("placeholder");
        assertEquals("Сумма", amountArrearsPlaceholder);

        String arrearsEmailPlaceholder = page.getArrearsEmailField().getDomAttribute("placeholder");
        assertEquals("E-mail для отправки чека", arrearsEmailPlaceholder);
    }

    @Test
    @DisplayName("Проверка формы для оплаты")
    public void testPaymentFormWindow() {
        HomePage homePage = new HomePage(driver);
        homePage.fillFormAndContinue("297777777", "5.00");
        homePage.getWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));
        assertEquals("Оплатить 5.00 BYN", homePage.getPayButtonText(),
                "Текст кнопки 'Оплатить 5.00 BYN' не соответствует ожидаемому");

        assertEquals("5.00 BYN", homePage.getPayText(),
                "Текст '5.00 BYN' не соответствует ожидаемому");

        assertEquals("Номер карты", homePage.getCardNumberPlaceholder().findElement(By.xpath("./../label")).getText(),
                "Текст 'Номер карты' не соответствует ожидаемому");

        assertEquals("Срок действия", homePage.getExpirationDatePlaceholder().findElement(By.xpath("./../label")).getText(),
                "Текст 'Срок действия' не соответствует ожидаемому");

        assertEquals("CVC", homePage.getCvcCardPlaceholder().findElement(By.xpath("./../label")).getText(),
                "Текст 'CVC' не соответствует ожидаемому");

        assertEquals("Имя держателя (как на карте)", homePage.getHolderNamePlaceholder().findElement(By.xpath("./../label")).getText(),
                "Текст 'Имя держателя (как на карте)' не соответствует ожидаемому");
    }
}
