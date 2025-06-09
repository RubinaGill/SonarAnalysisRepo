package org.nagp.utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

  private static ExtentReports extent;
  private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

  public static void initReport() {
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
    sparkReporter.config().setReportName("Automation Execution Report");
    sparkReporter.config().setDocumentTitle("Test Results");

    extent = new ExtentReports();
    extent.attachReporter(sparkReporter);
    extent.setSystemInfo("Tester", "QA Engineer");
    extent.setSystemInfo("Environment", "Staging");
  }

  public static void flushReport() {
    extent.flush();
  }

  public static void startTest(String testName) {
    ExtentTest extentTest = extent.createTest(testName);
    test.set(extentTest);
  }

  public static void log(Status status, String message) {
    test.get().log(status, message);
  }

  public static void endTest() {
    test.remove();
  }
}
