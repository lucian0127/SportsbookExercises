package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class HomeStepDef {
    private WebDriver wDriver;
    private HomePage homePage;
    private LoginPage loginPage;

    @Before
    public void setup()
    {
        wDriver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {
        if (wDriver!=null)
        {
            wDriver.quit();
        }
    }

    @Given("I am on the Boylesports website home page")
    public void i_am_on_the_boylesports_website_home_page() {
        wDriver.get("https://boylesports.com");
        homePage = new HomePage(wDriver);

        // Try to check if Accept All Cookies button exist.
        // If exist, it will automatically click it.
        try {
            homePage.bsAcceptCookieBTNElem().isDisplayed();
            homePage.bsAcceptCookieBTNElem().click();
        }catch (Exception e) {
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
        }catch (Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(true, homePage.bsLogoElem().isDisplayed());
    }

    @When("I click on the Boylesports Logo from the header")
    public void i_click_on_the_boylesports_logo_from_the_header() {
        homePage.clickBSLogo();
    }

    @Then("I should be redirected to Boylesports home page")
    public void i_should_be_redirected_to_boylesports_home_page() {
        Assert.assertTrue(homePage.getHomePageURL().contains("https://www.boylesports.com"));
    }
    //Login Page
    @Given("I want to validate if i am not logged in to Boylesports website")
    public void i_want_to_validate_if_i_am_not_logged_in_to_boylesports_website() {
        wDriver.get("https://boylesports.com");
        loginPage = new LoginPage(wDriver);

        // Try to check if Accept All Cookies button exist.
        // If exists, it will automatically click it.
        try {
            loginPage.bsAcceptCookieBTNElem().isDisplayed();
            loginPage.bsAcceptCookieBTNElem().click();
        }catch (Exception e) {
            //element not displayed
            //displayed is false
        }
    }
    @When("I want to check if the Login button is present from the header")
    public void i_want_to_check_if_the_login_button_is_present_from_the_header() {
        boolean displayed =false;

        try {
            loginPage.bsLoginBTNElem().isDisplayed();
            displayed = true;
        }catch (Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(true, loginPage.bsLoginBTNElem().isDisplayed());
    }
    @Then("I click on the login button from the header")
    public void i_click_on_the_login_button_from_the_header() {
        loginPage.bsLoginBTNElem().click();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){

        }
    }
    @When("I am successfully redirected to login page")
    public void i_am_successfully_redirected_to_login_page() {
        Assert.assertTrue(loginPage.getLoginPageURL().contains("/login"));
    }
    @Then("I have entered a valid {string} and {string}")
    public void i_have_entered_a_valid_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
    @Then("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLogin();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(loginPage.checkLogoutLink(), true);
    }
}
