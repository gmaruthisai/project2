package Intermediate;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"classpath:Features/Addskills.feature"}
		,glue= {"TestRun"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		tags = {}
		
		
		
		)

public class Skillshelper {}

