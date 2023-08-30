package selenium.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement maleRadioButton =driver.findElement(By.xpath("//input[@id='radio1']"));
		//WebElement femaleRadioButton =driver.findElement(By.xpath("//input[@id='radio2']"));

		WebElement femaleRadioButton = driver.findElement(By.cssSelector("input#radio2"));
		
		//WebElement femaleRadioButton = driver.findElement(By.id("radio2"));
		//It will throws NoSuchElementException
		//WebElement femaleRadioButton = driver.findElement(By.cssSelector("input#abc"));

		maleRadioButton.click();
		//Thread.sleep(5000);
		femaleRadioButton.click();
		
		//if findelements unable to find any element it will return Empty list
		List <WebElement> buttons=driver.findElements(By.tagName("Button"));
		System.out.println("Number of Buttons On webpage =" +buttons.size());
		
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource()); 
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
