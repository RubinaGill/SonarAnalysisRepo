package org.nagp.listeners;

import org.nagp.utils.ExtentManager;
import org.testng.*;
import com.aventstack.extentreports.Status;

public class ExtentTestNGListener implements ITestListener {

  @Override
  public void onStart(ITestContext context) {
   ExtentManager.initReport();
  }

  @Override
  public void onFinish(ITestContext context) {
    ExtentManager.flushReport();
  }

  @Override
  public void onTestStart(ITestResult result) {
    ExtentManager.startTest(result.getMethod().getMethodName());
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    ExtentManager.log(Status.PASS, "Test passed");
  }

  @Override
  public void onTestFailure(ITestResult result) {
    ExtentManager.log(Status.FAIL, "Test failed: " + result.getThrowable());
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    ExtentManager.log(Status.SKIP, "Test skipped");
  }
}
