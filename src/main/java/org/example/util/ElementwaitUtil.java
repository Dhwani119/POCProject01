package org.example.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementwaitUtil {
    private WebDriver driver;
    private WebDriverWait wait;

    public ElementwaitUtil(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Set default timeout to 10 seconds (adjust as needed)
    }

    // Wait for an element to be visible
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait for an element to be clickable
    public void waitForClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for an element to have specific text
    public void waitForTextToBePresentInElement(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    // Wait for the page title to contain specific text
    public void waitForTitleContains(String partialTitle) {
        wait.until(ExpectedConditions.titleContains(partialTitle));
    }



    // Example: Wait for an element to be invisible
    public void waitForInvisibility(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    // Example: Wait for an element's attribute to contain specific text
    public void waitForAttributeContains(WebElement element, String attribute, String text) {
        wait.until(ExpectedConditions.attributeContains(element, attribute, text));
    }
}
