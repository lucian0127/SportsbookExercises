package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver wDriver;

    //Locators
    private By acceptAllCookiesElement = By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]");
    private By loginBTNElement = By.xpath("//a[contains(@id, 'btn-login')]");
    private By usernameInputElement = By.xpath("//input[contains(@class, 'input-username-email')]");
    private By passwordInputElement = By.xpath("//input[contains(@class, 'input-password')]");
    private By submitLoginBTNElement = By.xpath("//button[contains(@id, 'btn-login-submit')]");
    private By logoutTextElement = By.linkText("Logout");
    private By checkBoxSecElement = By.xpath("//input[contains(@type, 'checkbox')]");

    // Constructor
    public LoginPage(WebDriver wDriver){
        this.wDriver = wDriver;
    }

    // Actions/Methods
    public WebElement bsAcceptCookieBTNElem(){
        WebElement bsAcceptCookieBTN = wDriver.findElement(acceptAllCookiesElement);
        return bsAcceptCookieBTN;
    }
    public WebElement bsLoginBTNElem(){
        WebElement bsLoginBTN = wDriver.findElement(loginBTNElement);
        return bsLoginBTN;
    }
    public void clickLoginBTN()
    {
        WebElement bsLoginBTN = wDriver.findElement(loginBTNElement);
        bsLoginBTN.click();
    }
    public String getLoginPageURL(){
        String loginPageURL = wDriver.getCurrentUrl();
        return loginPageURL;
    }
    public void enterUsername(String username) {
        WebElement emailInput = wDriver.findElement(usernameInputElement);
        emailInput.sendKeys(username);
    }
    public void enterPassword(String password){
        WebElement passwordInput = wDriver.findElement(passwordInputElement);
        passwordInput.sendKeys(password);
    }
    public void clickLogin(){
        WebElement clickLoginBTN = wDriver.findElement(submitLoginBTNElement);
        clickLoginBTN.click();
    }
    public WebElement checkLogoutText() {
        WebElement logoutText = wDriver.findElement(logoutTextElement);
        return logoutText;
    }

    public void checkPageSecurity(){
        WebElement checkBoxSec = wDriver.findElement(checkBoxSecElement);
        checkBoxSec.click();
    }
}
