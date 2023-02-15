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

public class HomepagePemilik {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div/aside/img")
    WebElement logoKostHub;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[1]")
    WebElement bannerCarousel;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div/aside/nav/ul/li[1]/a")
    WebElement homeButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div/aside/nav/ul/li[2]/a")
    WebElement transactionButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[1]/div/aside/nav/ul/li[3]/a")
    WebElement historyButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div[1]")
    WebElement statistikJanjiTemuCard;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div[2]")
    WebElement statistikPemesanCard;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div[3]")
    WebElement statistikPenghuniCard;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/div/div[4]")
    WebElement statistikKamarkosongCard;

    public HomepagePemilik(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void validateOnHomepagePemilik() {
        driver.get("https://synrgy-fp-c.zekhoi.dev/dashboard");
    }

    public void validateElementsPresentOnHomepagePemilik() {
        logoKostHub.isDisplayed();
        bannerCarousel.isDisplayed();
        homeButton.isDisplayed();
        transactionButton.isDisplayed();
        historyButton.isDisplayed();
        statistikJanjiTemuCard.isDisplayed();
        statistikPemesanCard.isDisplayed();
        statistikPenghuniCard.isDisplayed();
        statistikKamarkosongCard.isDisplayed();
    }
}
