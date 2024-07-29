package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features="src\\test\\java\\features",glue="stepDefinitions",monochrome=true,tags="@SmokeTest and @Regression")
//@CucumberOptions(features="src\\test\\java\\features",glue="stepDefinitions",monochrome=true,tags="@SmokeTest or @Regression")
//@CucumberOptions(features="src\\test\\java\\features",glue="stepDefinitions",monochrome=true,tags="not @Regression")
//@CucumberOptions(features="src\\test\\java\\features\\secondpProgram.feature",dryRun=true,
//glue="stepDefinitions",monochrome=true,plugin= {"pretty","html:target\\CucumberReports.html","json:target\\CumcumberReports.json"})
@CucumberOptions(features="src\\test\\java\\features\\secondpProgram.feature",dryRun=true,
glue="stepDefinitions",monochrome=true,plugin= {"pretty","html:target\\CucumberReports.html","json:target\\CumcumberReports.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
