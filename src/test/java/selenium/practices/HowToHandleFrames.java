package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='navbar-iframe']")));
		
		//Xpath is correct but it will give exception because our webelemet is inside frame tag so we have to handle
		//so we need switch to frame
		driver.findElement(By.xpath("//a[@id='b-getorpost']")).click();
		
		
	}

}
