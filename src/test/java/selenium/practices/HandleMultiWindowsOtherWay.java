package selenium.practices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiWindowsOtherWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='selenium143']")).click();
		String currentWindowhandle = driver.getWindowHandle();
		
		Set<String> allWindowshandle=driver.getWindowHandles();
		
		for(String handle:allWindowshandle)
		{
			if(handle.equals(currentWindowhandle))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(handle);

			}

		}
		
		System.out.println(driver.findElement(By.xpath("//a[text()='What is Selenium?']")).getText());
		//goes to previous window 
		driver.switchTo().window(currentWindowhandle);
		//then we can perform this commands otherwise we get exception
		driver.findElement(By.cssSelector("input#radio1")).click();
		
		driver.findElement(By.cssSelector("input#radio2")).click();

	}

}
