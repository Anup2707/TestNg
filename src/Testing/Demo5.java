package Testing;


import org.testng.annotations.Test;

public class Demo5 {
	
	@Test(groups = {"Smoke"})
	public void Test13() {
		System.out.println("Test 13 is passed");
	}
	
	@Test
	public void Test14() {
		System.out.println("Test 14 is passed");
	}
	
   @Test 
   public void Test15() {
	   System.out.println("Test 15 is Passed");
   }

}
