package testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_dataProvider {

	@DataProvider(name="input")	
	public Object[][] getdata() {
			return new Object[][] {
				{"tata","tiago"},
				{"bmw","m4"}
			};
	}

	@Test(dataProvider = "input")
	public void setup(String input1, String input2) {
		System.out.println("Input 1 is " + input1);
		System.out.println("Input 2 is :" + input2);

	}
}
