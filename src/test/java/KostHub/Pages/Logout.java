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

public class Logout {
    WebDriver driver;

    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/button")
    WebElement logoutMenu;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div[2]/div/div/div/button[2]")
    WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div[2]/div/div/div/button[1]")
    WebElement batalButton;

    public Logout(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void clickLogoutMenu(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/button")));
        logoutMenu.click();
    }

    public void clickLogoutButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div[2]/div/div/div/button[2]")));
        logoutButton.click();
    }

    public void validateOnHomepage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/h1")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/h1"))
                        .getText(),"Sewa Kost Makin Mudah Dengan KostHub!");
        //Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/");
    }
}
