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
import KostHub.Pages.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutPencariStep extends Base {
    Logout Logout = new Logout(driver,wait);

    @And ("User click on logout menu")
    public void clickOnLogoutMenu(){
        Logout.clickLogoutMenu();
    }
    @And ("User click on logout button")
    public void clickOnLogoutButton(){
        Logout.clickLogoutButton();
    }
    @Then ("User land on homepage")
    public void OnHomepage(){
        Logout.validateOnHomepage();
    }
}
