package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class prmdp {
	
	@DataProvider(name="URL")
	public Object[][] URL(){
		return new Object[][]  {{"www.amazon.in"},{"www.flipkart.in"}};
	}
	@Test(dataProvider="URL")
	public void test1(String url) {
		System.out.println("the urls are: "+url);
	}
	@DataProvider(name="login")
	public Object[][] login(){
		return new Object[][] {{"username"},{"password"}};
		
	}
	@Test(dataProvider="login")
	public void test2(String Login) {
		System.out.print("the login page: "+Login);
	}
}

