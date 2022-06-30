package com.products.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/products", //from content root
        glue ="com/products/stepdefinition",
        dryRun = false,
       // tags ="@product",
        tags = "@productTable",
        plugin = {"pretty","html:target2/uiReport.html","rerun:target2/uiFailedTests.txt"}
)
public class ProductsRunner {
}
