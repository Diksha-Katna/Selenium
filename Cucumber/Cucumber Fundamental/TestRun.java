package TestRunnerPackage;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Feature/login.feature"},  glue="Step_Definition")
public class TestRun {

}
