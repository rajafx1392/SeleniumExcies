package testNG;

import org.testng.annotations.Test;

public class DependacisManagement {

	@Test(enabled= true)
	public void highSchool() {
		System.out.println("High School");

	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondrt() {
		System.out.println("Higher Sceondry");

	}
	@Test(dependsOnMethods = "higherSecondrt")
	public void engineering() {
		System.out.println("Engineering");

	}

}
