package lesson18;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.junit5.AllureJunit5;
import lesson15.BaseTest;
import lesson15.HomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.qameta.allure.Step;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(AllureJunit5.class)
public class NewPageTest extends BaseTest {


    @Test
    @DisplayName("Проверка формы для оплаты")
    @Description("Метод проверяет правильно ли заполнены поля и наличие плейсхолдеров в форме.")
    public void testPaymentFormWindow() {
        HomePage homePage = new HomePage(driver);
        homePage.fillFormAndContinue("297777777", "5.00");

        homePage.getWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));
        verifyPaymentButton(homePage);
        verifyPaymentText(homePage);
        verifyPlaceholders(homePage);
    }

    @Step("Проверка кнопки оплаты")
    private void verifyPaymentButton(HomePage homePage) {
        String expectedText = "Оплатить 5.00 BYN";
        String actualText = homePage.getPayButtonText();
        assertEquals(expectedText, actualText,
                "Текст кнопки 'Оплатить 5.00 BYN' не соответствует ожидаемому");
        Allure.addAttachment("Текст кнопки оплаты", "Ожидаемый текст: " + expectedText + ", Фактический текст: " + actualText);
    }

    @Step("Проверка текста оплаты")
    private void verifyPaymentText(HomePage homePage) {
        String expectedText = "5.00 BYN";
        String actualText = homePage.getPayText();
        assertEquals(expectedText, actualText,
                "Текст '5.00 BYN' не соответствует ожидаемому");
        Allure.addAttachment("Текст суммы оплаты", "Ожидаемый текст: " + expectedText + ", Фактический текст: " + actualText);
    }

    @Step("Проверка плейсхолдеров формы")
    private void verifyPlaceholders(HomePage homePage) {
        verifyPlaceholder("Номер карты", homePage.getCardNumberPlaceholder());
        verifyPlaceholder("Срок действия", homePage.getExpirationDatePlaceholder());
        verifyPlaceholder("CVC", homePage.getCvcCardPlaceholder());
        verifyPlaceholder("Имя держателя (как на карте)", homePage.getHolderNamePlaceholder());
    }

    @Step("Проверка плейсхолдера '{0}'")
    private void verifyPlaceholder(String expectedText, WebElement placeholderElement) {
        String actualText = placeholderElement.findElement(By.xpath("./../label")).getText();
        assertEquals(expectedText, actualText,
                "Текст '" + expectedText + "' не соответствует ожидаемому");
        Allure.addAttachment("Проверка плейсхолдера - " + expectedText,
                "Ожидаемый текст: " + expectedText + ", Фактический текст: " + actualText);
    }

    @Test
    @DisplayName("Проверка плейсхолдеров формы онлайн оплаты без комиссии")
    @Description("Метод проверяет правильные плейсхолдеры для различных полей разных форм меню.")
    public void testPlaceholders() {
        HomePage page = new HomePage(driver);

        page.getSelectPayOptionButton().click();
        page.getPayOptions().get(1).click();

        verifyPlaceholder("Номер телефона", page.getPhoneNumberField().getDomAttribute("placeholder"));
        verifyPlaceholder("Сумма", page.getAmountField().getDomAttribute("placeholder"));
        verifyPlaceholder("E-mail для отправки чека", page.getEmailField().getDomAttribute("placeholder"));
        verifyPlaceholder("Номер абонента", page.getInternetPhoneField().getDomAttribute("placeholder"));
        verifyPlaceholder("Сумма", page.getInternetAmountField().getDomAttribute("placeholder"));
        verifyPlaceholder("E-mail для отправки чека", page.getInternetEmailField().getDomAttribute("placeholder"));

        page.getSelectPayOptionButton().click();
        page.getPayOptions().get(2).click();

        verifyPlaceholder("Номер счета на 44", page.getAccountNumber44Field().getDomAttribute("placeholder"));
        verifyPlaceholder("Сумма", page.getAmount44Field().getDomAttribute("placeholder"));
        verifyPlaceholder("E-mail для отправки чека", page.getInstalmentEmailField().getDomAttribute("placeholder"));

        page.getSelectPayOptionButton().click();
        page.getPayOptions().get(3).click();

        verifyPlaceholder("Номер счета на 2073", page.getAccountNumber2073Field().getDomAttribute("placeholder"));
        verifyPlaceholder("Сумма", page.getAmountArrearsField().getDomAttribute("placeholder"));
        verifyPlaceholder("E-mail для отправки чека", page.getArrearsEmailField().getDomAttribute("placeholder"));
    }

    @Step("Проверка плейсхолдера '{0}'")
    private void verifyPlaceholder(String expectedText, String actualText) {
        assertEquals(expectedText, actualText,
                "Текст плейсхолдера '" + expectedText + "' не соответствует ожидаемому");

        // Прикрепляем информацию о проверке в отчет Allure
        Allure.addAttachment("Проверка плейсхолдера: " + expectedText,
                "Ожидаемый текст: " + expectedText + ", Фактический текст: " + actualText);
    }
}

