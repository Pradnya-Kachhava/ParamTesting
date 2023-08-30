package selenium.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.Utility;

public class ActionClassInSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();

		Actions actions=new Actions(driver);
		
		// Code for mouse hover
		//WebElement blogs=driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		//actions.moveToElement(blogs).build().perform();
		
		//
		WebElement textField=driver.findElement(By.xpath("//textarea[@id='ta1']"));
		actions.keyDown(textField,"A").keyUp("a").build().perform();
		
		//actions.keyDown(textField,Keys.SHIFT).sendKeys("pradnya").build().perform();
		
		//actions.keyUp(textField, Keys.LEFT_SHIFT).sendKeys("ANVIKA").build().perform();

		// For write click on webElement
		actions.contextClick(textField).build().perform();
		
		
	}

}
