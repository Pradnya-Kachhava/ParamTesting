package selenium.practices;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Utility;

public class SynchronizationInSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();
 
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;

		WebElement checkThisButton=driver.findElement(By.xpath("//button[text()='Check this']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", checkThisButton);
		
		checkThisButton.click();

		//Explicit Wait
		
		WebElement mrOption=driver.findElement(By.xpath("//input[@id='dte']"));
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(11));
		wait.until(ExpectedConditions.elementToBeClickable(mrOption));

		mrOption.click();
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		WebElement gmailLink=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		//wait.until(ExpectedConditions.invisibilityOf(gmailLink));
		//gmailLink.click();
		//wait.until(ExpectedConditions.elementToBeClickable(gmailLink)).click();
		
		wait.until(ExpectedConditions.visibilityOf(gmailLink)).click();
		 
		// If we used invisibityOf command then have to use javascript here
		//javascriptExecutor.executeScript("arguments[0].click();", gmailLink);  


	}
	
}
