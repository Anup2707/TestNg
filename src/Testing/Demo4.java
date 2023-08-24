
package Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test
	public void Test10() {
		System.out.println("Test 10 is passed");
	}
	
	
	@AfterMethod
	public void Test11() {
		System.out.println("Test 11 is passed");
	}
	
   @Test 
   public void Test12() {
	   System.out.println("Test 12 is Passed");
   }
}
