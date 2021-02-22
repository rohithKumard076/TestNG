package TestPratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyGroup {

	@Test(dependsOnGroups = { "unitTest","SmokeTest" })
	public void RegressionTest() {
		System.out.println("Regression Test Execution");
	}
	
	@Test(groups = { "unitTest" })
	public void unitTest() {
		//Assert.fail();
		System.out.println("Unit Test Execution");
	}
	
	@Test(groups = { "SmokeTest" })
	public void SmokeTest() {
		System.out.println("Smoke Test Execution");
	}
	
	
}
