package Testing;

import org.testng.annotations.Test;

public class Demo7 {
	@Test
	public void Test19() {
		System.out.println("Test 19 is passed");
	}
	
	@Test
	public void Test20() {
		System.out.println("Test 20 is passed");
	}
	
	@Test(enabled = false)
	public void Test21() {
		System.out.println("Test 21 is passed");
	}
}
