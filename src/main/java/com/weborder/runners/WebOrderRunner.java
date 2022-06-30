package com.weborder.runners;
/*
ThESE are INTERVIEW QUESTIONS:

Runner class is a way to run your all features files from here.Regression,smoke,integration...etc
@RunWith  -->annotation comes from JUnit and it executes the file steps

@CucumberOptions -->is a special annotation that have some keywords.

features -->shows location of feature file(it should be content root)

glue-->this is the location of step definition files(it should come from be source root)
dryRun -->it is a way to get snips(steps) without executing the whole implementation
tags -->is a way to specialize scenarios for the specifc purposes.It means you run for some scenario/s
for only regression,smoke or etc.
plugin -->is a way to integrate specific condition for the keyword.it is mostly used to create a report card
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //karate.class
@CucumberOptions(
      features = "src/main/resources/features/weborder",
      glue = "com/weborder/stepdefinitions",
        dryRun = false, //true is for unsnifed steps and as default we use "false"
        tags = "@regression and @smoke",
        plugin = {"pretty","html:target2/uiReport.html","rerun:target2/uiFailedTests.txt"}

)
public class WebOrderRunner {
}
