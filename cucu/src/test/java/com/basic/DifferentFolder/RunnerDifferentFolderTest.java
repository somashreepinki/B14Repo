package com.basic.DifferentFolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = false,
		dryRun = true,//check d syntax..
		features  = {"src/test/resources/DifferentFolderFF/"},
		glue  = {"com/basic/DifferentFolder"}
		
		
		
		)



public class RunnerDifferentFolderTest {


}
