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

public class Search {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[1]/h2")
    WebElement hasilPencarianText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/div/div[1]/div/button[1]")
    WebElement mixType;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/div/div[1]/div/button[2]")
    WebElement maleType;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/div/div[1]/div/button[3]")
    WebElement femaleType;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/div/div[2]/div/input[1]")
    WebElement minPrice;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/div/div[2]/div/input[2]")
    WebElement maxPrice;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/div/div[3]/button[1]")
    WebElement filterButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/div/div[3]/button[2]")
    WebElement resetButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[2]/div/form/div/div[1]/input")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[2]/div/form/div/div[1]/button")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/a")
    WebElement kamarSayaKost;

    public Search(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }
}
