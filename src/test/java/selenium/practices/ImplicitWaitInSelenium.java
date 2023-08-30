package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
 
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;

		WebElement checkThisButton=driver.findElement(By.xpath("//button[text()='Check this']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", checkThisButton);
		
		checkThisButton.click();
		
		WebElement mrOption=driver.findElement(By.xpath("//input[@id='dte']"));

		mrOption.click();
		

	}

}
