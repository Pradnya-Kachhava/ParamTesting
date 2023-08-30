package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSelectDropDownUsingMethod {

	public static void main(String[] args) {

		NoSelectDropDownUsingMethod select=new NoSelectDropDownUsingMethod();
		select.selectOptionsFromDropDown("thailand");
	}

	public void selectOptionsFromDropDown(String country) {

		WebDriver driver = getDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/en");
		
		driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
		
		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));

		for (WebElement con : countries) {
			if (con.getText().equalsIgnoreCase(country)) {
				con.click();
			}
		}

	}

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		return driver;
	}
}
