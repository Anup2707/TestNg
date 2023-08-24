package Testing;




import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void Test1() {
		
		
			
	}
	
	@Test (invocationCount=5)  
	public void Test2() {
		System.out.println("Test 2 is passed");
		}
	
	@ Test
	public void Test3() {
		System.out.println("Test 3 is passed");
	}
	}


