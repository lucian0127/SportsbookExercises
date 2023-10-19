package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SocialMediaPage {

    private WebDriver wDriver;

    // By Locators
    private By facebookLogoElement = By.xpath("//a[contains(@href,'facebook')]");
    private By twitterLogoElement = By.xpath("//a[contains(@href,'twitter')]");
    private By youtubeLogoElement = By.xpath("//a[contains(@href,'youtube')]");
    private By acceptAllCookiesElement = By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]");

    public SocialMediaPage(WebDriver wDriver){
        this.wDriver = wDriver;
    }

    public WebElement getFacebookLogo(){
        WebElement facebooklogo = wDriver.findElement(facebookLogoElement);
        return facebooklogo;
    }
    public void clickFacebookLogo(){
        WebElement facebooklogo = wDriver.findElement(facebookLogoElement);
        facebooklogo.click();
    }
    public String getFacebookPageURL(){
        String facebookPageUrl = wDriver.getCurrentUrl();
        return facebookPageUrl;
    }
    public WebElement getTwitterLogo(){
        WebElement twitterLogo = wDriver.findElement(twitterLogoElement);
        return twitterLogo;
    }
    public void clickTwitterLogo(){
        WebElement twitterLogo = wDriver.findElement(twitterLogoElement);
        twitterLogo.click();
    }
    public String getTwitterPageURL(){
        String twitterPageUrl = wDriver.getCurrentUrl();
        return twitterPageUrl;
    }
    public WebElement getYoutubeLogo(){
        WebElement youtubeLogo = wDriver.findElement(youtubeLogoElement);
        return youtubeLogo;
    }
    public void clickYoutubeLogo(){
        WebElement youtubeLogo = wDriver.findElement(youtubeLogoElement);
        youtubeLogo.click();
    }
    public String getYoutubePageURL(){
        String youtubePageUrl = wDriver.getCurrentUrl();
        return youtubePageUrl;
    }
    public WebElement bsAcceptCookieBTNElem(){
        WebElement bsAcceptCookieBTN = wDriver.findElement(acceptAllCookiesElement);
        return bsAcceptCookieBTN;
    }
}
