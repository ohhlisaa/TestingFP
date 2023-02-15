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

public class AddKost {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[1]/div/aside/nav/div/a")
    WebElement addKostMenu;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[1]/div/h2")
    WebElement addKostText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[3]/div/label")
    WebElement insideKostPicture;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[5]/div/label")
    WebElement outsideKostPicture;

    @FindBy(xpath = "//*[@id=\"Nama Kost\"]")
    WebElement namaKostInputText;

    @FindBy(xpath = "//*[@id=\"Campur\"]")
    WebElement mixRadioButton;

    @FindBy(xpath = "//*[@id=\"Pria\"]")
    WebElement maleRadioButton;

    @FindBy(xpath = "//*[@id=\"Wanita\"]")
    WebElement femaleRadioButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[11]/textarea")
    WebElement kostDescriptionInputText;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement dailyPaymentSchemeChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement weeklyPaymentSchemeChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement monthlyPaymentSchemeChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement threeMonthPaymentSchemeChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement sixMonthPaymentSchemeChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement yearlyPaymentSchemeChecklist;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement regulations1;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[17]/textarea")
    WebElement additionalRegulationsInputText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[18]/div/div/button")
    WebElement nextButton;

//    @FindBy(xpath = "//*[@id=\"checkbox\"]")
//    WebElement locationChecklist;

    @FindBy(xpath = "//*[@id=\"Alamat\"]")
    WebElement addressInputText;

    @FindBy(xpath = "//*[@id=\"Provinsi\"]")
    WebElement provinceInputText;

    @FindBy(xpath = "//*[@id=\"Kabupaten/Kota\"]")
    WebElement districtInputText;

    @FindBy(xpath = "//*[@id=\"Kecamatan\"]")
    WebElement subDistrictInputText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[12]/textarea")
    WebElement notesInputText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[13]/div/div[1]/button")
    WebElement backButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[13]/div/div[2]/button")
    WebElement addKostButton;

    public AddKost(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void clickAddKostMenu(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/aside/nav/div/a")));
        addKostMenu.click();
    }

    public void validateOnAddKostPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div[1]/div/h2")));
//        Assert.assertEquals(
//                driver.findElement(By.xpath(""))
//                        .getText(),"");
//        // driver.get("");
//        Assert.assertEquals(driver.getCurrentUrl(), "");
    }

    public void uploadInsideKostPicture(){
        WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[3]/div/label"));
        chooseFile.sendKeys("/Assets/kost.png");
    }

    public void uploadOutsideKostPicture(){
        WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div[2]/form/div[5]/div/label"));
        chooseFile.sendKeys("/Users/shofiyakhalisa/IdeaProjects/FP_WebsiteAutomation/Assets/kost.png");
    }

    public void inputKostName(String kostName){
        namaKostInputText.sendKeys(kostName);
    }

    public void selectKostType(){
        femaleRadioButton.click();
    }

    public void inputKostDescription(String kostDescription){
        kostDescriptionInputText .sendKeys(kostDescription);
    }

    public void selectPaymentScheme(){
        monthlyPaymentSchemeChecklist.click();
    }

    public void selectRegulations(){
        regulations1.click();
    }

    public void inputAdditionalRegulations(String kostAdditionalRegulations){
        additionalRegulationsInputText.sendKeys(kostAdditionalRegulations);
    }

    public void clickNextButton(){
        nextButton.click();
    }

    public void validateOnAddKostNextPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div/main/section/div/div/div/div[1]/div/h2")));
//        Assert.assertEquals(
//                driver.findElement(By.xpath(""))
//                        .getText(),"");
//        // driver.get("");
//        Assert.assertEquals(driver.getCurrentUrl(), "");
    }

//    public void clickLocationChecklist(){
//        locationChecklist.click();
//    }

    public void inputKostAddress(String kostAddress){
        addressInputText.sendKeys(kostAddress);
    }

    public void inputKostProvince(String kostProvince){
        provinceInputText.sendKeys(kostProvince);
    }

    public void inputKostDistrict(String kostDistrict){
        districtInputText.sendKeys(kostDistrict);
    }

    public void inputKostSubDistrict(String kostSubDistrict){
        subDistrictInputText.sendKeys(kostSubDistrict);
    }

    public void inputKostNotes(String kostNotes){
        notesInputText.sendKeys(kostNotes);
    }

    public void clickAddKostButton(){
        addKostButton.click();
    }

    public void successMessageAddKostShow(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
//        Assert.assertEquals(
//                driver.findElement(By.xpath(""))
//                        .getText(),"");
    }
}

