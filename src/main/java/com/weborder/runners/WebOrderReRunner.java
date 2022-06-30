package com.weborder.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //karate.class
@CucumberOptions(
        features = "@target2/uiFailedTests.txt",
        glue = "com/weborder/stepdefinitions",
        dryRun = false, //true is for unsnifed steps and as default we use "false"
        tags = "@regression and @smoke",
        plugin = {"pretty","html:target2/uiReport.html","rerun:target2/uiFailedTests.txt"}

)
public class WebOrderReRunner {

}
