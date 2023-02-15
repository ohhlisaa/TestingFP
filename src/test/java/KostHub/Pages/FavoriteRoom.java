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

public class FavoriteRoom {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[1]/div/button/a")
    WebElement backButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/button")
    WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[1]/div/h2")
    WebElement favoriteTittle;


    public FavoriteRoom(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void validateOnFavoriteRoomPage() {
        driver.get("https://synrgy-fp-c.zekhoi.dev/my/favorite");
        favoriteTittle.isDisplayed();
    }

    public void validateElementsPresentOnFavoriteRoomPage() {
        backButton.isDisplayed();
        profileButton.isDisplayed();
    }
}
