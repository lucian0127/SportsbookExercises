package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Properties;

public class Setup {
    public static WebDriver wDriver = new ChromeDriver();
    Properties prop = new Properties();
    String propFileName = "config.properties";
    @Before(order=0)
    public void setup_driver()
    {
        System.out.println("Setting up the browser.");
        wDriver = new ChromeDriver();
    }
    @Before(order=1)
    public void open_url()
    {
        String web_url = prop.getProperty("sports_prod");
        System.out.println("Navigating to Test URL(" + web_url + ")");
        wDriver.get(web_url);
    }

    @After(order=0)
    public void deleteAllCookies()
    {
        if (wDriver!=null)
        {
            System.out.println("Deleting all cookies.");
            wDriver.manage().deleteAllCookies();
        }
    }
    @After(order=1)
    public void tearDown()
    {
        if (wDriver!=null)
        {
            System.out.println("Closing the browser.");
            wDriver.quit();
        }
    }
}
