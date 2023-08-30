package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingInSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		NoSelectDropDownUsingMethod sel=new NoSelectDropDownUsingMethod();
		driver=sel.getDriver();
		driver.get("http://omayo.blogspot.com/");
		//driver.navigate().to("http://omayo.blogspot.com/");
		
		driver.manage().window().maximize(); 

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		//scroll vertically down
		javascriptExecutor.executeScript("window.scrollTo(0, 1000)","");
		
		Thread.sleep(1000);
		
		//scroll vertically up
		javascriptExecutor.executeScript("window.scrollTo(0, -500)","");
		Thread.sleep(1000);

		//Scroll horizontally right
		javascriptExecutor.executeScript("window.scrollTo(100, 0)","");
		Thread.sleep(1000);

		//Scroll horizontally left
		javascriptExecutor.executeScript("window.scrollTo(-100, 0)","");
		Thread.sleep(1000);

		//Scroll to view web element
		
		WebElement link=driver.findElement(By.xpath("//a[text()='Blogger']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView();", link);
		
		javascriptExecutor.executeScript("arguments[0].click();", link);


	}

}
