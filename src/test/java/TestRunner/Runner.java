package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/java/FeatureFile/Calculator.feature",
        glue="StepsDefination",
        tags="@ArithmeticOperation",
        monochrome=true,
        plugin={"pretty","json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
