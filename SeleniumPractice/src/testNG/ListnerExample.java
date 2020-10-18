package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerExample implements ITestListener {

	public void onTestResult(ITestResult result) {
		System.out.println("Test going to Excute");
	}

	public void onTestFailer(ITestResult result) {
		System.out.println("Test going to fail");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test going to Skipped");
	}

	public void onTestResultFailwithinsucesspresentage(ITestResult result) {
		System.out.println("Sucesspresentage");
	}

	public void onStart(ITestResult result) {
		System.out.println("Before Everything");
	}

	public void onFinish(ITestResult result) {
		System.out.println("After Everything");
	}

}
