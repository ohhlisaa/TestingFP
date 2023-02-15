package KostHub.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Profile {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div[2]/div[1]/div/div[2]/div[1]/button")
    WebElement uploadProfileButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div[2]/div[1]/div/div[2]/div[2]/button")
    WebElement resetProfileButton;

    @FindBy(xpath = "//*[@id=\"Nama Lengkap\"]")
    WebElement namaLengkap;

    @FindBy(xpath = "//*[@id=\"Tanggal Lahir\"]")
    WebElement tanggalLahir;

    @FindBy(xpath = "//*[@id=\"bordered-radio-1\"]")
    WebElement maleRadioButton;

    @FindBy(xpath = "//*[@id=\"bordered-radio-2\"]")
    WebElement femaleRadioButton;

    @FindBy(xpath = "//*[@id=\"Pekerjaan\"]")
    WebElement pekerjaan;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"Nomor Telepon\"]")
    WebElement nomorTelepon;

    @FindBy(xpath = "//*[@id=\"inline-radio\"]")
    WebElement ktpRadioButton;

    @FindBy(xpath = "//*[@id=\"inline-2-radio\"]")
    WebElement simRadioButton;

    @FindBy(xpath = "//*[@id=\"inline-checked-radio\"]")
    WebElement passportRadioButton;

    @FindBy(xpath = "//*[@id=\"Unggah Foto Identitas\"]")
    WebElement uploadIdentitasField;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div[2]/div[2]/form/div[9]/div/div[1]/button")
    WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div[2]/div[2]/form/div[9]/div/div[2]/button")
    WebElement resetButton;

    public Profile(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToProfilePage(){
        driver.get("https://synrgy-fp-c.zekhoi.dev/my");
    }

}
