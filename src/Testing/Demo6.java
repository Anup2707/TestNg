package Testing;

import org.testng.annotations.Test;

public class Demo6 {
	
	public class Demo5 {
		
		/*
		 * @Test(dependsOnMethods = {"Test17","Test18"}) public void Test16() {
		 * System.out.println("Test 16 is passed"); }
		 */
		
		@Test
		public void Test17() {
			System.out.println("Test 17 is passed");
		}
		
	   @Test 
	   public void Test18() {
		   System.out.println("Test 18 is Passed");

}

}
	}
