package KostHub.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class History {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/button[1]")
    WebElement diajukanButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/button[2]")
    WebElement sebelumnyaButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/button[3]")
    WebElement disetujuiButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/div[1]/div/button[4]")
    WebElement sedangjalanButton;

    public History(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
