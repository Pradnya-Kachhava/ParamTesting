package selenium.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class FileUploadInSelenium {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
 
		WebElement fileUploader=driver.findElement(By.xpath("//input[@id='uploadfile']"));
		fileUploader.sendKeys("C:/Users/Nitin Kachhava/Documents/userData.xlsx");
		
		
	}

}
