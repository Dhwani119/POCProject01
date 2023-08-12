package drivers;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static WebDriver driver;
    private static ChromeDriverManager chromeDriver;
    public static WebDriver  getDriver()
    {


        if (driver == null)
        {


            String browserName = ConfigReader.getPropertyValue("browser");

            switch (browserName.toLowerCase())
            {
                case "chrome":
                    driver = new ChromeDriverManager().initializeChromeDriver();
                    break;
                case "firefox":
                   driver = new FirefoxDriverManager().initializeFirefoxDriver();
                    break;
                // Add support for other browsers if needed
                default:
                    throw new IllegalArgumentException("Invalid browser specified in config.properties: " + browserName);
            }
            driver.get(ConfigReader.getPropertyValue("url"));
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
