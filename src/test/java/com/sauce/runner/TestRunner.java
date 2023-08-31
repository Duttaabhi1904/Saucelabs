package com.sauce.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//java//com//sauce//feature" }, glue = { "com.sauce.stepdefenition",
		"com.sauce.hooks" }, snippets = SnippetType.CAMELCASE, 
		dryRun = !true, 
		plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		stepNotifications = true, 
		publish = true

)

public class TestRunner {

}
