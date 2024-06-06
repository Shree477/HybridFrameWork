package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGenerator {

	public static ExtentReports extent;
	public static ExtentReports getExtentReport() {
		
		String path = "C:\\Users\\Myk Lacticrete\\eclipse-workspace\\Cucumber\\HybridFrameWork1\\TestReport\\Index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setDocumentTitle("TestExcecution Report");
		reporter.config().setReportName("Automation Report");
		reporter.config().setTheme(Theme.STANDARD);

		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System", "Lenovo");
		extent.setSystemInfo("QA","Sahil");
		extent.setSystemInfo("Environment","Stage");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("OS","Windows 11");
		
		return extent;
	}
}
