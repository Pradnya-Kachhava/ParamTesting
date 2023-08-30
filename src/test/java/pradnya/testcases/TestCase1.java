package pradnya.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Utility;


/*Testcase1 URL ->  omayo -- 
 * Title :  verify Main page title
 * Step	:	1) Launch browser
 * 			2) Launch ur application
 * 			3) wait till page load
 * 			4) Verify page title
 * Expected Result : Page Title Should be  "omayo (QAFox.com)"
 */


public class TestCase1 {
	
	Utility util;
	@Test
	public void verifyPageTitle() throws IOException
	{
		util=new Utility();
		WebDriver driver=util.getDriver();
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		driver.close();
	}

}
