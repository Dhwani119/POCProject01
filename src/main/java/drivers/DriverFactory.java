package drivers;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverFactory {

    private static WebDriver driver;
private static ChromeDriver chromeDriver;
    public static WebDriver  getDriver()
    {


        if (driver == null)
        {


            String browserName = ConfigReader.getPropertyValue("chrome");

            switch (browserName.toLowerCase())
            {
                case "chrome":
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                // Add support for other browsers if needed
                default:
                    throw new IllegalArgumentException("Invalid browser specified in config.properties: " + browserName);
            }
            driver.get(ConfigReader.getBaseUrl());
            // Optional: Set additional browser settings, maximize window, etc.
            driver.manage().window().maximize();
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
