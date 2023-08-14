package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager {

    private WebDriver driver;

    public WebDriver initializeChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/dhwan/Documents/Dhwani/Chromedriver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        // Add any desired Chrome options here

        driver = new ChromeDriver(options);
        return driver;
    }

    public void closeChromeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

