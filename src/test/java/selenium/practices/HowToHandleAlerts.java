package selenium.practices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Alert alert=driver.switchTo().alert();
		
		// Senkeys is not working in alert
		//alert.sendKeys("Thanks For Alert");
		System.out.println(alert.getText());
		//alert.accept();  // done positive action click OK button
		alert.dismiss();  // done negative action click on Cancel Button
		
	}

}
