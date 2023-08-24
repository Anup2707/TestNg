package Testing;

import org.testng.annotations.Test;

public class Demo8 {
	
	@Test(priority = 1)
	public void Test22() {
		System.out.println("test 22 is passed");
	}
	
	@Test (priority = -1)
	public void Test23() {
		System.out.println("Test 23 is passed");
	}
	
	@Test
	public void Test24() {
		System.out.println("Test 24 is passed");
	}

}
