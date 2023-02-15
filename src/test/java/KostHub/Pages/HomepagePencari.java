package KostHub.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePencari {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div/div/button")
    WebElement cobaSekarangButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div/div[1]/input")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div/div[1]/button")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section[1]/div/div[1]/div[2]/a")
    WebElement kostHitsLink;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section[2]/div/div[1]/div[2]/a")
    WebElement kostTerbaruLink;

    public HomepagePencari(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
