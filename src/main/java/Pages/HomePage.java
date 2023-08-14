package Pages;

import PageFactory.HerokuappPageFactory;
import org.example.util.ElementwaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import drivers.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    //  private HerokuappPageFactory pagefactory;
    private ElementwaitUtil thinkTime;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Purpose: This Funtion verifies that the Home Page (https://akola.atlassian.net/wiki/spaces/SRATCHPAD/pages/295086/Dummy+page) exists and is displayed
    //Return value: The function returns true if the Page was displayed, else it returns false.
    public boolean VerifyPageExists(WebDriver driver) throws InterruptedException {
        //   thinkTime.waitForTitleContains("Welcome to the-internet");
        {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleContains("Welcome to the-internet"));
            //thinkTime.waitForTitleContains("Welcome to the-internet");
            //       thinkTime.waitUntillElementClickable(driver, pageFactory.RestrictionsButton);
//        Thread.sleep(15000);
            return true;

        }
    }
}