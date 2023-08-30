package selenium.practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
 
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;

		WebElement checkThisButton=driver.findElement(By.xpath("//button[text()='Check this']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", checkThisButton);
		
		checkThisButton.click();

		//Fluent Wait
		WebElement mrOption=driver.findElement(By.xpath("//input[@id='dte']"));

		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(org.openqa.selenium.TimeoutException.class);
		wait.withTimeout(Duration.ofSeconds(11));
		wait.until(ExpectedConditions.elementToBeClickable(mrOption));
		
		mrOption.click();
	
	}
}
