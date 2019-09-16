package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNg_Priority {

	@BeforeClass
	public void SetUp() {
		System.out.println("CLass 1 -> This is Before Class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("CLass 1 -> This is after class");
	}

	@Test(priority = 2)
	public void TestMethod1() {
		System.out.println("TestNG_Priority -> Method 1");
	}

	@Test(priority = 1)
	public void TestMethod2() {
		System.out.println("TestNG_Priority -> Method 2");
	}

	@Test(priority = 0)
	public void TestMethod3() {
		System.out.println("TestNG_Priority -> Method 3");
	}

}
