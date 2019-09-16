package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNg_Grouping {

	@BeforeClass(alwaysRun=true)
	public void SetUp() {
		System.out.println("Before Class");
	}

	@Test(groups = {"cars","Suv"})
	public void testBMW() {
		System.out.println("TestNG_Grouping -> Method 1");
	}

	@Test(groups = {"cars","sedan"})
	public void testAudi() {
		System.out.println("TestNG_Grouping -> Method 2");
	}

	@Test(groups = {"bikes"})
	public void testHero() {
		System.out.println("TestNG_Grouping -> Method 3");
	}
	
	@Test(groups = {"bikes"})
	public void testYamaha() {
		System.out.println("TestNG_Grouping -> Method 3");
	}

	@AfterClass(alwaysRun=true)
	public void cleanUp() {
		System.out.println("After class");
	}

}
