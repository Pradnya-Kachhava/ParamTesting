package pradnya.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Utility;

public class TestNgSoftAssert {
	Utility util;
	
	SoftAssert verify= new SoftAssert();
	@Test
	public void verifyPageTitle() throws IOException
	{
		util=new Utility();
		WebDriver driver=util.getDriver();
		
		verify.assertEquals(driver.getTitle(), "omayo (QAFox.com)","title is equal 0");
		
		verify.assertTrue(driver.getTitle().equals("omayo (QAFox.com)"),"title is equal 1" );
		
		verify.assertNotEquals(driver.getTitle(), "omayo (QAFox.com)", "title is equal 2");
		System.out.println("After failure 1");
		
		verify.assertFalse(driver.getTitle().equals("omayo (QAFox.com)"), "title is equal 3");
		System.out.println("After failure 2");
		verify.assertAll();
		
		//driver.close();

	}

}
