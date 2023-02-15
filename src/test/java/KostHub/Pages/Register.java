package KostHub.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Register {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/button")
    WebElement selectRoleRegisterButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[1]/div/h1")
    WebElement tittle;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/div/div/div[1]/a")
    WebElement selectRoleRegisterPencari;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/div/div/div[2]/a")
    WebElement selectRoleRegisterPemilik;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement emailInputText;

    @FindBy(xpath = "//*[@id=\"Nomor telepon\"]")
    WebElement nomorTeleponInputText;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordInputText;

    @FindBy(xpath = "//*[@id=\"Konfirmasi Password\"]")
    WebElement konfirmasiPasswordInputText;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement registerCheckbox;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/form/button[1]")
    WebElement registerButton;

    public Register(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void validateOnHomeage() {
        driver.get("https://synrgy-fp-c.zekhoi.dev");
    }

    public void selectRoleRegisterButton() {
        selectRoleRegisterButton.click();
    }

    public void userSelectRoleRegisterPencari() {
        selectRoleRegisterPencari.isDisplayed();
        selectRoleRegisterPemilik.isDisplayed();
        selectRoleRegisterPencari.click();
    }

    public void validateOnPencariRegisterPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p"))
                        .getText(),"sebagai Pencari Kost");
        // driver.get("https://synrgy-fp-c.zekhoi.dev/login/pencari");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/register/pencari");
    }

    public void userSelectRoleRegisterPemilik() {
        selectRoleRegisterPencari.isDisplayed();
        selectRoleRegisterPemilik.isDisplayed();
        selectRoleRegisterPemilik.click();
    }

    public void validateOnPemilikRegisterPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/p"))
                        .getText(),"sebagai Pemilik Kost");
        // driver.get("https://synrgy-fp-c.zekhoi.dev/login/pencari");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/register/pemilik");
    }

    public void inputRegisterEmail(String registerEmail){
        emailInputText.sendKeys(registerEmail);
    }

    public void inputRegisterNomorTelepon(String registerNomorTelepon){
        nomorTeleponInputText.sendKeys(registerNomorTelepon);
    }

    public void inputRegisterPassword(String registerPassword){
        passwordInputText.sendKeys(registerPassword);
    }

    public void inputRegisterKonfirmasiPassword(String registerKonfirmasiPassword){
        konfirmasiPasswordInputText.sendKeys(registerKonfirmasiPassword);
    }

    public void clickRegisterCheckbox(){
        registerCheckbox.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void validateOnVerificationPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/h5")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/h5"))
                        .getText(),"Pilih Metode Verifikasi");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/verify");
    }
}
