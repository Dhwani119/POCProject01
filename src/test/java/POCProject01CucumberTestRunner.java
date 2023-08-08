import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources", // Location of your feature files
        glue = "com.example.steps"       // Package containing your step definitions
)
public class POCProject01CucumberTestRunner {
}
