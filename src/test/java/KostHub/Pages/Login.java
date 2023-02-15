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

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div/button")
    WebElement selectRoleLoginButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div/h1")
    WebElement tittle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div/div/div/div[1]/a")
    WebElement selectRolePencari;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div/div/div/div[2]/a")
    WebElement selectRolePemilik;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement emailInputText;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordInputText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/form/button[1]")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/form/div[1]")
    WebElement errorMessagePassword;

    public Login(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void validateOnMainPage() {
        driver.get("https://synrgy-fp-c.zekhoi.dev");
        tittle.isDisplayed();
    }

    public void selectRoleLoginButton() {
        selectRoleLoginButton.click();
        selectRolePencari.isDisplayed();
        selectRolePemilik.isDisplayed();
    }

    public void userSelectRolePencari() {
        selectRolePencari.isDisplayed();
        selectRolePemilik.isDisplayed();
        selectRolePencari.click();
    }


    public void validateOnPencariLoginPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p"))
                        .getText(),"Masuk sebagai Pencari Kost");
        // driver.get("https://synrgy-fp-c.zekhoi.dev/login/pencari");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/login/pencari");
    }

    public void userSelectRolePemilik() {
        selectRolePencari.isDisplayed();
        selectRolePemilik.isDisplayed();
        selectRolePemilik.click();
    }

    public void validateOnPemilikLoginPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p"))
                        .getText(),"Masuk sebagai Pemilik Kost");
        // driver.get("https://synrgy-fp-c.zekhoi.dev/login/pemilik");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/login/pemilik");
    }

    public void inputEmail(String email){
        emailInputText.sendKeys(email);
    }

    public void inputPassword(String password){
        passwordInputText.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void validateOnPencariHomepage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/h1")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/h1"))
                        .getText(),"Sewa Kost Makin Mudah Dengan KostHub!");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/");
    }

    public void validateOnPemilikHomepage(){
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/h1")));
//        Assert.assertEquals(
//                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[2]/h1"))
//                        .getText(),"Statistik");
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[3]/h1")));
//        Assert.assertEquals(
//                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[3]/h1"))
//                        .getText(),"Kos Anda");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/aside/nav/div/a/h1")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/aside/nav/div/a/h1"))
                        .getText(),"Tambah Kos Baru");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/dashboard");
    }

    public void errorMessageShow() {
        errorMessagePassword.isDisplayed();
    }
}
