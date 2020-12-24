package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.utilities.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/adactin/feature/Adactin.feature"
					, glue="com/adactin/stepdefinition"
					, monochrome=true
					, dryRun=false
					, strict=true
					, plugin= {"pretty", "html:ReportFolder/CucumberReportHtml",
							"json:ReportFolder/CucumberReport.json",
							"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:ReportFolder/CucumberExtentReport.html",
							"rerun:ReportFolder/FailedScenario.txt"
							}
					//, tags = { "~@BookHotel", "~@BookedHistory" }
				)
public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() throws IOException {
		String browserName = FileReaderManager.getInstance().getCrInstance().getBrowserName();		
		driver = BaseClass.getBrowser(browserName);
	}
	
	@AfterClass
	public static void closeBrowser() {
		BaseClass.quitBrowser();
	}
}
