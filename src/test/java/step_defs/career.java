package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CareerPage;
import org.example.pageObject.PortofolioPage;
import org.example.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class career {

    private final WebDriver driver = Hooks.driver;

    CareerPage careerPage = new CareerPage(driver);
    @When("user clicks the Career button menu")
    public void userClicksTheCareerButtonMenu() throws InterruptedException {
        Thread.sleep(3000);
        careerPage.clickIconCareerBtn();
    }

    @And("user clicks the Apply Job on selected job")
    public void userClicksTheApplyJobOnSelectedJob() {
        careerPage.clickApplyJobBtn();
    }

    @And("user click the Apply Now on job page")
    public void userClickTheApplyNowOnJobPage() {
        careerPage.clickApplyNowJobBtnJobPage();
    }

    @When("user input {string} as a name, {string} as a email, {string} as a phone, {string} as a Current Company, {string} as a University,{string} as a birth place, {string} as a current address, {string} as a about")
    public void userInputAsANameAsAEmailAsAPhoneAsACurrentCompanyAsAUniversityAsABirthPlaceAsACurrentAddressAsAAbout(String FullName, String Email, String Phone, String CurrentCompany, String University, String BirthPlace, String Address, String About) throws InterruptedException {
        careerPage.setInputFullName(FullName);
        Thread.sleep(1000);
        careerPage.setInputEmail(Email);
        Thread.sleep(1000);
        careerPage.setInputPhone(Phone);
        Thread.sleep(1000);
        careerPage.setInputCurrentCompany(CurrentCompany);
        Thread.sleep(1000);
        careerPage.setInputUniversity(University);
        Thread.sleep(1000);
        careerPage.setInputBirthPlace(BirthPlace);
        Thread.sleep(1000);
        careerPage.setInputAddress(Address);
        Thread.sleep(1000);
        careerPage.setInputAbout(About);
        Thread.sleep(1000);
    }

    @And("user select Gender option in Gender dropdown menu")
    public void userSelectGenderOptionInGenderDropdownMenu() throws InterruptedException {
        careerPage.clickIconGenderBtn();
    }

    @And("user select Last Education option in Last Education dropdown menu")
    public void userSelectLastEducationOptionInLastEducationDropdownMenu() throws InterruptedException {
        careerPage.clickIconLastEduBtn();
    }

    @And("user select Join Date option in Join Date dropdown menu")
    public void userSelectJoinDateOptionInJoinDateDropdownMenu() throws InterruptedException {
        careerPage.clickIconJoinDateBtn();
    }

    @And("user select Which Do You Prefer? option in Which Do You Prefer? dropdown menu")
    public void userSelectWhichDoYouPreferOptionInWhichDoYouPreferDropdownMenu() throws InterruptedException {
        careerPage.clickIconWDYPBtn();
    }

    @And("user select How do you know opportuny? option in How do you know opportuny? dropdown menu")
    public void userSelectHowDoYouKnowOpportunyOptionInHowDoYouKnowOpportunyDropdownMenu() throws InterruptedException {
        careerPage.clickIconKnowOpportunityBtn();
    }

    @And("user select Are you a smoker? option in Are you a smoker? dropdown menu")
    public void userSelectAreYouASmokerOptionInAreYouASmokerDropdownMenu() throws InterruptedException {
        careerPage.clickIconSmokerBtn();
    }

    @And("user upload valid file {string}")
    public void userUploadValidFile(String File) {
        careerPage.selectFile(Constants.PDF_DIR + File);
    }

    @And("user clicks Apply Now button")
    public void userClicksApplyNowButton() {
        careerPage.clickApplyNowButton();
    }

    @Then("user sees notification error {string}")
    public void userSeesNotificationError(String errorText) {
        Assert.assertEquals(careerPage.verifyErrorText(), errorText);
    }


    @And("user upload invalid file {string}")
    public void userUploadInvalidFile(String File) {
        careerPage.selectFile(Constants.PDF_DIR + File);
    }
}
