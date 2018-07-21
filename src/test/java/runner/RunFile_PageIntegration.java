package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/feature/CreateLead_PageIntegration.feature",
glue= {"pages_cucumberIntegration","hooks"},monochrome=true)
@RunWith(Cucumber.class)
public class RunFile_PageIntegration {

}
