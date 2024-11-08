package com.example.cucumber.TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example.cucumber.step_definitions",
        plugin = {"pretty", "html:target/cucumber-reports/report.html"},
        monochrome = true
)
public class TestRunner {
}
