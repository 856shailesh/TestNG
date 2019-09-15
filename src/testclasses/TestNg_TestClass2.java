package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNg_TestClass2 {
  @Test
  public void TestMethod() {
	  System.out.println("CLass 2 -> This is method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("CLass 2 -> This is Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("CLass 2 -> This is  After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("CLass 2 -> This is Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("CLass 2 -> This is after class");
  }

}
