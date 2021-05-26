package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	/*
	 * In TestNG we don't have main method at all
	 * 
	 * Copy url from testNG portal and go to help install s/w click on testng and
	 * finish after restart Right click on project and check TestNG should be shown
	 * Right Click on project build path--add libraries-->testng and add.
	 *
	 */

	// In TestNG we don't have main method at all--> if we don't have mainmethod then how can it will run.
	// there is something called as testNG annotations rep by @ with this help we can run
	// Here sequence steps is not matter it will execute by alphabetic order in order to test in sequence we use priorities
	
	@BeforeTest
	public void CreatingDBconn() {
		System.out.println("Connecting DB connection");
	}
	
	@AfterTest
	public void ClosingDBconn() {
		
		System.out.println("closing Db connection");
	}
	
	@BeforeMethod
	 public void  launchBrowser() {
		 System.out.println("Launching the browser");
	 }
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
    @Test(priority=1)                                  // annotation
	public void doUserReg() {

		System.out.println("Executing User Reg test");
	}
	@Test(priority=2) 
	public void doLogin() {

		System.out.println("Executing login test");
	}
    

	

}
