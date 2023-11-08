package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FootballPage {
    private WebDriver wDriver;
    public FootballPage(WebDriver wDriver){
        this.wDriver = wDriver;
    }

    //By Locator
    private By footballTitleElement = By.xpath("//div[contains(@class, 'nbc-mod')]//span[text()[last()]]");
    private By footballNavElement = By.xpath("//ul[contains(@class, 'left-nav-wrapper')]//li[contains(@id, 'football')]");
    private By acceptAllCookiesElement = By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]");

    public WebElement footballNavElem(){
        WebElement footballNav = wDriver.findElement(footballNavElement);
        return footballNav;
    }
    public WebElement bsAcceptCookieBTNElem(){
        WebElement bsAcceptCookieBTN = wDriver.findElement(acceptAllCookiesElement);
        return bsAcceptCookieBTN;
    }
    public void clickFootballLink()
    {
        WebElement footballLinkBTN = wDriver.findElement(footballNavElement);
        footballLinkBTN.click();
    }
    public String getFootballPageURL(){
        String footballPageURL = wDriver.getCurrentUrl();
        return footballPageURL;
    }
    public String getFootballPageTitle(){
        WebElement pageTitle = wDriver.findElement(footballTitleElement);
        return pageTitle.getText();
    }
}
