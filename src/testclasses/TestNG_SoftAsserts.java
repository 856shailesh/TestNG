package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appCodes.SomeClasstoTest;

public class TestNG_SoftAsserts {

	@Test // This is an Test NG test case
	public void testSum() {
		SoftAssert sa = new SoftAssert();
		System.out.println("\n Running Test -> Test Method 1");
		SomeClasstoTest obj = new SomeClasstoTest();
		int resultSum = obj.sumNumber(2, 3);
		//Assert.assertEquals(resultSum, 4);
		sa.assertEquals(resultSum, 4);
		System.out.println("\n Line after assert 1");
	
		//Assert.assertEquals(resultSum, 5);
		sa.assertEquals(resultSum, 5);
		System.out.println("\n Line after assert 2");
		sa.assertAll();
	}
}
