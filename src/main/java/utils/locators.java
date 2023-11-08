package utils;

import org.openqa.selenium.By;

public class locators {

    // Login Page Elements
    public By loginBTNElement = By.xpath("//a[contains(@id, 'btn-login')]");
    public By usernameInputElement = By.xpath("//input[contains(@class, 'input-username-email')]");
    public By passwordInputElement = By.xpath("//input[contains(@class, 'input-password')]");
    public By submitLoginBTNElement = By.xpath("//button[contains(@id, 'btn-login-submit')]");
    public By logoutTextElement = By.linkText("Logout");
    public By checkBoxSecElement = By.xpath("//input[contains(@type, 'checkbox')]");

    // Home Page Elements
    public By promotionLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/promotions')]");
    public By fastresLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/fast-result')]");
    public By resultLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/result')]");
    public By shoplocLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/ShopLocator')]");
    public By fonabetLinkElement = By.xpath("//div[contains(@class, 'footer-content')]//a[contains(@href, '/FonABet')]");
    public By bsLogoElement = By.xpath("//a[contains(@class, 'sports-logo') and contains(@class, 'header')]");
    /**    Cookie Policy Dialog **/
    public By acceptAllCookiesElement = By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]");
    public locators(){

    }
}
