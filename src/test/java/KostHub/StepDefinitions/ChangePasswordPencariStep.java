package KostHub.StepDefinitions;
import KostHub.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import KostHub.Pages.Login;
import KostHub.Pages.ChangePassword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordPencariStep extends Base {
    ChangePassword ChangePassword = new ChangePassword(driver,wait);

    @When ("User click on profile icon")
    public void clickOnProfileIcon(){
        ChangePassword.clickProfileIcon();
    }
    @And ("User click on setting menu")
    public void clickOnSettingMenu(){
        ChangePassword.clickSettingMenu();
    }
    @And ("User land on change password pencari page")
    public void onChangePasswordPencariPage(){
        ChangePassword.validateOnChangePasswordPencariPage();
    }

    @And ("User input oldPassword {string}")
    public void userInputOldPassword(String password){
        ChangePassword.inputPassword(password);
    }
    @And ("User input newPassword {string}")
    public void userInputNewPassword(String newPassword){
        ChangePassword.inputNewPassword(newPassword);
    }
    @And ("User input confirmation Password {string}")
    public void userInputConfirmationPassword(String konfirmasiNewPassword){
        ChangePassword.inputKonfirmasiNewPassword(konfirmasiNewPassword);
    }
    @And ("User click on save button")
    public void clickOnSaveButton(){
        ChangePassword.clickSaveButton();
    }
    @Then ("User see change password success message")
    public void userSeeChangePasswordSuccessMessage(){
        ChangePassword.successMessageShow();
    }
}
