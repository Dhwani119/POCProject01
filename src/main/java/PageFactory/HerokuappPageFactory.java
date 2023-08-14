package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


// Class that has all the selectors for all the elements used in the application.
public class HerokuappPageFactory {
   @FindBy(className = "heading")
   public WebElement PageHeader;

   @FindBy(linkText = "A/B Testing")
   public WebElement ABTestingLink;

}



