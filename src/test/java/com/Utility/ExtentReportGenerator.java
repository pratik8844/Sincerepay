package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getextentreport() {
	String path =("D:\\Project1\\Sincere_Pay\\ReportPT");
	ExtentSparkReporter report = new ExtentSparkReporter(path);
	report.config().setDocumentTitle("Test Execution Report");
	report.config().setReportName("Automation Extent Report");
	report.config().setTheme(Theme.DARK);

	extent = new ExtentReports();
	extent.attachReporter(report);
	extent.setSystemInfo("Project Name","Sincere pay");
	extent.setSystemInfo("QA","Pratik");
	extent.setSystemInfo("Browser", "Chrome");
	return extent;

	}
}
