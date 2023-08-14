package Pages;

import PageFactory.HerokuappPageFactory;
import drivers.DriverFactory;
import org.example.util.ElementwaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ABTesting {
    WebDriver driver;
   // private HerokuappPageFactory pagefactory;
    private ElementwaitUtil thinkTime;

    public ABTesting(){
        driver = DriverFactory.getDriver();
     //   pagefactory = PageFactory.initElements( this.driver, HerokuappPageFactory.class);
        thinkTime = new ElementwaitUtil( driver);
    }

    //Purpose: This Funtion verifies that the Home Page (https://akola.atlassian.net/wiki/spaces/SRATCHPAD/pages/295086/Dummy+page) exists and is displayed
    //Return value: The function returns true if the Page was displayed, else it returns false.
    public boolean VerifyPageExists() throws InterruptedException {

        thinkTime.waitForTitleContains("Variation");
 //       thinkTime.waitUntillElementClickable(driver, pageFactory.RestrictionsButton);
//        Thread.sleep(15000);
     return true;

    }




}
