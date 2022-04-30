package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps"},
//        tags = "@regression or @sanity",
//        tags=  "@regression and  @sanity",
        tags="@ui",
        plugin = {"pretty","html:target/report.html"},
        monochrome = true


)

public class TestRunner
{

}
