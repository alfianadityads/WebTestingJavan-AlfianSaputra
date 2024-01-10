package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {
    public static WebDriver webDriver;

    public CareerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//li[7]/a[.='Career']")
    private WebElement careerButton;

    @FindBy(xpath = "(//a[contains(@href, 'https://javan.co.id/career/devops/28')])[3]")
    private WebElement applyJobButton;

    @FindBy(xpath = "//a[@id = 'career-btn-apply-internal' and @href = '#' and (text() = 'Apply Now' or . = 'Apply Now')]")
    private WebElement applyJobNowButtonJobPage;

    @FindBy(xpath = "//input[@id='in_full_name']")
    private WebElement inputFullName;

    @FindBy(xpath = "//input[@id='in_email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='in_phone']")
    private WebElement inputPhone;

    @FindBy(xpath = "//input[@id='in_current_company']")
    private WebElement inputCurrentCompany;

    @FindBy(xpath = "")
    private WebElement inputUniversity;

    @FindBy(xpath = "//input[@id='in_birth_place']")
    private WebElement inputBirthPlace;

    @FindBy(xpath = "//textarea[@id='in_race']")
    private WebElement inputAddress;

    @FindBy(xpath = "//textarea[@id='in_additional_information']")
    private WebElement inputAbout;

    @FindBy(xpath = "//select[@id='in_male']")
    private WebElement clickGenderField;

    @FindBy(xpath = "")
    private WebElement clickGenderOption;

    @FindBy(xpath = "//form[@id='frApplyJob']/div/div/div/div[8]/select")
    private WebElement clickLastEduField;

    @FindBy(xpath = "")
    private WebElement clickLastEduOption;

    @FindBy(xpath = "//select[@id='in_join_date']")
    private WebElement clickLastJoinDateField;

    @FindBy(xpath = "")
    private WebElement clickLastJoinDateOption;

    @FindBy(xpath = "//form[@id='frApplyJob']/div/div/div/div[11]/select")
    private WebElement clickWDYPField;

    @FindBy(xpath = "")
    private WebElement clickWDYPOption;

    @FindBy(xpath = "//form[@id='frApplyJob']/div/div/div[2]/div[5]/select")
    private WebElement clickKnowOpportunityField;

    @FindBy(xpath = "")
    private WebElement clickKnowOpportunityOption;

    @FindBy(xpath = "//form[@id='frApplyJob']/div/div/div[2]/div[6]/select")
    private WebElement clickSmokerField;

    @FindBy(xpath = "")
    private WebElement clickSmokerOption;

    @FindBy(xpath = "//span[(text() = 'Upload File' or . = 'Upload File')]")
    private WebElement clickUploadFile;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement clickApplyNowButton;

    @FindBy(xpath = "//label[(text() = 'Field is required.' or . = 'Field is required.')]")
    private WebElement NotificationError;
//    ========================================================

    public void clickIconCareerBtn() {
        careerButton.click();
    }

    public void clickApplyJobBtn() {
        applyJobButton.click();
    }

    public void clickApplyNowJobBtnJobPage() {
        applyJobNowButtonJobPage.click();
    }

    public void setInputFullName(String FullName) {
        inputFullName.sendKeys(FullName);
    }

    public void setInputEmail(String Email) {
        inputEmail.sendKeys(Email);
    }

    public void setInputPhone(String Phone) {
        inputPhone.sendKeys(Phone);
    }

    public void setInputCurrentCompany(String CCompany) {
        inputCurrentCompany.sendKeys(CCompany);
    }

    public void setInputUniversity(String Univ) {
        inputUniversity.sendKeys(Univ);
    }

    public void setInputBirthPlace(String BPlace) {
        inputBirthPlace.sendKeys(BPlace);
    }

    public void setInputAddress(String Address) {
        inputAddress.sendKeys(Address);
    }

    public void setInputAbout(String About) {
        inputAbout.sendKeys(About);
    }

    public void clickIconGenderBtn() {
        clickGenderField.click();
    }

    public void clickIconGenderOptBtn() {
        clickGenderOption.click();
    }

    public void clickIconLastEduBtn() {
        clickLastEduField.click();
    }

    public void clickIconLastEduOpt() {
        clickLastEduOption.click();
    }

    public void clickIconJoinDateBtn() {
        clickLastJoinDateField.click();
    }

    public void clickIconJoinDateOpt() {
        clickLastJoinDateOption.click();
    }

    public void clickIconWDYPBtn() {
        clickWDYPField.click();
    }

    public void clickIconWDYPOpt() {
        clickWDYPOption.click();
    }

    public void clickIconKnowOpportunityBtn() {
        clickKnowOpportunityField.click();
    }

    public void clickIconKnowOpportunityOpt() {
        clickKnowOpportunityOption.click();
    }

    public void clickIconSmokerBtn() {
        clickSmokerField.click();
    }

    public void clickIconSmokerOpt() {
        clickSmokerOption.click();
    }

    public void selectFile(String File) {
        clickUploadFile.sendKeys(File);
    }

    public void clickApplyNowButton() {
        clickApplyNowButton.click();
    }

    public boolean verifyErrorText() {
        return NotificationError.isDisplayed();
    }

}
