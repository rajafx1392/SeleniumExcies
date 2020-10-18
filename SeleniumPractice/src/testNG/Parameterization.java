package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization{


	@Test
	@Parameters({"username","Age"})
	public void printName(String name, String age) {
		System.out.println("My Name is"+ name + "My Age is "+ age);
	}

}