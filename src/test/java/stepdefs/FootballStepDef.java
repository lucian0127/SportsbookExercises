package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.FootballPage;

public class FootballStepDef {
    private WebDriver wDriver;
    private FootballPage footballPage;
//    @BeforeClass
//    public void setup()
//    {
//        wDriver = new ChromeDriver();
//    }
//
//    @AfterClass
//    public void tearDown()
//    {
//        if (wDriver!=null)
//        {
//            wDriver.quit();
//        }
//    }
    @Given("I have validated the Football link in Left Navigation bar in home page.")
    public void i_have_validated_the_football_link_in_left_navigation_bar_in_home_page() {
        wDriver.get("https://boylesports.com");
        footballPage = new FootballPage(wDriver);

        // Try to check if Accept All Cookies button exist.
        // If exist, it will automatically click it.
        try {
            footballPage.bsAcceptCookieBTNElem().isDisplayed();
            footballPage.bsAcceptCookieBTNElem().click();
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }

        boolean displayed = false;
        try {
            Thread.sleep(3000);
            footballPage.footballNavElem().isDisplayed();
            displayed = true;
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(true, footballPage.footballNavElem().isDisplayed());
    }
    @When("I click on the Football link from Left Navigation bar")
    public void i_click_on_the_football_link_from_left_navigation_bar() {
        footballPage.clickFootballLink();
    }
    @Then("I should redirected to Football page")
    public void i_should_redirected_to_football_page() {
        Assert.assertTrue(footballPage.getFootballPageURL().contains("sports/football"));
    }
    @Then("I have validated the Football title in Football page")
    public void i_have_validated_the_football_title_in_football_page() {
        Assert.assertTrue(footballPage.getFootballPageTitle().contains("Football"));
    }
}
