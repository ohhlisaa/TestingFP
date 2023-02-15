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
import KostHub.Pages.AddKost;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddKostStep extends Base{
    AddKost AddKost = new AddKost(driver,wait);

    @When ("User click on addKost menu")
    public void clickOnAddKostMenu(){
        AddKost.clickAddKostMenu();
    }

    @And ("User land on addKost page")
    public void onAddKostPage(){
        AddKost.validateOnAddKostPage();
    }

    @And ("User upload inside kost picture")
    public void userUploadInsideKostPicture(){
        AddKost.uploadInsideKostPicture();
    }

    @And ("User upload outside kost picture")
    public void userUploadOutsideKostPicture(){
        AddKost.uploadOutsideKostPicture();
    }

    @And ("User input kost name {string}")
    public void userKnputKostName(String kostName){
        AddKost.inputKostName(kostName);
    }

    @And ("User select kost type")
    public void userSelectKostType(){
        AddKost.selectKostType();
    }

    @And ("User input kost description {string}")
    public void userInputKostDescription(String kostDescription){
        AddKost.inputKostDescription(kostDescription);
    }

    @And ("User select payment scheme")
    public void userSelectPaymentScheme(){
        AddKost.selectPaymentScheme();
    }

    @And ("User select regulations")
    public void userSelectRegulations(){
        AddKost.selectRegulations();
    }

    @And ("User input additional regulations {string}")
    public void userInputAdditionalRegulations(String kostAdditionalRegulations){
        AddKost.inputAdditionalRegulations(kostAdditionalRegulations);
    }

    @And ("User click on next button")
    public void clickOnNextbutton(){
        AddKost.clickNextButton();
    }

    @And ("User land on addKost next page")
    public void onAddKostNextPage(){
        AddKost.validateOnAddKostNextPage();
    }

//    @And ("User click on location checklist")
//    public void clickOnLocationChecklist(){
//        AddKost.clickLocationChecklist();
//    }

    @And ("User input kost address {string}")
    public void userInputKostAddress(String kostAddress){
        AddKost.inputKostAddress(kostAddress);
    }

    @And ("User input kost province {string}")
    public void userInputKostProvince(String kostProvince){
        AddKost.inputKostProvince(kostProvince);
    }

    @And ("User input kost district {string}")
    public void userInputKostDistrict(String kostDistrict){
        AddKost.inputKostDistrict(kostDistrict);
    }

    @And ("User input kost subDistrict {string}")
    public void userInputKostSubDistrict(String kostSubDistrict){
        AddKost.inputKostSubDistrict(kostSubDistrict);
    }

    @And ("User input kost notes {string}")
    public void userInputKostNotes(String kostNotes){
        AddKost.inputKostNotes(kostNotes);
    }

    @And ("User click on addkost button")
    public void clickOnAddkostButton(){
        AddKost.clickAddKostButton();
    }

    @Then ("User see addKost success message")
    public void userSeeAddKostSuccessMessage(){
        AddKost.successMessageAddKostShow();
    }
}
