package com.example.steps;


import Pages.HomePage;
import Pages.ABTesting;
import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class HomePageStep {
    private WebDriver driver;
    //HerokuappPageFactory herokuPageFactory;
    private HomePage homepage;
    private ABTesting abtesting;

    @Given("browser is open")
    public void i_launch_browser() throws InterruptedException {
        driver = DriverFactory.getDriver();

        System.out.println("driver is successful");
    }

    @When("I navigate to the URL")
    public void i_navigate_to_URL() throws InterruptedException {
       homepage = new HomePage(driver);
       // Assert.assertEquals(true, homepage.VerifyPageExists());
        System.out.println("When is successful");
    }

    @Then("I should see the homepage")
    public void i_should_see_the_homepage() throws InterruptedException {
//if (homepage.VerifyPageExists(driver)) {
    System.out.println("Home page is loaded");
//}
    }

    @After
    public void closeBrowser()
    {
        // Close the browser and end the WebDriver session
        // if (driver != null) {
        DriverFactory.quitDriver();
        //driver.close();

        //}
    }


}
