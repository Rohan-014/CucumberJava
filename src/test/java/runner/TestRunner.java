package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "E:\\Documents\\CucumberTestng\\src\\test\\resources\\SparshH\\SecondOP.feature" 
,glue = "StepsDF")

public class TestRunner extends AbstractTestNGCucumberTests {

}
