package testclasses;

import org.testng.annotations.Test;

public class TestAnnotation {

	@Test // This is an Test NG test case
	public void testMethod1() {
		System.out.println("Running Test -> Test Method 1");
	}
	
	@Test // This is an Test NG test case
	public void atestMethod2() {
		System.out.println("Running Test -> Test Method 2");
	}
	
	@Test // This is an Test NG test case
	public void testMethod3() {
		System.out.println("Running Test -> Test Method 3");
	}
}
