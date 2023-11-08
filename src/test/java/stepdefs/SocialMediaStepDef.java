package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.SocialMediaPage;
import java.util.ArrayList;
public class SocialMediaStepDef {

    private WebDriver wDriver;
    private SocialMediaPage socialMediaPage;

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

    // Home page given
    @Given("I am currently navigated to the Boylesports home page")
    public void i_am_currently_navigated_to_the_boylesports_home_page() {
        wDriver.get("https://boylesports.com");
        socialMediaPage = new SocialMediaPage(wDriver);

        // Try to check if Accept All Cookies button exist.
        // If exist, it will automatically click it.
        try {
            socialMediaPage.bsAcceptCookieBTNElem().isDisplayed();
            socialMediaPage.bsAcceptCookieBTNElem().click();
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }
    }

    // Facebook Scenarios
    @Given("I have validated the Facebook icon at the header")
    public void i_have_validated_the_facebook_icon_at_the_header() {
        boolean displayed =false;

        try {
            socialMediaPage.getFacebookLogo().isDisplayed();
            displayed = true;
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(displayed, socialMediaPage.getFacebookLogo().isDisplayed());
    }
    @When("I click on the Facebook icon")
    public void i_click_on_the_facebook_icon() {
        socialMediaPage.clickFacebookLogo();
    }
    @Then("I redirected to Boylesports facebook page")
    public void i_redirected_to_boylesports_facebook_page() {
        Assert.assertTrue(socialMediaPage.getFacebookPageURL().contains("facebook.com/boylesports"));
    }

    // Twitter Scenarios
    @Given("I have validated the Twitter icon at the header")
    public void i_have_validated_the_twitter_icon_at_the_header() {
        boolean displayed =false;

        try {
            socialMediaPage.getTwitterLogo().isDisplayed();
            displayed = true;
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(displayed, socialMediaPage.getTwitterLogo().isDisplayed());
    }
    @When("I click on the Twitter icon")
    public void i_click_on_the_twitter_icon() {
        socialMediaPage.clickTwitterLogo();
    }
    @Then("I redirected to Boylesports twitter")
    public void i_redirected_to_boylesports_twitter() {
        Assert.assertTrue(socialMediaPage.getTwitterPageURL().contains("twitter.com/boylesports"));
    }

    // Youtube Scenarios
    @Given("I have validated the Youtube icon at the header")
    public void i_have_validated_the_youtube_icon_at_the_header() {
        boolean displayed =false;

        try {
            socialMediaPage.getYoutubeLogo().isDisplayed();
            displayed = true;
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }

        Assert.assertEquals(displayed, socialMediaPage.getYoutubeLogo().isDisplayed());
    }
    @When("I click on the Youtube icon")
    public void i_click_on_the_youtube_icon() {
        socialMediaPage.clickYoutubeLogo();
    }
    @Then("I redirected to Boylesports Youtube channel")
    public void i_redirected_to_boylesports_youtube_channel() {
        Assert.assertTrue(socialMediaPage.getYoutubePageURL().contains("youtube.com/user/betBoylesports"));
    }
}
