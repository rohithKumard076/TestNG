package TestPratice;

import org.testng.annotations.Test;

public class PriorityMethods {
	
	@Test(priority=1)
	public void Method1() {
		System.out.println("Execution Method1");
	}
	
	@Test(priority=3)
	public void Method2() {
		System.out.println("Execution Method2");
	}
	
	@Test(priority=4)
	public void Method3() {
		System.out.println("Execution Method3");
	}
	
	@Test(priority=2)
	public void Method4() {
		System.out.println("Execution Method4");
	}

}
