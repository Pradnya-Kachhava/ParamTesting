package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOptionsFromNonSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airvistara.com/en");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//img[contains(@src,'dropdown')]")).click();
		List<WebElement> countries=driver.findElements(By.xpath("//ul[@id='country-scroll']//li/span"));
		
		for(WebElement country:countries)
		{
		 if(country.getText().equalsIgnoreCase("Qatar"))
		 {
			 country.click();
		 }
		}

	}

}
