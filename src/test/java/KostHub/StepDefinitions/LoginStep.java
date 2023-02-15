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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends Base {
    Login Login = new Login(driver,wait);

    @Given("User is on Mainpage")
    public void onMainpage(){
        Login.validateOnMainPage();
    }

    @When("User click on select role login button")
    public void clickOnSelectRoleLoginButton(){
        Login.selectRoleLoginButton();
    }

    @And("User select role pencari")
    public void clickOnSelectRolePencari(){
        Login.userSelectRolePencari();
    }

    @And("User select role pemilik")
    public void clickOnSelectRolePemilik(){
        Login.userSelectRolePemilik();
    }

    @And("User land on pencari login page")
    public void onPencariLoginPage(){
        Login.validateOnPencariLoginPage();
    }

    @And("User land on pemilik login page")
    public void onPemilikLoginPage(){
        Login.validateOnPemilikLoginPage();
    }

    @And("User input email {string}")
    public void userInputEmail(String email){
        Login.inputEmail(email);
    }

    @And("User input password {string}")
    public void userInputPassword(String password){
        Login.inputPassword(password);
    }

    @When("User click on login button")
    public void clickOnLoginButton(){
        Login.clickLoginButton();
    }

    @Then("User land on pencari homepage")
    public void onPencariHomepage(){
        Login.validateOnPencariHomepage();
    }

    @Then("User land on pemilik homepage")
    public void onPemilikHomepage(){
        Login.validateOnPemilikHomepage();
    }

    @Then("User see error message")
    public void errorMessage(){
        Login.errorMessageShow();
    }
}
