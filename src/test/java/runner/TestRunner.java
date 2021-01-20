package runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin= {"json:target/cucumber-reports/cucumber.json",
				"pretty","html:target/cucumber-reports/cucumber.html",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
		},
		features= {"src/test/resources/features/"},
		glue= {"stepDefination"},
		//tags= {"@Search-Cars,@Used-Search-Cars"},
		monochrome=true,
		strict=true,
		dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\extentconfig\\extent-config.xml"));
	 Reporter.setSystemInfo("User Name", "Deeps");
     Reporter.setSystemInfo("Time Zone", "USA");
     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
     Reporter.setSystemInfo("Selenium", "3.7.0");
     Reporter.setSystemInfo("Maven", "3.5.2");
     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	 }

}
