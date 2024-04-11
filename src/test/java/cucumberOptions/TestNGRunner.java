package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:/NewProject/CucumberProject/src/test/resources/Features",tags = "@RegressionTest and @SmokeTest",glue = "stepDefinations",monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
