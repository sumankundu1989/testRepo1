package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"Features"},
		glue= {"com.tt.steps"},
		tags = {"@samplefeature"}
		)
public class jan extends AbstractTestNGCucumberTests {
	
	

}
