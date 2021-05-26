package regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void validateTitles() {

		String expected_title = "yahoo.com"; // excel
		String actual_title = "Gmail.com"; // selinium

		// if we need to fail the tes case if else is not correct, because still it will
		// shoe test case is passed
		// we need to use Assert

		/*
		 * if(expected_title.equals(actual_title)) {
		 * System.out.println("Test case is passed");
		 * 
		 * }else {
		 * 
		 * System.out.println("Test case is failed"); }
		 *
		 */

		Assert.assertEquals(actual_title, expected_title);
		// Assert.assertTrue(false,"Element not found"); //
		// IsElementPresent("Xpath)-true,false
		// Assert.fail("failing the test as condition not match"); // forcefully

	}

}
