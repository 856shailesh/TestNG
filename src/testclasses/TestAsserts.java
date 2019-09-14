package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appCodes.SomeClasstoTest;

public class TestAsserts {

	@Test // This is an Test NG test case
	public void testSum() {
		System.out.println("Running Test -> Test Method 1");
		SomeClasstoTest obj = new SomeClasstoTest();
		int resultSum = obj.sumNumber(2, 3);
		Assert.assertEquals(resultSum, 5);
		
	}
	
	@Test // This is an Test NG test case
	public void testString() {
		SomeClasstoTest obj = new SomeClasstoTest();
		String resultString = obj.addStrings("Hello", "World");
		Assert.assertEquals(resultString, "Hello World");
		
		System.out.println("Running Test -> Test Method 2");
	}
	
	@Test // This is an Test NG test case
	public void testMethod3() {
		System.out.println("Running Test -> Test Method 3");
	}
}
