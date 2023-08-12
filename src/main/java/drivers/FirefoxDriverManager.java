package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager {

    private WebDriver driver;

    public WebDriver initializeFirefoxDriver() {
        System.setProperty("webdriver.firefox.driver", "C:/Users/dhwan/Documents/Dhwani/Geckodriver");


        FirefoxOptions options = new FirefoxOptions();
        // Add any desired Chrome options here

        driver = new FirefoxDriver();
        return driver;
    }

    public void closeFirefoxDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

