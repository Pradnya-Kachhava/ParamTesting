package selenium.practices;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

//import java.io.File;

import org.apache.commons.io.*;

//import java.awt.Point;
import org.openqa.selenium.*;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement searchTextBox=driver.findElement(By.xpath("//input[@title='search' and @name='q']"));
		
		//sendKeys used to send text on testfield
		searchTextBox.sendKeys("Mobile");
		
		//Thread.sleep(5000);
		searchTextBox.clear();
		
		System.out.println(searchTextBox.getAttribute("class"));
		
		//searchTextBox.isEnabled();
		
		//it is used to verified specified webelement is display on webpage
		System.out.println(searchTextBox.isDisplayed());
		System.out.println(searchTextBox.getAccessibleName());
		System.out.println(searchTextBox.getAriaRole());
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.cssSelector("button.dropbtn")).getCssValue("border"));
		
		Point p = searchTextBox.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		File file=searchTextBox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src/test/resources/screenshots/textboxsceenshots.png"));
		
		System.out.println(searchTextBox.getTagName());
		
		System.out.println(driver.findElement(By.xpath("//button[@id='but2']")).getText());
		
		Dimension d=searchTextBox.getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		
		//searchTextBox.submit();  // same as click method but used in form (gmail..)to submit
		
		
		
		
		WebElement al=driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
		al.sendKeys("pradnyapatil@gmail.com");
		System.out.println(al.getAttribute("value"));
	}

}
