package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver wDriver;

    // By Locators
    private By bsLogoElement = By.xpath("//a[contains(@class, 'sports-logo') and contains(@class, 'header')]");
    private By acceptAllCookiesElement = By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]");
    // Constructor
    public HomePage(WebDriver wDriver){
        this.wDriver = wDriver;
    }

    // Actions/Methods
    public WebElement bsLogoElem(){
        WebElement bsLogo = wDriver.findElement(bsLogoElement);
        return bsLogo;
    }
    public WebElement bsAcceptCookieBTNElem(){
        WebElement bsAcceptCookieBTN = wDriver.findElement(acceptAllCookiesElement);
        return bsAcceptCookieBTN;
    }
    public void clickBSLogo(){
        WebElement bsLogo = wDriver.findElement(bsLogoElement);
        bsLogo.click();
    }
    public String getHomePageURL(){
        String homePageUrl = wDriver.getCurrentUrl();
        return homePageUrl;
    }
}
