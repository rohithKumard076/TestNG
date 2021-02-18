package TestPratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	public void assertEquals() {
		Assert.assertEquals("Hello", "Hello", "Matched successfully");
	}

	@Test
	public void assertNull() {
		Assert.assertNull( null, "Matched successfully");
	}
	
	@Test
	public void assertTrue() {
		Assert.assertTrue(true, "Condition matched successfully");
	}
	
	@Test
	public void assertFail() {
		Assert.fail("Failing the test");
	}
	
}
