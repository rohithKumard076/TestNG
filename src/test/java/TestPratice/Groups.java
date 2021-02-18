package TestPratice;

import org.testng.annotations.Test;

@Test(groups = { "Regression" })
public class Groups {
	
	@Test(groups = {"Smoke"})
	public void Method1(){
		System.out.println("Smoke test case");
	}
	
	@Test(groups = {"Sanity"})
	public void Method2(){
		System.out.println("Sanity test case");
	}
	
	@Test(groups = {"Sanity","Integration"})
	public void Method3(){
		System.out.println("Integration test case");
	}
	
	@Test
	public void Method4(){
		System.out.println("Regression test case");
	}
}
