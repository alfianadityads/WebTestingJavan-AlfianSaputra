package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.PortofolioPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class portofolio {

    private final WebDriver driver = Hooks.driver;

    PortofolioPage portofolioPage = new PortofolioPage(driver);
    @Given("user is on the landing page")
    public void userIsOnTheLandingPage() {
        Assert.assertTrue(portofolioPage.validateHomePage());
    }

    @When("user clicks the Portfolio icon button menu")
    public void userClicksThePortfolioIconButtonMenu() {
        portofolioPage.clickIconPortofolioBtn();
    }

    @And("user clicks the Portfolio list button in the dropdown menu")
    public void userClicksThePortfolioListButtonInTheDropdownMenu() {
        portofolioPage.clickIconPortofolioListBtn();
    }

    @And("user searches for the institution field")
    public void userSearchesForTheInstitutionField() {
        Assert.assertTrue(portofolioPage.verifyInstitutionText());
    }

    @Then("user sees the {string} institution")
    public void userSeesTheInstitution(String perbankanInstitut) {
        Assert.assertEquals(portofolioPage.verifyPerbankanInstitutionText(), perbankanInstitut);
    }
}
