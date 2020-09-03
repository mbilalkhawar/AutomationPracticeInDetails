package com.ap.ITestListener;

import com.ap.utilities.Utilities;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("When Test Starts"+ iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("When Test is Successful"+ iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("When Test is Fail"+ iTestResult.getMethod().getMethodName());
        System.out.println("Capturing Screen Shot and Saving it ");
        Utilities.screenShotOnFailedTestCase(iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("When Test is Skipped"+ iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("When Test is Skipped"+ iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("When Test is Started"+ ITestContext.class.getName());

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("When Test is Finished"+ ITestContext.class.getName());
    }
}
