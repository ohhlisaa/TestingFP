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
import KostHub.Pages.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterStep extends Base{
    Register Register = new Register(driver,wait);

    @Given ("User is on Homepage")
    public void onHomepage(){
        Register.validateOnHomeage();
    }
    @When ("User click on select role register button")
    public void clickOnSelectRoleRegisterButton(){
        Register.selectRoleRegisterButton();
    }
    @And ("User select role register pencari")
    public void userselectRoleregisterPencari(){
        Register.userSelectRoleRegisterPencari();
    }
    @And ("User land on pencari register page")
    public void onPencariRegisterpage(){
        Register.validateOnPencariRegisterPage();
    }

    @And ("User select role register pemilik")
    public void userselectRoleRegisterPencari(){
        Register.userSelectRoleRegisterPemilik();
    }
    @And ("User land on pemilik register page")
    public void onPemilikRegisterpage(){
        Register.validateOnPemilikRegisterPage();
    }


    @And ("User input registerEmail {string}")
    public void userInputRegisterEmail (String registerEmail){
        Register.inputRegisterEmail(registerEmail);
    }
    @And ("User input registerNomorTelepon {string}")
    public void userInputNomorTelepon(String registerNomorTelepon){
        Register.inputRegisterNomorTelepon(registerNomorTelepon);
    }
    @And ("User input registerPassword {string}")
    public void userInputRegisterPassword(String registerPassword){
        Register.inputRegisterPassword(registerPassword);
    }
    @And ("User input registerKonfirmasiPassword {string}")
    public void userInputKonfirmasiPassword(String registerKonfirmasiPassword){
        Register.inputRegisterKonfirmasiPassword(registerKonfirmasiPassword);
    }

    @And ("User click on register checkbox")
    public void clickOnRegisterCheckbox(){
        Register.clickRegisterCheckbox();
    }

    @When ("User click on register button")
    public void clickOnRegisterButton(){
        Register.clickRegisterButton();
    }
    @Then ("User land on verification page")
    public void onVerificationPage(){
        Register.validateOnVerificationPage();
    }
}
