package org.sophos.qa.automation.tottus.runners;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import org.sophos.qa.automation.tottus.utilities.BeforeSuite;
import org.sophos.qa.automation.tottus.utilities.DataToFeature;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features="src\\test\\resources\\features\\addProduct.feature",
glue="org.sophos.qa.automation.tottus.stepdefinitions\\",
snippets=SnippetType.CAMELCASE
)

public class AddProductRunner {
	
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
		DataToFeature.overrideFeatureFiles(".\\src\\test\\resources\\features\\addProduct.feature");	
	}
}
