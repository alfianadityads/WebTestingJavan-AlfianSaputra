package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortofolioPage {
    public static WebDriver webDriver;

    public PortofolioPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//span[(text() = 'Optimize your Business with Javan' or . = 'Optimize your Business with Javan')]")
    private WebElement homePage;

    @FindBy(xpath = "//ul[@id='mobileMenu']/li[5]/div/button/span")
    private WebElement portofolioButton;

    @FindBy(xpath = "(//a[contains(@href, '/portfolio-list')])[2]")
    private WebElement portofolioListButton;

    @FindBy(xpath = "//th[(text() = 'Instansi' or . = 'Instansi')]")
    private WebElement institutionText;

    @FindBy(xpath = "//td[3]")
    private WebElement perbankanInstitutionText;


//    =====================================================

    public boolean validateHomePage() {
        return homePage.isDisplayed();
    }

    public void clickIconPortofolioBtn() {
        portofolioButton.click();
    }

    public void clickIconPortofolioListBtn() {
        portofolioListButton.click();
    }

    public boolean verifyInstitutionText() {
        return institutionText.isDisplayed();
    }

    public boolean verifyPerbankanInstitutionText() {
        return perbankanInstitutionText.isDisplayed();
    }
}