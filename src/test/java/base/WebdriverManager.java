package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManager {

    private static WebDriver driver;

    private WebdriverManager() {

    }

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            if(browser.equals("chrome"))
            {
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();
                driver.manage().window().maximize();
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
