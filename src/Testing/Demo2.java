package Testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	
	@AfterTest
	public void Test4() {
		System.out.println("Test 4 is passed");
	}
	
	@BeforeTest
	public void Test5() {
		System.out.println("Test 5 is passed");
	}
	
	@Test
	public void Test6() {
		System.out.println("Test 6 is passed");
	}
}
