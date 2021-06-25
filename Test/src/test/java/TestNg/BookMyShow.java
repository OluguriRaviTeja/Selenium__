package TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookMyShow {
	
	private static final boolean False = false;
	@BeforeSuite
	public void run_suite() {
		System.out.println("the Before__suite....");
	}
	@BeforeClass
	public void run_Class() {
		System.out.println("the before__class");
	}
	@AfterSuite
	public void run_ASuite() {
		System.out.println("the After--suite");
	}
	@AfterClass
	public void run_AClass() {
		System.out.println("the After---Class");
	}

	@BeforeTest
	public void run()
	{
		System.out.println("The before test  first");
	}
	@Test
	public void Movies_TestCase1() {
		System.out.println("the Movie tickets");
	}
	@Test
	public void Stream_TestCase2() {
		Assert.assertEquals(false, true);
		System.out.println("the Stream ..");
	}
	@Test
	public void Events_TestCase3() {
		System.out.println("The Events..");
	}
	@Test(enabled=False)
	public void Plays_TestCase4() {
		System.out.println("the Plays...");
	}
	@BeforeMethod
	public void run_method() {
		System.out.println("The before method");
	}
	@AfterTest
	public void run_after() {
		System.out.println("The after testcase run at last");
	}
	@AfterMethod
	public void run_aftermethod() {
		System.out.println("the After method... ");
	}
		
}
