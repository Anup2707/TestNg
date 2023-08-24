package Testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	
	@AfterSuite
	public void Test7() {
		System.out.println("Test 7 is passed");
	}
	
	@BeforeSuite
	public void Test8() {
		System.out.println("Test 8 is passed");
	}
	
	@Test
	public void Test9() {
		System.out.println("Test 9 is passed");
	}

}
