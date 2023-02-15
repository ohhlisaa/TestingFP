package KostHub.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ChangePassword {
    WebDriver driver;

    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/button")
    WebElement profileIcon;

    @FindBy(xpath = "")
    WebElement Menu;

    @FindBy(xpath = "")
    WebElement profileMenu;

    @FindBy(xpath = "")
    WebElement historyMenu;

    @FindBy(xpath = "")
    WebElement FavoriteMenu;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/div[4]/a")
    WebElement settingMenu;

    @FindBy(xpath = "")
    WebElement LogoutMenu;

    @FindBy(xpath = "//*[@id=\"Password lama\"]")
    WebElement passwordInputText;

    @FindBy(xpath = "//*[@id=\"Password baru\"]")
    WebElement newPasswordInputText;

    @FindBy(xpath = "//*[@id=\"Ulangi password baru\"]")
    WebElement konfirmasiNewPasswordInputText;

    @FindBy(xpath = "/html/body/div/div/main/section/div/div/div/div[2]/form/div[4]/button")
    WebElement saveButton;

    public ChangePassword(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void clickProfileIcon(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/header/nav/div/div/button")));
        profileIcon.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/div[4]/a")));
    }

    public void clickSettingMenu(){
        settingMenu.click();
    }

    public void validateOnChangePasswordPencariPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/h2")));
        Assert.assertEquals(
                driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/h2"))
                        .getText(),"Ganti password");
        // driver.get("https://synrgy-fp-c.zekhoi.dev/login/pencari");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/my/settings");
    }

    public void inputPassword(String password){
        passwordInputText.sendKeys(password);
    }

    public void inputNewPassword(String newPassword){
        newPasswordInputText.sendKeys(newPassword);
    }

    public void inputKonfirmasiNewPassword(String konfirmasiNewPassword){
        konfirmasiNewPasswordInputText.sendKeys(konfirmasiNewPassword);
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void successMessageShow() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/main/section/div/div/div/div[2]/form/div[1]")));
//        Assert.assertEquals(
//                driver.findElement(By.xpath("/html/body/div/div/main/section/div/div/div/div[2]/form/div[1]"))
//                        .getText(),"Password berhasil diubah");
    }
}
