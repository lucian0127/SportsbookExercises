package stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.utils;
import java.io.IOException;
import utils.locators;


public class HomeStepDef extends utils {
    private HomePage homePage;
    private LoginPage loginPage;
    WebDriver wDriver = new ChromeDriver();
    locators loc = new locators();
    @Given("I am on the Boylesports website home page")
    public void i_am_on_the_boylesports_website_home_page() throws IOException {
        wDriver.get(getPropValue("sports_prod"));
        boolean displayed =false;
        homePage = new HomePage(wDriver);

        // Try to check if Accept All Cookies button exist.
        // If exist, it will automatically click it.
        try {
            homePage.bsAcceptCookieBTNElem().isDisplayed();
            doClick(wDriver, loc.acceptAllCookiesElement);
//            homePage.bsAcceptCookieBTNElem().click();
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }
    }

    @Given("I have validated the Boylesports Logo from the header")
    public void i_have_validated_the_boylesports_logo_from_the_header() {
        boolean displayed =false;

        try {
            homePage.bsLogoElem().isDisplayed();
            displayed = true;
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(true, homePage.bsLogoElem().isDisplayed());
    }

    @When("I click on the Boylesports Logo from the header")
    public void i_click_on_the_boylesports_logo_from_the_header() {
//        homePage.clickBSLogo();
        doClick(wDriver, loc.bsLogoElement);
    }

    @Then("I should be redirected to Boylesports home page")
    public void i_should_be_redirected_to_boylesports_home_page() throws IOException {
        Assert.assertTrue(homePage.getHomePageURL().contains(getPropValue("sports_prod")));
    }
    //Login Page
    @Given("I want to validate if i am not logged in to Boylesports website")
    public void i_want_to_validate_if_i_am_not_logged_in_to_boylesports_website() {
        loginPage = new LoginPage(wDriver);

        // Try to check if Accept All Cookies button exist.
        // If exists, it will automatically click it.
        try {
            loginPage.bsAcceptCookieBTNElem().isDisplayed();

            //loginPage.bsAcceptCookieBTNElem().click();
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }
        boolean displayed =false;

        try {
            loginPage.bsLoginBTNElem().isDisplayed();
            displayed = true;
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(true, loginPage.bsLoginBTNElem().isDisplayed());
    }
    @When("I click on the login button from the header")
    public void i_click_on_the_login_button_from_the_header() {
        doClick(wDriver, loc.loginBTNElement);
        //loginPage.clickLoginBTN();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){

        }
    }
    @Then("I am successfully redirected to login page")
    public void i_am_successfully_redirected_to_login_page() {
        Assert.assertTrue(loginPage.getLoginPageURL().contains("/login"));
    }
    @When("I have entered a valid {string} and {string}")
    public void i_have_entered_a_valid_and(String username, String password) {
        try {
            Thread.sleep(15000);
        }catch (java.lang.Exception e)
        {

        }
        loginPage.checkPageSecurity();
        try {
            Thread.sleep(15000);
        }catch (java.lang.Exception e)
        {

        }
        // Input username
        inputText(wDriver, loc.usernameInputElement, username);
        //loginPage.enterUsername(username);

        // Input password
        inputText(wDriver, loc.passwordInputElement, password);
        //loginPage.enterPassword(password);
    }
    @Then("I click on the login button")
    public void i_click_on_the_login_button() {
        doClick(wDriver, loc.submitLoginBTNElement);
        //loginPage.clickLogin();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        loginPage.checkPageSecurity();
        Assert.assertEquals(loginPage.checkLogoutText().toString(), true);
    }
}
