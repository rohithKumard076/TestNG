package TestPratice;

import java.util.Calendar;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	@BeforeTest
	public void StartExecution() {
		System.out.println("Execution started time-"+Calendar.getInstance().getTime());
	}
	
	@Test
	public void method1() throws InterruptedException {
		System.out.println("Execution of method1");
		Thread.sleep(3000);
	}
	
	@Test
	public void method2() throws InterruptedException {
		System.out.println("Execution of method2");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void EndExecution() {
		System.out.println("Execution end time-"+Calendar.getInstance().getTime());
	}
	
	//parallel="methods" thread-count="2"
}
