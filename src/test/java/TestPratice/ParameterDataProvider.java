package TestPratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterDataProvider {

	@DataProvider(name = "test1")
	public static Object[][] userCredentials() {
	      return new Object[][] {{"User1", "Password1"}, {"User2", "Password2"}, {"User3", "Password3"},{"User4", "Password4"}};
	}
	
	@Test(dataProvider = "test1")
	public void testUserLogin(String username, String Password) {
	      System.out.println(username + " " + Password);
	}
}
