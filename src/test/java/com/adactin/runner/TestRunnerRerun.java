package com.adactin.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@ReportFolder/FailedScenario.txt"
					, glue="com/adactin/stepdefinition"
					, monochrome=true
					, dryRun=false
					, strict=true
					, plugin= {/*"pretty", "html:ReportFolder/CucumberReportHtml",
							"json:ReportFolder/CucumberReport.json",*/
							"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:ReportFolder2/CucumberExtentReport2.html",
							"rerun:ReportFolder/FailedScenario.txt"
							}
					//, tags = { "~@BookHotel", "~@BookedHistory" }
				)
public class TestRunnerRerun {

}
