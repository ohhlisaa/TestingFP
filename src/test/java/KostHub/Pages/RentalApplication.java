package KostHub.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RentalApplication {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/h3")
    WebElement tittlePengajuanSewa;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[3]/button")
    WebElement addedTenantsButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/button")
    WebElement reduceTenantsButton;

    @FindBy(xpath = "//*[@id=\"inline-radio\"]")
    WebElement ktpRadioButton;

    @FindBy(xpath = "//*[@id=\"inline-2-radio\"]")
    WebElement simRadioButton;

    @FindBy(xpath = "//*[@id=\"inline-checked-radio\"]")
    WebElement passportRadioButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div[1]/div[4]/div[2]/div/div")
    WebElement requirementsDocument;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div[1]/div[5]/div[2]/div/input")
    WebElement rentalStartDate;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div[1]/div[6]/div[2]/div/select")
    WebElement paymentsType;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement chairsFacilityChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement fansFacilityChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement mattressFacilityChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement tablesFacilityChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement cupboardsFacilityChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement laundryFacilityChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement cancellationPolicyChecklist;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[3]/div[2]/button")
    WebElement rentalRequestButton;

    public RentalApplication(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void validateOnRentalApplicationPage() {
        driver.get("https://synrgy-fp-c.zekhoi.dev");
        tittlePengajuanSewa.isDisplayed();
    }

    public void validateElementsPresentOnRentalApplicationPage() {
        addedTenantsButton.isDisplayed();
        reduceTenantsButton.isDisplayed();
        ktpRadioButton.isDisplayed();
        simRadioButton.isDisplayed();
        passportRadioButton.isDisplayed();
        requirementsDocument.isDisplayed();
        rentalStartDate.isDisplayed();
        paymentsType.isDisplayed();
        chairsFacilityChecklist.isDisplayed();
        fansFacilityChecklist.isDisplayed();
        mattressFacilityChecklist.isDisplayed();
        tablesFacilityChecklist.isDisplayed();
        cupboardsFacilityChecklist.isDisplayed();
        laundryFacilityChecklist.isDisplayed();
        cancellationPolicyChecklist.isDisplayed();
        rentalRequestButton.isDisplayed();
    }

}
