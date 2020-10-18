package testNG;

import org.testng.annotations.Test;

public class Sample {

	@Test(priority=-3, enabled= false)
	public void firstTestCase() {
		System.out.println("first test case");
	}
	@Test(priority=1)
	public void secondTestCase() {
		System.out.println("first test case");
	}
	@Test(priority=-1)
	public void thirdTestCase() {
		System.out.println("first test case");
	}

}
