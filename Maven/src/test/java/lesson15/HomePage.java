package lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
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

    // локаторы для полей формы Онлайн пополнение без комиссии
    @FindBy(xpath = "//div[@id='pay-section']//button[@class='select__header']")
    private WebElement selectPayOptionButton;
    @FindBy(xpath = "//div[@id='pay-section']//ul[@class='select__list']//li")
    private List<WebElement> payOptions;
    private By phoneNumberField = By.id("connection-phone");
    private By amountField = By.id("connection-sum");
    private By emailField = By.id("connection-email");
    private By internetPhoneField = By.id("internet-phone");
    private By internetAmountField = By.id("internet-sum");
    private By internetEmailField = By.id("internet-email");
    private By accountNumber44Field = By.id("score-instalment");
    private By amount44Field = By.id("instalment-sum");
    private By instalmentEmailField = By.id("instalment-email");
    private By accountNumber2073Field = By.id("score-arrears");
    private By amountArrearsField = By.id("arrears-sum");
    private By arrearsEmailField = By.id("arrears-email");
    private By continueButton = By.className("button__default");
    private By modalLocator = By.className("bepaid-iframe");
    //private By paymentButtonLocator = By.cssSelector("button.colored.disabled");
    @FindBy(xpath = "//app-card-page//button[@type='submit']")
    private WebElement paymentButtonLocator;

    @FindBy(xpath = "//div[@class='pay-description__cost']//span")
    private WebElement sumDescription;


    private By cardNumber = By.id("cc-number");

    private By expirationDate = By.xpath("//input[@formcontrolname='expirationDate']");

    private By cvcCard = By.xpath("//input[@formcontrolname='cvc']");

    private By holderName = By.xpath("//input[@formcontrolname='holder']");


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

    // поиск плейсхолдеров формы Онлайн оплата без комиссии
    public WebElement getSelectPayOptionButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(selectPayOptionButton));
    }

    public List<WebElement> getPayOptions() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(payOptions));
    }

    public WebElement getPhoneNumberField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField));
    }

    public WebElement getAmountField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(amountField));
    }

    public WebElement getEmailField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
    }

    public WebElement getInternetPhoneField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(internetPhoneField));
    }

    public WebElement getInternetAmountField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(internetAmountField));
    }

    public WebElement getInternetEmailField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(internetEmailField));
    }

    public WebElement getAccountNumber44Field() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(accountNumber44Field));
    }

    public WebElement getAmount44Field() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(amount44Field));
    }

    public WebElement getInstalmentEmailField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(instalmentEmailField));
    }

    public WebElement getAccountNumber2073Field() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(accountNumber2073Field));
    }

    public WebElement getAmountArrearsField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(amountArrearsField));
    }

    public WebElement getArrearsEmailField() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(arrearsEmailField));
    }

    public String getPayButtonText() {
       // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("bepaid-iframe")));
        return wait.until(ExpectedConditions.visibilityOf(paymentButtonLocator)).getText().trim();
    }

    public String getPayText() {
        return wait.until(ExpectedConditions.visibilityOf(sumDescription)).getText().trim();
    }

    public WebElement getCardNumberPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumber));
    }

    public WebElement getExpirationDatePlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(expirationDate));
    }

    public WebElement getCvcCardPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cvcCard));
    }

    public WebElement getHolderNamePlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(holderName));
    }

    public WebDriverWait getWait() {
        return wait;
    }
}