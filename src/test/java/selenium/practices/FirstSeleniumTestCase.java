package selenium.practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		//driver.close();
	}

}
