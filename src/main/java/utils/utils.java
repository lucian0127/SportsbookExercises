package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class utils {

    public String getPropValue(String key) throws IOException {
        String result = "";
        InputStream inputStream = null;
        try {
            Properties prop = new Properties();
            String propFileName = "Config/config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            result = prop.getProperty(key);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }

    public Boolean checkElementIfExist(WebElement locator)
    {
        boolean result = false;

        try {
            locator.isDisplayed();
            result = true;
        }catch (java.lang.Exception e) {
            //element not displayed
            //displayed is false
        }
        return result;
    }
    public WebElement getTargetElement(WebElement locator)
    {
        WebElement wElem = null;
        return  wElem;
    }
    public void doClick(WebDriver wDriver, By locator)
    {
        WebElement bsLogo = wDriver.findElement(locator);
        bsLogo.click();
    }
    public void inputText(WebDriver wDriver, By locator, String tex)
    {
        WebElement inputElem = wDriver.findElement(locator);
        inputElem.sendKeys(tex);
    }
}
