package TestPratice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterXML {

	   
	   @Parameters("myName")
	   @Test
	   public void parameterTest(String myName) {
	      System.out.println("Parameterized value is : " + myName);
	   }
	
	   @Test
	   public void Method1() {
	      System.out.println("Method1");
	   }
	 // <parameter name = "myName" value="Attra"/> 
}
