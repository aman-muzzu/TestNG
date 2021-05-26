package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 {

	@Test(priority = 1)
	public void doUserReg() {

		System.out.println("Executing User Reg test");
	    Assert.fail("User not registered sucessfully");
	}

	@Test(priority = 2, dependsOnMethods ="doUserReg")// {"doUserReg","thirdTest"} multiple dependencis comma sep {} to be used
	public void doLogin() {

		System.out.println("Executing login test");
	}

	@Test(priority = 3, dependsOnMethods ="doUserReg",alwaysRun=true) //if we need to pass only 3rd test case we need to add alwaysRun
	public void thirdTest() {

		System.out.println("Executing Third test case");
	}

	@Test(priority = 4, dependsOnMethods ="doUserReg")
	public void fourthTest() {

		System.out.println("Executing Fourth test case");
	}
}
