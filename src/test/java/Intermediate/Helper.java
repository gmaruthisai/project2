package Intermediate;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"classpath:Features/Addnationalities.feature"}
,glue= {"TestRun"},
//plugin = {"pretty", "html:target/cucumber-html-report"},
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
tags = {}
)

public class Helper {
}