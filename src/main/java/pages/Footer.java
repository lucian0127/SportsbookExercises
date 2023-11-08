package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {
    private WebDriver wDriver;
    public Footer(WebDriver wDriver){
        this.wDriver = wDriver;
    }
    private By promotionLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/promotions')]");
    private By fastresLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/fast-result')]");
    private By resultLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/result')]");
    private By shoplocLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/ShopLocator')]");
    private By fonabetLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/FonABet')]");
    private By acceptAllCookiesElement = By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]");

    public WebElement getPromoElem(){
        WebElement promoElem = wDriver.findElement(promotionLinkElement);
        return promoElem;
    }

    public WebElement getFastresElem(){
        WebElement fastresElem = wDriver.findElement(fastresLinkElement);
        return fastresElem;
    }

    public WebElement getResultElem(){
        WebElement resultElem = wDriver.findElement(resultLinkElement);
        return resultElem;
    }

    public WebElement getShoplocElem(){
        WebElement shopLocElem = wDriver.findElement(shoplocLinkElement);
        return shopLocElem;
    }
    public WebElement getFonABetElem(){
        WebElement fonABetElem = wDriver.findElement(fonabetLinkElement);
        return fonABetElem;
    }
    public WebElement getAcceptCookiesElem(){
        WebElement acceptCookiesElem = wDriver.findElement(acceptAllCookiesElement);
        return acceptCookiesElem;
    }
}
