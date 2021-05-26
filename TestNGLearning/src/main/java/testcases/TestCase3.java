package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase3{

	@Test
	public void validateTitles() {
		String expected_title = "yahoo.com"; // excel
		String actual_title = "Gmail.com"; // selinium

		System.out.println("Begining");

		SoftAssert softAssert = new SoftAssert();
		
		
		System.out.println("Valadating title");
		
		
		softAssert.assertEquals(actual_title, expected_title);

		// Assert.assertTrue(false,"Element not found"); //
		// IsElementPresent("Xpath)-true,false
		System.out.println("Valadating Image");
		softAssert.assertEquals(true, false,"image not present");

		System.out.println("Valadating textboxes presence");
		softAssert.assertEquals(true, false,"text box not present");

		// Assert.fail("failing the test as condition not match"); // forcefully

		System.out.println("Ending");
		
		softAssert.assertAll();

	}

}
