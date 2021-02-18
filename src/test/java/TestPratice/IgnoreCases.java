package TestPratice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class IgnoreCases {
	
	@Test(enabled = false)
	public void method1() {
		System.out.println("Method1");
	}
	
	@Test
	public void method2() {
		Assert.fail();
	}

	@Test(dependsOnMethods = "method2",alwaysRun=true)
	public void method3() {
		System.out.println("Method3");
	}
}
