package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/fblogin.feature",glue= {"stepDefinitions"},
monochrome=true,
tags="@smoke",
plugin= {"pretty","html:target/HTMLReports/report.html",
		"json:target/JSONReports/report.json",
	    "junit:target/JunitReports/report.xml"})
public class FbTestRunner {

}
