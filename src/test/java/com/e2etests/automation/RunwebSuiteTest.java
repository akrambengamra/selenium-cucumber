package com.e2etests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
//Ce classe est basé sur Junit (framework d'execution) + les options de cucumber(features/plugin,tags/glue) 

/**
 * The test Runner File uses the @RunWith Annotation from JUnit for executing tests.
 */
@RunWith(Cucumber.class)

/**
 * The @CucumberOptions Annotation is used to define the location of feature files, step definitions, reporting
 * integration
 */
@CucumberOptions(
		
		features = {"src/spec/features"}, // le dossier ou il ya les fonctionalité/ features
		plugin = {"pretty", "html:target/cucumber-report.html"}, // le chemin du raport
		tags = ("@login"), //tag du scenrio ili n7eb nrunih
		//glue = {"src/test/java/com/e2etests/automation/step_definitions"}, //l'emplacemnt du code
		monochrome = true, //console lisible
		snippets = SnippetType.CAMELCASE
		)

/**
 * This class is used to run the test, which is a JUnit Test Runner Class 
 * containing the step definition location and the other primary metadata required to run the test
 */

public class RunwebSuiteTest {

}
