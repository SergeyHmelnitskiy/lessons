package lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    public HomePage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    //Локатор для формы
    //private By onlineTopUpBlock = By.className("pay__wrapper");
    private By onlineTopUpBlock = By.xpath("//h2[contains(text(),'Онлайн пополнение')]");

    // Локаторы для логотипов
    private By visaLogo = By.xpath("//img[@alt='Visa']");
    private By visaByLogo = By.xpath("//img[@alt='Verified By Visa']");
    private By MasterCardLogo = By.xpath("//img[@alt='MasterCard']");
    private By MasterCardSCLogo = By.xpath("//img[@alt='MasterCard Secure Code']");
    private By BelCardLogo = By.xpath("//img[@alt='Белкарт']");

    // локатор для ссылки
    private By moreAboutServiceLink = By.linkText("Подробнее о сервисе");

    // локаторы для полей формы
    private By phoneNumberField = By.id("connection-phone");
    private By amountField = By.id("connection-sum");
    private By continueButton = By.className("button__default");
    private By modalLocator = By.className("bepaid-iframe");

    public String isOnLineTopUpBlockDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(onlineTopUpBlock));
        return element.getText();
    }

    public boolean isVisaLogoDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(visaLogo));
        return element.isDisplayed();
    }

    public boolean isVisaByLogoDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(visaByLogo));
        return element.isDisplayed();
    }

    public boolean isMasterCardLogoDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(MasterCardLogo));
        return element.isDisplayed();
    }

    public boolean isMasterCardSCLogoDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(MasterCardSCLogo));
        return element.isDisplayed();
    }

    public boolean isBelCardLogoDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(BelCardLogo));
        return element.isDisplayed();
    }

    public void clickMoreAboutService() {
        WebElement linkElement = wait.until(ExpectedConditions.elementToBeClickable(moreAboutServiceLink));
        linkElement.click();
    }

    public boolean isMoreAboutServicePageOpened(String expectedUrlPart) {
        return wait.until(ExpectedConditions.urlContains(expectedUrlPart));

    }
    public void fillFormAndContinue(String phoneNumber, String amount) {
            WebElement phoneFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField));
            phoneFieldElement.sendKeys(phoneNumber);

            WebElement amountFieldElement = wait.until(ExpectedConditions.visibilityOfElementLocated(amountField));
            amountFieldElement.sendKeys(amount);

            WebElement continueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
            continueButtonElement.click();
    }

    public boolean isModalVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalLocator)).isDisplayed();
    }
}
