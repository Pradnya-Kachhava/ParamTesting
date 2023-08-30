package pradnya.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import utilities.Utility;

public class HardAssertProgram {
Utility util;
	// Like softAssert there no any class for HardAssert we just need to import statics here
	//SoftAssert verify= new SoftAssert();
	@Test
	public void verifyPageTitle() throws IOException
	{
		util=new Utility();
		WebDriver driver=util.getDriver();
		
		assertEquals(driver.getTitle(), "omayo (QAFox.com)","title is equal 0");
		
		assertTrue(driver.getTitle().equals("omayo (QAFox.com)"),"title is equal 1" );
		
		assertNotEquals(driver.getTitle(), "omayo (QAFox.com)", "title is equal 2");
		System.out.println("After failure 1");
		
		assertFalse(driver.getTitle().equals("omayo (QAFox.com)"), "title is equal 3");
		System.out.println("After failure 2");
		//assertAll(); // in hard asserts no need used assertAll method
		
		//driver.close();

}
}
