package TestPratice;

import org.testng.annotations.Test;

public class DependencyMethods {
	
	@Test
	public void initializationMethod() {
		System.out.println("Initilization the envr");
		//Assert.fail();
	}
	
	@Test(dependsOnMethods = { "initializationMethod" })
	public void Execution() {
		System.out.println("Executing the test");
	}
}
