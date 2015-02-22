package com.gill.cog.practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
format = {"pretty", "html:target/cucumber"},
features = {"src/cucumber"}
)
public class TestRunner {

}
