package com.internetherukuapp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/internetherukuapp",
        glue ="com/internetherukuapp",
        dryRun = false,
        tags = "@etsy",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)
public class InternetRunner {
}
