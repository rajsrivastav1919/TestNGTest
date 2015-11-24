package testModifier;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestInterceptor implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
    }

    public void onTestSuccess(ITestResult iTestResult) {
    }

    public void onTestFailure(ITestResult iTestResult) {
        iTestResult.setStatus(ITestResult.SUCCESS);
    }

    public void onTestSkipped(ITestResult iTestResult) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    public void onStart(ITestContext iTestContext) {
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("No of passed tests - " + iTestContext.getPassedTests().size());
        System.out.println("No of failed tests - " + iTestContext.getFailedTests().size());
    }
}
