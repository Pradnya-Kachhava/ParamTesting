package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleSingleSelectDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement singleDropDown=driver.findElement(By.xpath(" //select[@id='drop1']"));
		Select singleSelectDropDown = new Select(singleDropDown);
		
		System.out.println(singleSelectDropDown.isMultiple());
		singleSelectDropDown.selectByIndex(4);
		singleSelectDropDown.selectByValue("mno");
		singleSelectDropDown.selectByVisibleText("doc 3");
		
		System.out.println(singleSelectDropDown.getFirstSelectedOption().getText());
		
		singleSelectDropDown.getOptions();


	}

}
